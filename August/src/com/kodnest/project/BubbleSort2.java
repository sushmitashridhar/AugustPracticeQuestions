package com.kodnest.project;
import java.util.Scanner;

public class BubbleSort2 {
	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("Enter the number");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Ascending order is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
