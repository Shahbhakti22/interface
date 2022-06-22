package oops;

import java.util.Scanner;

public class abc implements inf2,inf3 {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int r,h,area;
		double pie=3.14;
		System.out.println("Enter area of radius,height:");
		r=sc.nextInt();
		h=sc.nextInt();
		area=(int) ((2*(pie*r*h))+(2*(pie*r*r)));
		System.out.println("Area of cylinder:" +area);
		
	}

	@Override
	public void peri() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int peri,l,w;
		
		System.out.println("Enter len,width:");
		l=sc.nextInt();
		w=sc.nextInt();
		
		peri=(2*(l+w));
		System.out.println("perimeter of rect:" +peri);
	}

}
