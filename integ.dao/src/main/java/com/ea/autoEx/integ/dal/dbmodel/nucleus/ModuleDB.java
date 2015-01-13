package com.ea.autoEx.integ.dal.dbmodel.nucleus;

import java.io.Serializable;

import com.ea.autoEx.integ.dal.base.BaseDBModel;

public class ModuleDB extends BaseDBModel<Long> implements Serializable {

	/**
	 * Jan 13, 2015
	 */
	private static final long serialVersionUID = 1L;

	private Long parentId;
	private String artifactId;
	private String groupId;
	private String version;
	private String packaging;
	private String name;
	private String relativePath;

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelativePath() {
		return relativePath;
	}

	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
	}

}
