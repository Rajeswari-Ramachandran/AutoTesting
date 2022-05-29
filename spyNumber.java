package numberProject;
import java.util.*;

public class spyNumber {

	public static void main(String[] args) {
		///a number whose sum and product of all digits are equal is called a spy number.
int num;
@SuppressWarnings("resource")
Scanner var=new Scanner(System.in);

System.out.println("Enter an Integer Number");
num=var.nextInt();
int temp=num;
int temp1,sum=0,prod=1;

do
{
	temp1=num%10;
	sum=sum+temp1;
	prod=prod*temp1;
	num=num/10;
}while(num!=0);
if(sum==prod)
	System.out.println("The Number  "+temp+" is a Spy Number");
else
	System.out.println("The Number  "+temp+" is not a Spy Number");
	}

}
