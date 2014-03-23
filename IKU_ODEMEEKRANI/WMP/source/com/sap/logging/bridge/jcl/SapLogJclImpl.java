package com.sap.logging.bridge.jcl;

import java.io.Serializable;

import org.apache.commons.logging.Log;

import com.sap.tc.logging.Category;
import com.sap.tc.logging.Location;
import com.sap.tc.logging.Severity;

public class SapLogJclImpl implements Log, Serializable {
	
	final String CATEGORY_NAME = "ODEMEEKRANI";
	
	Location loc;
	/** Name for the category under "\System\Applications\<category_Name>"*/
	Category cat = Category.getCategory(Category.APPLICATIONS, CATEGORY_NAME);

	public SapLogJclImpl() {
	}

	public SapLogJclImpl(String name) {
		loc = Location.getLocation(name);
	}

	public boolean isDebugEnabled() {
		return Severity.DEBUG >= loc.getEffectiveSeverity();
	}

	public boolean isErrorEnabled() {
		return Severity.DEBUG >= loc.getEffectiveSeverity();
	}

	public boolean isFatalEnabled() {
		return Severity.FATAL >= loc.getEffectiveSeverity();
	}

	public boolean isInfoEnabled() {
		return Severity.INFO >= loc.getEffectiveSeverity();
	}

	public boolean isTraceEnabled() {
		return Severity.DEBUG >= loc.getEffectiveSeverity();
	}

	public boolean isWarnEnabled() {
		return Severity.WARNING >= loc.getEffectiveSeverity();
	}

	public void trace(Object msg) {
		logToSap(msg.toString(), null, Severity.DEBUG);
	}

	public void trace(Object msg, Throwable ta) {
		logToSap(msg.toString(), ta, Severity.DEBUG);
	}

	public void debug(Object msg) {
		logToSap(msg.toString(), null, Severity.DEBUG);
	}

	public void debug(Object msg, Throwable ta) {
		logToSap(msg.toString(), ta, Severity.DEBUG);
	}

	public void info(Object msg) {
		logToSap(msg.toString(), null, Severity.INFO);
	}

	public void info(Object msg, Throwable ta) {
		logToSap(msg.toString(), ta, Severity.INFO);
	}

	public void warn(Object msg) {
		logToSap(msg.toString(), null, Severity.WARNING);
	}

	public void warn(Object msg, Throwable ta) {
		logToSap(msg.toString(), ta, Severity.WARNING);

	}

	public void error(Object msg) {
		logToSap(msg.toString(), null, Severity.ERROR);
	}

	public void error(Object msg, Throwable ta) {
		logToSap(msg.toString(), ta, Severity.ERROR);
	}

	public void fatal(Object msg) {
		logToSap(msg.toString(), null, Severity.FATAL);
	}

	public void fatal(Object msg, Throwable ta) {
		logToSap(msg.toString(), ta, Severity.FATAL);
	}

	private void logToSap(String msg, Throwable ta, int severity) {

		// in case of a unknown severity -> set severity WARNING and add information	
		if (severity == -1) {
			severity = Severity.WARNING;
			msg += " (Couldn't identify severity of log4j-Logging Event!)";
		}

		// log-level DEBUG will be written to default trace
		if (severity == Severity.DEBUG) {
			if (ta == null)
				loc.logT(severity, msg);
			else // for log messages with throwables
				loc.traceThrowableT(severity, msg, ta);

			// everything else will be written to the application.log in the configured category
		} else {

			if (ta == null)
				cat.logT(severity, loc, msg);
			else // for log messages with throwables
				cat.logThrowableT(severity, loc, msg, ta);
		}
	}

}
