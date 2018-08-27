import java.util.*;
import java.lang.*;
class demo{
	public int logic(int a, int b)
	{
	if(a==b)
	{
	return 1;
	}
	else
	{
	return 0;
	}
	}
	public int input2(int a)
	{
	int b;
	Scanner sc= new Scanner(System.in);
	b=sc.nextInt();
	int z= logic(a, b);
	return z;

	}
	public int input1()
	{
	int a;
	Scanner sc= new Scanner(System.in);
	a= sc.nextInt();
	int u= input2(a);
	return u;
	
	}
	public static void main(String args[])
	{
		demo dd= new demo();
		int c= dd.input1();
		System.out.println(c);
		
}}
		