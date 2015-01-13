package com.ea.autoEx.integ.dal.dbmodel.jenkins;

import java.io.Serializable;

import com.ea.autoEx.integ.dal.base.BaseDBModel;

public class JenkinsBuildDB extends BaseDBModel<Long> implements Serializable{
	
	private long number;
	private long startTime;
	
}
