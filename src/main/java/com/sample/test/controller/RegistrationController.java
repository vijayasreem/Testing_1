package com.sample.test.controller; 

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.test.model.Registration;
import com.sample.test.service.RegistrationService;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping("/user")
	public Optional<Registration> findByUserName(@RequestParam String userName) {
		return registrationService.findByUserName(userName);
	}
	
	@GetMapping("/email")
	public Optional<Registration> findByEmail(@RequestParam String email) {
		return registrationService.findByEmail(email);
	}
	
	@DeleteMapping("/user")
	public void deleteByUserName(@RequestParam String userName) {
		registrationService.deleteByUserName(userName);
	}
	
	@DeleteMapping("/email")
	public void deleteByEmail(@RequestParam String email) {
		registrationService.deleteByEmail(email);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Registration registration) {
		registrationService.save(registration);
	}

}