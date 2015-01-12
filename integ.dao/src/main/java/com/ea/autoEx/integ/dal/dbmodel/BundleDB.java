package com.ea.autoEx.integ.dal.dbmodel;

import java.io.Serializable;

import com.ea.autoEx.integ.dal.base.BaseDBModel;

public class BundleDB extends BaseDBModel<Long> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String brunch;
	private String bundleName;
	private String goal;
	private String pomPath;
	
	public String getBrunch() {
		return brunch;
	}
	public void setBrunch(String brunch) {
		this.brunch = brunch;
	}
	public String getBundleName() {
		return bundleName;
	}
	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getPomPath() {
		return pomPath;
	}
	public void setPomPath(String pomPath) {
		this.pomPath = pomPath;
	}
	
	
	
}
