package com.ea.autoEx.integ.dal.dbmodel;

import java.io.Serializable;
import java.math.BigDecimal;

import com.ea.autoEx.integ.dal.base.BaseDBModel;

public class TestResultDB extends BaseDBModel<Long> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long testCaseId;
	private TestCaseResultStatus status;
	private String errorDetails;
	private String errorStackTrace;
	private String stdout;
	private BigDecimal durationTime;
	
	public long getTestCaseId() {
		return testCaseId;
	}
	public void setTestCaseId(long testCaseId) {
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
