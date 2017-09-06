package com.example;

import java.util.logging.Logger;

public class JavaLoggingExample {
	
	//실제 로거를 찍는 로직
	static Logger log = Logger.getLogger(JavaLoggingExample.class.getName()); 

	public static void main(String[] args) {

		System.out.println("Hello Sysout logging...");
		
		log.info("Hello Java 내장 로그로 출력");
		
	}

}