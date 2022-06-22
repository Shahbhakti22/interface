package oops;

import java.util.Scanner;

public class circle implements inf1 {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int area,r;
		double p=3.14;
		
		System.out.println("Enter radius of circle:");
		r=sc.nextInt();
		area=(int) (p*r);
		System.out.println("Area of circle:" +area);
		
		
		
		
	}
	

}
