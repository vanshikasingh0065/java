import java.util.*;
import java.lang.*;
class Question9{
public static double Average( int grades[], int max)
{
int sum=0;
double average=0.0;
for(int i=1; i<=20; i++)
{
sum= sum+grades[i];
average=sum/(i);
}
return average;

}
public static void main(String arg[])
{
Scanner sc= new Scanner(System.in);
int i, grades[];
grades= new int[20];
for(i=0; i<20; i++)
{
System.out.println("Enter grades: ");
grades[i]= sc.nextInt();
if(grades[i]==-1)
{
break;

}}
System.out.printf(".2%f", Average(grades, i-1));

}
};
