import java.lang.*;
import java.util.*;
class concat{
	public static void main(String args[])
	{
	//decleration using literals
String d1= "Vanshika";
String d2= "Hello";
String d3= "44";
//decleration using new keyword
char ch[]={'h','l','o'};
String s= new String(ch);
System.out.println(s);
//concat
System.out.println(d1.concat(d2+d3));
//length
System.out.println(s.charAt(1));
//tolowercase
System.out.println(d2.toLowerCase());
//touppercase
System.out.println(d2.toUpperCase());
//trim
System.out.println(d1+d2.trim());
	}
};