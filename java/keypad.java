import java.util.*;
import java.lang.*;
class Keypad{
public static void main(String a[])
{
int c;
Random t = new Random();
Scanner sc = new Scanner(System.in);

int num= t.nextInt(100);
System.out.println("Number:"+num);
System.out.println("Num in alphabet " + (char)(64+num));
num= num+2;
int key=num/3+1;
if((num==21)||(num==28))

{
key--;
}
System.out.println("Keypad output" +key);

}
};


