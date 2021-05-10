package com.courierCompany.com.project.courierCompany;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JspLogger {
	
	public static final Logger _logger = LoggerFactory.getLogger(JspLogger.class);
	
	public static void jspPage() {
		_logger.info("Switched to JSP page.");
	}
	public static void scriptPage() {
		_logger.info("Switched to script.js page.");
	}
}
