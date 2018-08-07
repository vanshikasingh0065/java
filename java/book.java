import java.lang.*;
import java.util.*;
class Author{
String name;
String email;
char gender;
Author(String name, String email, char gender)
{
	this.name=name;
	this.email=email;
	this.gender=gender;
}
String getName()
{
	return this.name;
}
String getEmail()
{
	return this.email;
}
void setEmail(String email)
{
	this.email=email;
}
char getGender()
{
	return this.gender;
}
public String toString()
{
	String end="name= " +this.name+ ",email= " +this.email+  ",gender= "+this.gender;
	return end;
}
}
class Book{
String name;
Author author;
double price;
int qty=0;

Book(String name, Author author, double price)
{
	this.name=name;
	this.author=author;
	this.price=price;
}
Book(String name, Author author, double price, int qty)
{
this.name=name;
this.author=author;
this.price=price;
this.qty=qty;
}
public String getName(){
	return this.name;
}
Author getAuthor()
{
	return this.author;
}
public double getPrice()
{
	return this.price;
}
public void setPrice(double price)
{
	this.price=price;
}
public int getQty()
{
return this.qty;
}
void setQty(int qty)
{
	this.qty=qty;

}
public String toString()
{
	String end="Book [name= "+this.name+ ",Author[name= "+this.author.name+ ",email= "+this.author.email+ ",gender= "+this.author.gender+ "],price= "+this.price+ ",qty= "+this.qty+ "]";
return end;
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter name");
String name= sc.nextLine();
System.out.println("enter emailid");
String email= sc.nextLine();
System.out.println("Enter choice, 1-male 2-female");
char choice= sc.next().charAt(0);
Author a= new Author(name, email, gender);
System.out.println("enter book name");
String name1=sc.next();
System.out.println("enter price");
double price=sc.nextDouble();
System.out.println("enter qty"); 
int qty=sc.nextInt();
Book b =new Book(name1,a,price,qty);

String s1= a.toString();
System.out.println(s1);
String s= b.toString();
System.out.println(s);
}
};


