package com.mh.music.moviematcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.mh" })
public class MoviematcherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviematcherApplication.class, args);
	}

}
