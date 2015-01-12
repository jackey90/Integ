package com.ea.autoEx.integ.dal.base;

import java.util.Date;

public class BaseDBModel<K> {

    protected K           id;
    protected Date             createTime;
    protected Date             lastModifyTime;
    protected String           creator;
    protected String           modifier;
    protected String           isDeleted;
    
	public K getId() {
		return id;
	}
	public void setId(K id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public String getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

    
}
