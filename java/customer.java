import java.lang.*;
import java.util.*;
class Address{
			String street;
			String city;
			int pincode;
			String country;
Address(String street, String city, int pincode, String country)
{
this.street=street;
this.city=city;
this.pincode=pincode;
this.country=country;
}
void displayAddress()
{
		System.out.printf("\nstreet: %s", street);
		System.out.printf("\ncity: %s",city );
		System.out.printf("\npincode: %d", pincode);
		System.out.printf("\ncountry: %s", country);

}

}
class customer
{
	String customername;
	String customeremail;
	String customertype;	
	Address customeraddress;
customer(String customername, String customeremail, String customertype, Address customeraddress)
{
		this.customername= customername;
		this.customeremail=customeremail;
		this.customertype=customertype;
		this.customeraddress=customeraddress;
}
void displayDetails()
{
		System.out.printf("customername: %s", customername);
		System.out.printf("\ncustomeremail:%s",customeremail );
		System.out.printf("\ncustomertype: %s", customertype);
		//System.out.printf("enter the customeraddress %a", customeraddress);
		customeraddress.displayAddress();
}
public static void main(String args[])
{
int n, val;
Scanner sc = new Scanner(System.in);
		System.out.println("enter the customername");
			String customername= sc.nextLine();
		System.out.println("enter the customeremail");
			String customeremail= sc.nextLine();
		System.out.println("enter the customertype");
			String customertype= sc.next();
		System.out.println("enter street");
			String street= sc.next();
		System.out.println("enter city");
			String city= sc.next();
		System.out.println("enter pincode");
			int pincode= sc.nextInt();
		System.out.println("enter country");
		   String country= sc.next();
		Address add= new Address(street, city, pincode, country);
		customer cust= new customer(customername, customeremail, customertype, add);
		cust.displayDetails();
		
		

}
}




