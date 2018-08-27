import java.util.*;
import java.lang.*;
class Savingaccount;
class Currentaccount;
class Account{
int Accountno;

Double balance;
int amt;
public Account(Double initbalance){
if(initbalance>0&&initbalance<500)
{
System.out.println("The account could not be created");
}
else{
balance= initbalance;
}
}
public void credit(Double amt)
{
balance= balance+amt;
}
public void debit(Double amt)
{
if(balance-amt<500)
{
System.out.println("You do not have sufficient balance");

}
else{
balance= balance-amt;}
}
public Double display()
{
return balance;
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
Double initbalance, amt, balance;
int choice;
System.out.println("Enter the initial balance");
initbalance= sc.nextDouble();
System.out.println("Enter the amount to be credited/debited");
amt= sc.nextDouble();
System.out.println("Enter the choice");
choice=sc.nextInt();
Account acc= new Account(initbalance);
switch(choice)
{
case 1:acc.credit(amt);break;
case 2:acc.debit(amt);break;
}
System.out.printf("the existing balance is "+acc.display());
}
};
class Savingaccount extends Account{
int interest= 5;
void interestperyear(int balance)
{
balance= (5*balance)/100;
}
System.out.println(balance);
};
class Currentaccount extends Account{
System.out.println(balance);
};




