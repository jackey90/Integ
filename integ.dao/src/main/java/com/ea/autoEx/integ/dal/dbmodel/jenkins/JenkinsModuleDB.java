package com.ea.autoEx.integ.dal.dbmodel.jenkins;

import java.io.Serializable;

import com.ea.autoEx.integ.dal.base.BaseDBModel;

public class JenkinsModuleDB  extends BaseDBModel<Long> implements Serializable {
	
	private Long jenkinsJobId;
	private Long nucleusModuleId;
	private String path;
	
	
}
