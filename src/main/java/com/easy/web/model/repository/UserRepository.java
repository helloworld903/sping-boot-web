package com.easy.web.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.easy.web.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
	User findByUserName(String userName);
	User findByUserNameOrEmail(String username,String email);
}
