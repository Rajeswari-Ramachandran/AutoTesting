package numberProject;
import java.util.*;
public class atmProg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int amount=100000,withdraw,deposit;
  int val;
while(true)
{
	System.out.println("What you want to perform");
	System.out.println("1. Deposite");
	System.out.println("2. Withdrawal");
	System.out.println("3. Balance");
	System.out.println("4. Exit");
	System.out.println(" ");
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	val=input.nextInt();
	switch(val) 
	{
	case 1:
		System.out.println("Enter the amount to be deposited");
		deposit=input.nextInt();
		amount=amount+deposit;
		System.out.println("You have successfully deposited the amount "+deposit);
		System.out.println(" ");
		break;
	case 2:
		System.out.println("Enter the amount to be withdraw");
		withdraw=input.nextInt();
		if(withdraw<=amount)
		{
			amount=amount-withdraw;
		System.out.println("withdrawal is successful");
		System.out.println(" ");
		}
		else
			System.out.println("Not Enough Amount to withdraw");
		System.out.println(" ");
		break;
	case 3:
		System.out.println("The balance in your account is "+amount);
		System.out.println(" ");
		//System.out.println("Enter the amout to be deposited");
		break;
	case 4:
		System.exit(0);
	}
	}	
}
	}	
