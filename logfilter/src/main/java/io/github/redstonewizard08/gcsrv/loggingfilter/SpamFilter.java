package io.github.redstonewizard08.gcsrv.loggingfilter;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.core.filter.AbstractFilter;

public class SpamFilter extends AbstractFilter {
	public static Result filter(String message) {
		for(String s : FilterConfig.filterBlacklist) {
			if (message.toLowerCase().contains(s.toLowerCase())) {
				return Result.DENY;
			}
		}

		return null;
	}

	@Override
	public Result filter(LogEvent event) {
		return filter(event.getMessage().getFormattedMessage());
	}

	@Override
	public Result filter(Logger logger, Level level, Marker marker, String msg, Object... params) {
		return filter(msg);
	}

	@Override
	public Result filter(Logger arg0, Level arg1, Marker arg2, Message msg, Throwable arg4) {
		return filter(msg.getFormattedMessage());
	}
}
