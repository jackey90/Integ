package com.ea.autoEx.integ.dal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ea.autoEx.integ.dal.model.User;

public interface UserMapper {
	
	@Select("SELECT * FROM i_user as t WHERE t.id=#{userId}")
	User getUserById(Long userId);

//	List<User> getAllUser();
//
//	void deleteUser(Long userId);
//
//	void addUser(User user);
}
