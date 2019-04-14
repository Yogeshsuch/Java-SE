package org.sunbeam.dac.HeartRate;

public class Program {

	public static void main(String[] args) 
	{
		testHeartBeat test = new testHeartBeat();
		
		test.acceptRecord();
		test.printRecord();

	}

}
