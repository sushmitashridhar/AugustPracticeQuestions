package com.kodnest.project;
import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Bank started");
//		int original=2345;
//		int balance=50000;
//		//int pin=0;
//		System.out.println("Enter the pin");
//		try {
//		if(original==scan.nextInt()) {
//			System.out.println("Balance ="+balance);
//		}
//		}catch(Exception e) {
//			System.out.println("enter the valid pin");
//		}
//		    finally {
//		    scan.close();
//			System.out.println("Bank app terminted");
//		    }
//		
//	}
//
//}

System.out.println("Main start");
method1();
System.out.println("main stop");
	}
	static void method1() {
		System.out.println("Method-1 start");
		method2();
		System.out.println("method-1 stop");
	}
	static void method2() {
		System.out.println("Methood-2 start");
		method3();
		System.out.println("Method-2 stop");
	}
	static void method3() {
		System.out.println("Method-3 start");
		System.out.println(10/2);
		System.out.println("Method-3 stop");
	}
		
	}









