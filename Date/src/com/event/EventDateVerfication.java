package com.event;

import java.time.LocalDate;

public class EventDateVerfication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate participanteDate = LocalDate.now();
		System.out.println(participanteDate);
		LocalDate eventDate = LocalDate.of(2022, 07, 21);
		if(eventDate.minusDays(2).isEqual(participanteDate))
			System.out.println("event is open");

	}

}
