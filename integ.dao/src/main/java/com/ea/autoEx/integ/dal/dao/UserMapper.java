package com.ea.autoEx.integ.dal.dao;

import java.util.List;

import com.ea.autoEx.integ.dal.model.User;

public interface UserMapper {
	User getUserById(Long userId);

	List<User> getAllUser();

	void deleteUser(Long userId);

	void addUser(User user);
}
