package com.diguits.javafx.log;

import javafx.application.Platform;
import javafx.scene.control.TextArea;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;

import java.io.Serializable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * TextAreaAppender for Log4j 2
 */
@Plugin(name = "TextAreaAppender", category = "Core", elementType = "appender", printObject = true)
public final class TextAreaAppender extends AbstractAppender {

	/**
	 *
	 */
	private static final long serialVersionUID = 4456949163840610603L;

	private static TextArea textArea;

	private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
	private final Lock readLock = rwLock.readLock();

	protected TextAreaAppender(String name, Filter filter, Layout<? extends Serializable> layout,
			final boolean ignoreExceptions) {
		super(name, filter, layout, ignoreExceptions);
	}

	/**
	 * This method is where the appender does the work.
	 *
	 * @param event
	 *            Log event with log data
	 */
	@Override
	public void append(LogEvent event) {
		readLock.lock();
		final String message = new String(getLayout().toByteArray(event));

		// append log text to TextArea
		try {
			Platform.runLater(() -> {
				try {
					if (textArea != null) {
						if (textArea.getText().length() == 0) {
							textArea.setText(message);
						} else {
							textArea.selectEnd();
							textArea.insertText(textArea.getText().length(), message);
						}
					}
				} catch (final Throwable t) {
					System.out.println("Error while append to TextArea: " + t.getMessage());
				}
			});
		} catch (final IllegalStateException ex) {
			ex.printStackTrace();

		} finally {
			readLock.unlock();
		}
	}

	/**
	 * Factory method. Log4j will parse the configuration and call this factory
	 * method to construct the appender with the configured attributes.
	 *
	 * @param name
	 *            Name of appender
	 * @param layout
	 *            Log layout of appender
	 * @param filter
	 *            Filter for appender
	 * @return The TextAreaAppender
	 */
	@PluginFactory
	public static TextAreaAppender createAppender(@PluginAttribute("name") String name,
			@PluginElement("Layout") Layout<? extends Serializable> layout,
			@PluginElement("Filter") final Filter filter) {
		if (name == null) {
			// LOGGER.error("No name provided for TextAreaAppender");
			return null;
		}
		if (layout == null) {
			layout = PatternLayout.createDefaultLayout();
		}
		return new TextAreaAppender(name, filter, layout, true);
	}

	/**
	 * Set TextArea to append
	 *
	 * @param textArea
	 *            TextArea to append
	 */
	public static void setTextArea(TextArea textArea) {
		TextAreaAppender.textArea = textArea;
	}
}