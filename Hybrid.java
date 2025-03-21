// Name : KISHHORE S
// Reg.No. : 2301112026
// Title of the Program : Program to demonstrate Multiple Inheritance
// Subject Code : IT206
// Subject : Object Oriented Programming Laboratory(C++ & Java)
// Date of Creation : 13/11/2024
import java.io.*;
class Student 
{
 	int rollNumber;
   	void getNumber(int n) 
	{
        		rollNumber = n;
    	}
    	void putNumber() 
	{
        		System.out.println("Roll No: " + rollNumber);
    	}
}
class Test extends Student 
{
 	float part1, part2;
    	void getMarks(float m1, float m2) 
	{
        		part1 = m1;
        		part2 = m2;
    	}
    	void putMarks() 
	{
        		System.out.println("Marks obtained:");
       	 	System.out.println("Part 1: " + part1);
        		System.out.println("Part 2: " + part2);
    	}
}





interface Sports 
{
 	float sportWt = 6.0F;
    	void putWt();
}
class Results extends Test implements Sports 
{
 	float total;
    	public void putWt() 
	{
        		System.out.println("Sports Wt: " + sportWt);
    	}
	void display() 
	{
        		total = part1 + part2 + sportWt;
        		putNumber();
        		putMarks();
       		putWt();
        		System.out.println("Total Score: " + total);
    	}
}
public class Hybrid 
{
   	public static void main(String args[]) 
	{
	System.out.println("=================================================\n");
        	System.out.println("Name : DHARUN RAJ");
        	System.out.println("Reg.No. : 2301112012");
        	System.out.println("Title of the Program : Program to demonstrate  Multiple Inheritance");
        	System.out.println("Subject Code : IT206");
        	System.out.println("Subject : Object Oriented Programming Laboratory(C++ & Java)");
        	System.out.println("Date of Creation : 01/12/2024\n");	System.out.println("=================================================\n");           	System.out.println("Screen Display:");
        		Results student1 = new Results();
        		student1.getNumber(1234);
        		student1.getMarks(27.5F, 33.0F);
        		student1.display();
    	}
}
