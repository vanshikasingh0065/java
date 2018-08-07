import java.io.*;
import java.util.*;
class billing
{
  String num,desp;
  int qnty;
  double price;
  billing(String num,String desp,int qnty,double price)
	{
		this.num=num;
		this.desp=desp;
		this.qnty=qnty;
		this.price=price;
	}
   int getqnty()
	{
		if(qnty<0)
		this.qnty=0;
	 	return this.qnty;
	}
double getprice()
	{
		if(price<0)
		this.price=0.0;
	 	return this.price;
	}
   double getBill()
	{
		double d=getqnty()*getprice();
		return d;
  	}

  public static void main(String[] args) throws IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String num,desp;
		int qnty;
		double price;	
		num=br.readLine();
		desp=br.readLine();
		qnty=Integer.parseInt(br.readLine());
		price=Integer.parseInt(br.readLine());

		billing obj=new billing(num,desp,qnty,price);
		System.out.println(obj.getBill());
}
}