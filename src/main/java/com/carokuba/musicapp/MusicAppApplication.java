package com.carokuba.musicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicAppApplication.class, args);

		System.out.println("Music App started");

		System.out.println("hice otro cambio pero quiero stashearlo");
		System.out.println("soy otra rama");

		System.out.println("otro cambio mas");

		System.out.println("hago cambio en start message");

	}
}
