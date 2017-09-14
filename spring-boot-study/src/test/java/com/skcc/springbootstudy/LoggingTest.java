package com.skcc.springbootstudy;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingTest {
	private final Logger logger = LoggerFactory.getLogger(LoggingTest.class);
	
	@Test
	public void test() {
		logger.debug("debug log");
		logger.info("info");
	}
}
