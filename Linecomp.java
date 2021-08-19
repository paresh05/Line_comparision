package com.bridgelabz2;
import java.util.Scanner;
import java.lang.Math;

public class Linecomp {

	public static void main(String[] args) {
	
		// code for line 1
		System.out.println("Welcome to Line Comparision Computation Program");
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter the value of x1");
	    int x1 = sc.nextInt();  
	    System.out.println("x1 is: " + x1);
	    System.out.println("Enter the value of y1");
	    int y1 = sc.nextInt();  
	    System.out.println("y1 is: " + y1);
	    System.out.println("Enter the value of x2");
	    int x2 = sc.nextInt();  
	    System.out.println("x2 is: " + x2);
	    System.out.println("Enter the value of y2");
	    int y2 = sc.nextInt();  
	    System.out.println("y2 is: " + y2);
	    
	    int x3=(x2-x1);
	    int y3=(y2-y1);
	    Double lengthOfaLine1=Math.sqrt((Math.pow(x3, 2))+(Math.pow(y3, 2)));
	  
	    System.out.println("Length of line 1 is: "+lengthOfaLine1);
	    
	    
	 // code for line 2
	 		System.out.println("Welcome to Line Comparision Computation Program");
	 	    System.out.println("Enter the value of a1");
	 	    int a1 = sc.nextInt();  
	 	    System.out.println("x1 is: " + a1);
	 	    System.out.println("Enter the value of b1");
	 	    int b1 = sc.nextInt();  
	 	    System.out.println("y1 is: " + b1);
	 	    System.out.println("Enter the value of a2");
	 	    int a2 = sc.nextInt();  
	 	    System.out.println("x2 is: " + a2);
	 	    System.out.println("Enter the value of b2");
	 	    int b2 = sc.nextInt();  
	 	    System.out.println("y2 is: " + b2);
	 	    
	 	    int a3=(a2-a1);
	 	    int b3=(b2-b1);
	 	    Double lengthOfaLine2=Math.sqrt((Math.pow(a3, 2))+(Math.pow(b3, 2)));
	 	  
	 	    System.out.println("Length of line 2 is: "+lengthOfaLine2);
	 	    
	 	   if(lengthOfaLine1.equals(lengthOfaLine2))
		    	System.out.println("Length of 2 Lines are equal");
		
	}

}
