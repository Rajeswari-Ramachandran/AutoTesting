package numberProject;

public class empirNumber {

	public static void main(String[] args) {
/* A number is called an emirp number if we get another prime number on reversing the number itself.
	In other words, an emirp number is a number that is prime forwards or backward. 
	It is also known as twisted prime numbers.
	Note: Palindrome primes are excluded.*/
int num=21,temp1,temp2=0;
int alter=num;
boolean flag=true,flag2=true;
for(int i=2;i<num;i++)
{
if((num%i)==0)
 flag=false;
}
while(num!=0)
{
	temp1=num%10;
	temp2=temp2*10+temp1;
	num=num/10;
}
for(int i=2;i<temp2;i++)
{
if((temp2%i)==0)
 flag=false;
}
if((flag==true) && (flag2==true))
	System.out.println("The given number "+alter+" is a Empir Number");
else
	System.out.println("The given number "+alter+" is not a Empir Number");
	}

}
