package com.ea.autoEx.integ.dal.dbmodel.nucleus;

import java.io.Serializable;

import com.ea.autoEx.integ.dal.base.BaseDBModel;

public class BundleDB extends BaseDBModel<Long> implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long muduleId;
	private String brunch;
	private String bundleName;
	private String goals;
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

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getPomPath() {
		return pomPath;
	}

	public void setPomPath(String pomPath) {
		this.pomPath = pomPath;
	}

}
