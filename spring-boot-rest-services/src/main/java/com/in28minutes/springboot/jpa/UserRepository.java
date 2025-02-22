package com.in28minutes.springboot.jpa;

import java.util.List;

import com.in28minutes.springboot.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByRole(String role);
}
