package com.commitgit.commitingtogit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CommitingToGitApplication {
	
	@GetMapping("/")
	public String message() {
		return "Welcome to the REST service";
	}

	public static void main(String[] args) {
		SpringApplication.run(CommitingToGitApplication.class, args);
	}

}
