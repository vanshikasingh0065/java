import java.util.*;
import java.lang.*;
class Account{
private int accountNumber;
private double balance=0.0;
Account(int accountNumber, double balance)
{
this.accountNumber= accountNumber;
this.balance=balance;
}
Account(int accountNumber)
{

this.accountNumber= accountNumber;
}
private int getAccountNumber()
{
return this.accountNumber;
}
private double getBalance()
{
return this.balance;
}
public void setBalance(double balance)
{
this.balance=balance;
}
public void credit(double amount)
{
this.balance=this.balance+amount;
}
public void debit(double amount)
{
if(this.balance>=amount)
{
this.balance=this.balance-amount;
}
else{
System.out.println("amount withdrawn exceeds the current balance");
}
}
public String toString()
{
String end="A/C no:" +this.accountNumber+ "  Balance =$" + this.balance;
return end;
}
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter account number");
int accountnumber= sc.nextInt();
System.out.println("enter Balance");
double balance= sc.nextDouble();
System.out.println("Enter choice, 1-withdraw 2-deposit");
int choice= sc.nextInt();
System.out.println("enter amount");
double amount = sc.nextDouble();
Account m= new Account(accountnumber);
m.setBalance(balance);
if(choice==2)
{
m.credit(amount);
}
if(choice==1)
{
m.debit(amount);
}
String s= m.toString();
System.out.println(s);
}
};



