import java.util.*;
import java.lang.*;
class Circle
{ 
private double radius=1.0;
private String color="red";
Circle()
{
}
Circle(double radius)
{
this.radius=radius;
}
public double getRadius()
{
return this.radius;
}
public double getArea()
{
double radi=this.radius;
double area=0;
area= 3.14*radi*radi;
return area;
}
public static void main(String args[])
{
Circle a= new Circle();

Scanner sc= new Scanner(System.in);
double radius= sc.nextDouble();
Circle b= new Circle(radius);

System.out.println(a.getRadius()+ " "+a.getArea());
System.out.println(b.getRadius()+ " "+b.getArea());
}
};