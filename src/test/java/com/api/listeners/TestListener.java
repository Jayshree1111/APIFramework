package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	private static final Logger logger = LogManager.getLogger(TestListener.class);

	public void onStart(ITestContext context) {
		logger.info("===== Test Suite Started: " + context.getName() + " =====");
	}

	public void onFinish(ITestContext context) {
		logger.info("===== Test Suite Finished: " + context.getName() + " =====");
	}

	public void onTestSuccess(ITestResult result) {
		logger.info(">>> Test PASSED: " + result.getMethod().getMethodName());
		logger.info(">>> Test PASSED: " + result.getMethod().getDescription());
	}

	public void onTestFailure(ITestResult result) {
		logger.error(">>> Test FAILED: " + result.getMethod().getMethodName());

		// Print exception
		logger.error("Reason: ", result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		logger.warn(">>> Test SKIPPED: " + result.getMethod().getMethodName());
	}

}
