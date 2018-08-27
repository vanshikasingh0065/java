import java.util.*;
import java.lang.*;
class Repeat{
public static void main(String a[])
{
int i, j;
int k=0;
int n[]= new int[100];
int p[]={1,2,4,3,4,5,6,7, 6};
for(i=0; i<(p.length-1); i++)
{
for(j=i+1; j<p.length; j++)
{
if(p[i]==p[j])
{
	n[k]=p[i];
	k++;
}

}
}
System.out.print(n[0]);

}
};


