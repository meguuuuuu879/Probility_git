
package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {

	//DI
	private final UserMapper userMapper;

	@Override //insert
	public void insert(User user) {
		userMapper.insert(user);
	}
	/*
	
	public List<User> findAllUser(){
	
			return userMapper.selectAll();
	
		}
	
		@Override //update
		public void update(User user) {
			userMapper.update(user);
		}
	
		@Override //delete
		public void delete(Integer id) {
			user.Mapper.delete(id);
		}
	*/

}