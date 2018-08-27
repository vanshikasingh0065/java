import java.lang.*;
import java.util.*;
class st{
static int top=-1;
Scanner sc = new Scanner(System.in);
static int arr[]= new int[15];
  int push(int val)
{
 top++;
 arr[top]= val;
 if(top==15)
 {
  System.out.println("overflow");
  }
  else{
  System.out.println(top);
 }
 return top;
}
 int pop()
{
	if(top!=-1)
	{
	top--;
	}
	return  top;
}
}
class vans{

 public static void main(String args[])
 {
	 st pp = new st();
	 Scanner sc = new Scanner(System.in);
	 int i, val, j;
	 for(i=0; i<15; i++)
	 {
		 val= sc.nextInt();
		 pp.push(val);
	 }
	int m= pp.pop();
	 System.out.println(m);
	 
 }
}
 