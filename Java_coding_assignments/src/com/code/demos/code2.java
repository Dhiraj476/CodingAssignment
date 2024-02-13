package com.code.demos;

import java.time.LocalDate;

public class code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate initialDate = LocalDate.of(2024, 2, 12);
		
		int adddays =10;
		
		LocalDate newDate = initialDate.plusDays(adddays);
		System.out.println(newDate);

	}

}
