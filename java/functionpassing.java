import java.util.*;
import java.lang.*;
class test{
	public int logic(int a, int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
		return b;
		}
	}
	public int input()
	{  int k;
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
	   k=logic(i,j);
return k;	   
	}
	
}
class demo{
	public static void main(String args[])
	{
	//	int a, b,z;
		test tt= new test();
		int z=tt.input();
	     System.out.println(z);
	}
}











/*class demo{
public void logic(int x, int y)
	{
	int temp;
		temp=x;
		x=y;	 
		y=temp;
		
		System.out.println(x+"  "+y);
	}
	public static void main(String args[])
	{
		demo dd=new demo();
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		dd.logic(x, y);
	}
};*/