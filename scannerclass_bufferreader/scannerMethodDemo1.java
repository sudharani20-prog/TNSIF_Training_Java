package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.util.Scanner;

public class scannerMethodDemo1 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your name");
		 String name=sc.next();
		 System.out.println("Enter your age");
		 String age=sc.next();
		 System.out.println("Name:" +name);
		 System.out.println("Age:"+ age);
		 sc.close();
		 
	}

}
