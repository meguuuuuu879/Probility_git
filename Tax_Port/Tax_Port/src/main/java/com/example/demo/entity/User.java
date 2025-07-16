package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

	//User控除額
	private Integer deducation;

	//User収入
	private Integer income;

	//Userランク
	private String lank;
	
	
	
	//emailと名前(未実装)
	private String name;
	private String email;
	
	//UserID
	private Integer id;
	
	//作成日時
	private LocalDateTime createdAt;

}
