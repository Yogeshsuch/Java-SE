package org.sunbeam.dac.HeartRate;

public class HeartRates 
{
	private String fName;
	private String lName;
	public int year;
	public int month;
	public int day;
	
	public HeartRates()
	{
		this("","");
	}
	public HeartRates(String fName,String lName)
	{
		this.fName = fName;
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public String toString()
	{
		return String.format("%s",java.time.Year.now());
	}
	
	public int findAge()
	{
		return ( Integer.parseInt(toString()) - year);
	}	
	
	public int maxHeartBeatRate()
	{
		return 220 - findAge();
	}
	
	public String targetHeartBeatRange()
	{
		int  min_range  = maxHeartBeatRate() * 50 / 100;
		int  max_range  = maxHeartBeatRate() * 85 / 100;
	
		return 	String.format("%d - %d",min_range,max_range);
	}
};


