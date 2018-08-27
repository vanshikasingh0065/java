import java.util.*;
class Question3{
public static void main(String a[])
{
Scanner sc= new Scanner(System.in);
int count=10;
int number= sc.nextInt();
int largest=0;
for(count=0; count<10; count++)
{
if(number>largest)
{
largest=number;
}
else{
	number=largest;
}

System.out.println(largest);
}
}
};



