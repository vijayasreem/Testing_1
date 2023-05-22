package com.sample.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.test.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long>{
	
	Registration findByUserName(String userName);
	
	Registration findByEmail(String email);
	
	boolean existsByUserName(String userName);
	
	boolean existsByEmail(String email);
	
	void deleteByUserName(String userName);
	
	void deleteByEmail(String email);
	
}