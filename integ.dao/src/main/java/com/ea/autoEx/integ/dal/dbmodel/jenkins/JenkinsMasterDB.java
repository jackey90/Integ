package com.ea.autoEx.integ.dal.dbmodel.jenkins;

import java.io.Serializable;

import com.ea.autoEx.integ.dal.base.BaseDBModel;

public class JenkinsMasterDB extends BaseDBModel<Long> implements Serializable {
	private String name;
	private String ip;
	private String port;
	private String url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	
}