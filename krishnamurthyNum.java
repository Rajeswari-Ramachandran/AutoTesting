package numberProject;
import java.util.*;

public class krishnamurthyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
@SuppressWarnings("resource")
Scanner input=new Scanner(System.in);
System.out.println("Enter the Number");
num=input.nextInt();
int alter=num;
int temp=0,fact=1,sumOfFact=0;

while(num!=0)
{
temp=num%10;
for(int i=1;i<=temp;i++)
{
	fact=fact*i;
	//System.out.println(fact);
}
sumOfFact=sumOfFact+fact;
fact=1;
//System.out.println(sumOfFact);
num=num/10;
}
if(alter==sumOfFact)
	System.out.println("The Entered Number "+alter+" is a Krishnamurthy Number");
else
	System.out.println("The Entered Number "+alter+" is not a Krishnamurthy Number");
}

}
