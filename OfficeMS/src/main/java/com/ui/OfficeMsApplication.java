package com.ui;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class OfficeMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfficeMsApplication.class, args);
		LocalDate currentDate = LocalDate.of(2022, 07, 19);
		LocalDate preveDate = LocalDate.of(2022, 07, 16);
		if(currentDate.minusDays(2).isEqual(preveDate))
			System.out.println(currentDate+" registreation is close");
	}
  
}
