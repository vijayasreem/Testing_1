package com.sample.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.test.model.Registration;
import com.sample.test.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	public Optional<Registration> findByUserName(String userName) {
		return registrationRepository.findByUserName(userName);
	}
	
	public Optional<Registration> findByEmail(String email) {
		return registrationRepository.findByEmail(email);
	}
	
	public boolean existsByUserName(String userName) {
		return registrationRepository.existsByUserName(userName);
	}
	
	public boolean existsByEmail(String email) {
		return registrationRepository.existsByEmail(email);
	}
	
	public void deleteByUserName(String userName) {
		registrationRepository.deleteByUserName(userName);
	}
	
	public void deleteByEmail(String email) {
		registrationRepository.deleteByEmail(email);
	}
	
	public void save(Registration registration) {
		registrationRepository.save(registration);
	}

}