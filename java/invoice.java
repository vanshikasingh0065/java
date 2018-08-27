import java.lang.*;
import java.util.*;
import java.awt.*;
class Invoice{
String partnumber;
String partdescription;
int quantity;
double priceperitem;
public Invoice(String pn,String pd,int qn,double ppi)
{
setpartnumber(pn);
setpartdescription(pd);
setquantity(qn);
setpriceperitem(ppi);
}
public String getpartnumber()
{
	return partnumber;
}
public String getpartdescription()
{
	return partdescription;
}
public int getquantity()
{
	return quantity;
}
public double getpriceperitem()
{
	return priceperitem;
}
public void setpartnumber( String setpartnumber)
{
	this.partnumber = partnumber;
}
void setpartdescription(String partdescription)
{
	this.partdescription = partdescription;
}
void setquantity(int quantity)
{

	this.quantity=quantity;
	if(this.quantity<0)
{
 	this.quantity=0;
}
else{
	this.quantity=quantity;}
}
void setpriceperitem(double priceperitem)
{
	this.priceperitem=priceperitem;
	if(this.priceperitem<0.0)
{
 	this.priceperitem=0.0;
}

}

double getInvoiceamount()
{
	return (this.quantity*this.priceperitem);
 	

}
public static void main(String args[])
{


	String partnumber;
	String partdescription;
	int quantity;
	double priceperitem;
	
	Invoice in = new Invoice("one","yellow",55, 99.00);
	System.out.println(in.getInvoiceamount());

}
};

