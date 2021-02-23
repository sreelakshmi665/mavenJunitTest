package com.mindtree.MavenJUnitTest;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calculator 
{  
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter a, b values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		add(a,b);
		sub(a,b);
		mul(a,b);
		
	}
	public static int add(int a,int b)
    {
    	return a+b;
    }
    public static int sub(int a,int b)
    {
    	return a-b;
    }
    public static int mul(int a,int b)
    {
    	return a*b;
    }
        
    }
