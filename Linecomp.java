package com.bridgelabz2;
import java.util.Scanner;
import java.lang.Math;

class Line
{
	int x1,y1,x2,y2;
	int a1,b1,a2,b2;
	
	//Calculates the length of the line
	public Double LengthofLine(int p3,int q3)
	{
		Double lengthOfaLine=Math.sqrt((Math.pow(p3, 2))+(Math.pow(q3, 2)));	
		return lengthOfaLine;
	}
	
	// Compares the length of the line
	public void Compare(Double lengthOfaLine1,Double lengthOfaLine2)
	{
		int b=(lengthOfaLine1.compareTo(lengthOfaLine2));
	 	if(b<0)
	 		System.out.println("Length of Line 2 is greater than Line 1");
	 	else if (b>0)
	 		System.out.println("Length of Line 1 is greater than Line 2");
	 	else if(b==0)
	 		System.out.println("Length of 2 Lines are equal");
	}
		
}

public class Linecomp {

	public static void main(String[] args) {
		//Object Creation
		Line obj1=new Line();
		// code for line 1
		System.out.println("Welcome to Line Comparision Computation Program");
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter the value of x1");
	    obj1.x1 = sc.nextInt();  
	    System.out.println("x1 is: " + obj1.x1);
	    System.out.println("Enter the value of y1");
	    obj1.y1 = sc.nextInt();  
	    System.out.println("y1 is: " + obj1.y1);
	    System.out.println("Enter the value of x2");
	    obj1.x2 = sc.nextInt();  
	    System.out.println("x2 is: " + obj1.x2);
	    System.out.println("Enter the value of y2");
	    obj1.y2 = sc.nextInt();  
	    System.out.println("y2 is: " + obj1.y2);
	    
	    int x3=(obj1.x2-obj1.x1);
	    int y3=(obj1.y2-obj1.y1);
	    Double lengthOfaLine1=obj1.LengthofLine(x3, y3);
	  
	    System.out.println("Length of line 1 is: "+lengthOfaLine1);
	   
	    // code for line 2
	    
	 	System.out.println("Enter the value of a1");
	 	obj1.a1 = sc.nextInt();  
	    System.out.println("x1 is: " + obj1.a1);
	    System.out.println("Enter the value of b1");
	    obj1.b1 = sc.nextInt();  
 	    System.out.println("y1 is: " + obj1.b1);
 	    System.out.println("Enter the value of a2");
	    obj1.a2 = sc.nextInt();  
	    System.out.println("x2 is: " + obj1.a2);
	    System.out.println("Enter the value of b2");
	    obj1.b2 = sc.nextInt();  
	    System.out.println("y2 is: " + obj1.b2);
	 	    
 	    int a3=(obj1.a2-obj1.a1);
 	    int b3=(obj1.b2-obj1.b1);
	    Double lengthOfaLine2=obj1.LengthofLine(a3, b3);
	 	  
 	    System.out.println("Length of line 2 is: "+lengthOfaLine2);
	 	//Function call to compare funtion    
	    obj1.Compare(lengthOfaLine1, lengthOfaLine2);
	 	    		
	}

}
