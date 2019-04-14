package org.sunbeam.dac.HeartRate;
import java.util.Scanner;

public class testHeartBeat 
{
	private HeartRates heartRate = new HeartRates();
	static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord()
	{
		System.out.print("Enter first name:: ");
		heartRate.setfName(sc.nextLine());
		System.out.print("Enter last name:: ");
		heartRate.setlName(sc.nextLine());
		System.out.print("Enter your birthday (DD MM YYYY) :: ");
		heartRate.setDay(sc.nextInt());
		heartRate.setMonth(sc.nextInt());
		heartRate.setYear(sc.nextInt());
	}
	
	public void printRecord()
	{
		System.out.println("Name:: "+heartRate.getfName() + " " + heartRate.getlName());
		System.out.println("Age:: "+heartRate.findAge());
		System.out.println("Birth date:: "+heartRate.getYear() + "/" + heartRate.getMonth() + "/" + heartRate.getDay());
		System.out.println("Max heart rate:: "+ heartRate.maxHeartBeatRate());
		System.out.println("Target heart beat range:: "+heartRate.targetHeartBeatRange());
	}
	
	
}
