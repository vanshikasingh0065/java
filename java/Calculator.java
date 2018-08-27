import java.lang.*;
import java.util.*;
class Calculator
{
int i, j, k;
void userInput(int a, int b)
{
i=a;
j=b;
}
void add()
{
k=i+j;
System.out.println(k);
}
void subtract()
{
k=i-j;
System.out.println(k);
}
void multiply()
{
k=i*j;
System.out.println(k);
}
void divide(){
k=i/j;
System.out.println(k);
}
void exponential()
{
System.out.println(Math.pow(i,j));
}

public static void main(String a[])
{
Scanner sc= new Scanner(System.in);
int i= sc.nextInt();
int j=sc.nextInt();
Calculator c=new Calculator();
c.userInput(i,j);
c.add();
c.subtract();
c.multiply();
c.divide();
c.exponential();
}
};