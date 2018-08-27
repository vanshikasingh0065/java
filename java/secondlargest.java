import java.lang.*;
import java.io.*;
class pp{
public static void main(String a[])
{
Console c1= System.console();
String s1=c1.readLine();
int a1= Integer.parseInt(s1);
	int b=0;
int large=0;
	while(a1>0)
{

int t=a1%10;


if(t%2==0)
{
if(t>large){

b=large;
large=t;
}
else if(t>b){

	b=t;
}

}

a1=a1/10;

}
System.out.print(b);

}
}