package oops;

import java.util.Scanner;

public class rect implements inf1{

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int area,l,w;
		System.out.println("enter len,width:");
		l=sc.nextInt();
		w=sc.nextInt();
		area=l*w;
		System.out.println("area of rect:" +area);
		
	}

}
