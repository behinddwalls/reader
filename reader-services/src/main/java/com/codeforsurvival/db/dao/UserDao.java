package com.codeforsurvival.db.dao;

import java.util.List;

import com.codeforsurvival.db.entity.User;

public interface UserDao {
	public User addUser(User user);

	public List<User> getAllUsers();

	public User getUserById(Long userId);

	public User getUserByUsername(String username);

	public User deleteUserById(Long userId);

	public User deleteUser(User user);
}
