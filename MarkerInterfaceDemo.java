package org.tnsif.acc.c2tc.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Registration s=new Student(12,"Shree",300000.00,"Java Programming");
        Registration s1=new Student(13,"Suma",400000.00,"Java Programming");
        Object obj=new Object();
        if(obj instanceof Registration) {
        	System.out.println("Student is registered for the course ");
        }
        else {
        	System.out.println("Student is not registered for the course ");
        }
	}

}
