package com.apjp.backend;

import java.sql.Time;
import java.time.LocalTime;

public class Test {
	
	public static void main(String[] args) {
		
		LocalTime time=LocalTime.now();
		
		
		Time t=Time.valueOf(time);
		
		System.out.print(t);
		
		
		
		
	}

}
