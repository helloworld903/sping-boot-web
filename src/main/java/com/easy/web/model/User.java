package com.easy.web.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable=false, unique=true)
	private  String userName;
	@Column(nullable=false)
	private String passWord;
	@Column(nullable=false,unique=true)
	private String email;
	@Column(unique=true)
	private String nickName;
	@Column(nullable=false)
	private String regTime;
	
	public User() {
		super();
	}
	
	public User(String nickName,String email,String userName,String passWord,String regTime) {
		super();
		this.email=email;
		this.nickName=nickName;
		this.passWord=passWord;
		this.userName=userName;
		this.regTime=regTime;
	}
	
}

/*
JPA提供了四种主键生成策略(@GeneratedValue)：
	IDENTITY：使用数据库自增长字段来生成主键值；
	SEQUENCE：使用数据库序列来生成主键值；
	TABLE：使用表来存储主键值；
	AUTO：根据数据库类型和驱动自动选择一种主键生成策略。
*/