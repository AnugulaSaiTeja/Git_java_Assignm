package com.CaseStudies;

import java.util.*;
public class FlowerDemo
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.println("Enter the Continent Name");
		a=sc.nextLine();
		FlowerDemo f=new FlowerDemo();
		f.displayflower(a);
	}
	
	
	
	
	public void displayflower(String s)
	{
		/*int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of countries");
		n=sc.nextInt();*/
		switch(s)
		{
			case "Asia" : System.out.println("Country\t\tFlower");
						  System.out.println("India\t\tLotus");
						  System.out.println("Pakistan\t\tJasmine");
						  System.out.println("Nepal\t\tLali Gurans");
						  break;
			case "Europe":System.out.println("Country\t\tFlower");
						  System.out.println("Germany\t\tCorn Flower");
						  System.out.println("Greece\t\tLily");
						  System.out.println("France\t\tAcanthus Mollis");
						  break;
			case "Africa":System.out.println("Country\t\tFlower");
						  System.out.println("Eygpt\t\tBlue Lotus");
						  System.out.println("Nigeria\t\tYellow Trumpet");
						  System.out.println("Kenya\t\tAcanthus Orchid");
						  break;
			default :     System.out.println("Invalid Option");
		}
	}
	
	
	
	

}