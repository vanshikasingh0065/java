import java.util.*;
import java.lang.*;
class Question6{
public static double sphereVolume(double radius)
{
return (4.0/3.0)*Math.PI*Math.pow(radius,3);
}
public static void main(String a[])
{
Scanner sc= new Scanner(System.in);
double radius=0.0, Volume=0.0;
System.out.printf("Enter radius: ");
radius= sc.nextInt();
System.out.printf("Volume = .3%f", sphereVolume(radius));
}};