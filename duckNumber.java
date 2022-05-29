package numberProject;

import java.util.Scanner;

public class duckNumber {

	public static void main(String[] args) {
	/*Duck number is another special positive non-zero number that contains zero in it.
	 *  The digit zero should not be presented at the starting of the number. 
	 *  Zero can be present at any of the positions except the beginning of the number.
	 */
Scanner input = new Scanner(System.in);
System.out.println("Enter a Number :");
int num=input.nextInt();
System.out.println(num);
int alter=num,temp1,temp2=0;
boolean flag=true;
while(num!=0)
{
	temp1=num%10;
	temp2=temp2*10+temp1;
	num=num/10;
}
if((temp2%10)==0)
	System.out.println("The Given Nmeber "+alter+" is not a Duck Number");
else 
{
	while(temp2!=0)
	{
		temp1=temp2%10;
		if(temp1==0)
			{flag=false;}
		num=num*10+temp1;
		temp2=temp2/10;
	}
	if(flag==false)
		System.out.println("The Given Nmeber "+alter+" is a Duck Number");
	else
		System.out.println("The Given Nmeber "+alter+" is not a Duck Number");
}

}

}
