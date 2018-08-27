import java.util.*;
import java.lang.*;
public class date1{
private int year;
private int month;
private int day;
public date1(int year, int month, int day)
{
this.year=year;
this.month=month;
this.day=day;
}
public int getYear()
{
	return year;
}
public void setYear()
{
	this.year=year;
}
public int getMonth()
{
	return month;
}
public void setMonth()
{
	this.month=month;
}
public int getDay()
{
	return day;
}
public void setDay()
{
	this.day=day;
}
public String toString()
{
	String st= String.format("%02d", month)+"/"+String.format("%02d", day)+"/"+year;
	return st;
}
public static void main(String args[])
{
	date1 d= new date1(2016, 4,4);
	String sp= d.toString();
	System.out.println(sp);
}
};



