package com.ea.autoEx.integ.dal.dbmodel.jenkins;

import java.io.Serializable;

import com.ea.autoEx.integ.dal.base.BaseDBModel;

public class JenkinsJobDB extends BaseDBModel<Long> implements Serializable {
	
	/**
	 *  Jan 13, 2015
	 */
	private static final long serialVersionUID = 1L;
	private Long jenkinsMasterId;
	private Long rootModuleId;
	private String viewName;
	private String jobName;
	private String rootPom;
	private String goals;
	
	public Long getJenkinsMasterId() {
		return jenkinsMasterId;
	}
	public void setJenkinsMasterId(Long jenkinsMasterId) {
		this.jenkinsMasterId = jenkinsMasterId;
	}
	public Long getRootModuleId() {
		return rootModuleId;
	}
	public void setRootModuleId(Long rootModuleId) {
		this.rootModuleId = rootModuleId;
	}
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getRootPom() {
		return rootPom;
	}
	public void setRootPom(String rootPom) {
		this.rootPom = rootPom;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	
	
	
	
}
