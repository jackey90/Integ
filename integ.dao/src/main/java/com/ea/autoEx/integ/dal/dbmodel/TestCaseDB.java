package com.ea.autoEx.integ.dal.dbmodel;

import java.io.Serializable;

import com.ea.autoEx.integ.dal.base.BaseDBModel;

public class TestCaseDB extends BaseDBModel<Long> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long bundleId;
	private long typeId;
	private String branch;
	private String bundle;
	private String className;
	private String testCaseName;
	
	public long getBundleId() {
		return bundleId;
	}
	public void setBundleId(long bundleId) {
		this.bundleId = bundleId;
	}
	public long getTypeId() {
		return typeId;
	}
	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBundle() {
		return bundle;
	}
	public void setBundle(String bundle) {
		this.bundle = bundle;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTestCaseName() {
		return testCaseName;
	}
	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}
	
	
}
