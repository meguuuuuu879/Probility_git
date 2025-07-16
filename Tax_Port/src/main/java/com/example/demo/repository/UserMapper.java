package com.example.demo.repository;
//リポジトリはリポジトリは動詞

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {

	void insert(User user);

}
