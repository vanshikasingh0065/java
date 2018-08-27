import java.util.*;
 class Question2{
 public static void main(String args[])
 {
 Scanner sc= new Scanner(System.in);
 int n1=0, n2=0, n3=0, large=0, small=0;
 n1= sc.nextInt();
 n2= sc.nextInt();
 n3= sc.nextInt();
 int sum= n1+n2+n3;
 int avg= (n1*n2*n3)/3;
 int prod = n1*n2*n3;
 if(n1>n2||n1>n3)
 {
	 large= n1;
 }
 else if(n2>n1||n2>n3)
 {
	 
	 large=n2;
 }
 else if(n3>n1||n3>n2)
 {
	 large=n3;
 }
 if(n1<n2||n1<n3)
 {
	 small= n1;
 }
 else if(n2<n1||n2<n3)
 {
	 small=n2;
 }
 else if(n3<n1||n3<n2)
 {
	 small=n3;
 }
 System.out.println(large);
 System.out.println(small);
  System.out.println(sum);
   System.out.println(avg);
    System.out.println(prod);
 }
 };
 
 