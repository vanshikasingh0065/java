import java.lang.*;
import java.util.*;
class test{
	int logic(int arr[], int n)
	{
		int i, large=0;
		for(i=0;i<n;i++)
		{
		if(arr[i]>large)
		{
		large= arr[i];
		}
		}
		return large;
		
		
	}
	int input()
	{
	int n,i;
	Scanner sc= new Scanner(System.in);
	n= sc.nextInt();
	int arr[]=new int[n];
	for(i=0; i<n;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	int m= logic(arr, n);
	return m;
	}
}
class demo{
	public static void main(String args[])
	{
		test tt= new test();
		int c= tt.input();
		System.out.println(c);
}
}
	