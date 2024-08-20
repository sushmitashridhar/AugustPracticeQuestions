package com.kodnest.project;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of n");
		int n=scan.nextInt();
		System.out.println("Enter the size of m");
		int m=scan.nextInt();
		
		int a[][]=new int[n][m];
		System.out.println("Enter the number of n and m");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("The 2D array are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
