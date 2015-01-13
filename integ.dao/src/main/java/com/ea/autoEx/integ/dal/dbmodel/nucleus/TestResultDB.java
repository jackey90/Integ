package com.ea.autoEx.integ.dal.dbmodel.nucleus;

import java.io.Serializable;
import java.math.BigDecimal;

import com.ea.autoEx.integ.dal.base.BaseDBModel;

public class TestResultDB extends BaseDBModel<Long> implements Serializable {

	private static final Long serialVersionUID = 1L;

	private Long testCaseId;
	private TestCaseResultStatus status;
	private String errorDetails;
	private String errorStackTrace;
	private String stdout;
	private BigDecimal durationTime;

	public Long getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(Long testCaseId) {
		this.testCaseId = testCaseId;
	}

	public TestCaseResultStatus getStatus() {
		return status;
	}

	public void setStatus(TestCaseResultStatus status) {
		this.status = status;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	public String getErrorStackTrace() {
		return errorStackTrace;
	}

	public void setErrorStackTrace(String errorStackTrace) {
		this.errorStackTrace = errorStackTrace;
	}

	public String getStdout() {
		return stdout;
	}

	public void setStdout(String stdout) {
		this.stdout = stdout;
	}

	public BigDecimal getDurationTime() {
		return durationTime;
	}

	public void setDurationTime(BigDecimal durationTime) {
		this.durationTime = durationTime;
	}

}
