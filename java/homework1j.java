import java.util.*;
import java.lang.*;
class Question5{
public static void main(String a[])
{
int counter=1;
System.out.printf("N\t10*N\t100*N\t1000*N\n");
for(counter=1; counter<=5; counter++)
{
System.out.printf("%d\t%d\t%d\t%d\n", counter, counter*10, counter*100, counter*1000);
}
}
};