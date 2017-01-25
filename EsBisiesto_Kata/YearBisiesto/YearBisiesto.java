package org.foobarspam.YearBisiesto;

public class YearBisiesto {
	private int year = 0;
	
	public YearBisiesto(){
		this.year = 0;
	}
	
	public YearBisiesto(int year){
		this.year = year;
	}
	
	public void setyear(int year){
		this.year = year;
	}
	
	public int getyear(){
		return this.year;
	}
	
	public static boolean esBisiesto(int year){
		return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
	}
}