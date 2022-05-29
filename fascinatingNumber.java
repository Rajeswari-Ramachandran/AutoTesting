package numberProject;
import java.util.*;

public class fascinatingNumber {

	public static void main(String[] args) {
		/*If the given number is a 3 or more than three-digit
If the value getting after concatenation contains all digits from 1 to 9, exactly once.*/
		
int num,temp1,temp2,count=0;
String val;
char ch;
//boolean found=true;
@SuppressWarnings("resource")
Scanner input= new Scanner(System.in);
System.out.println("Enter the Number");
num=input.nextInt();
if(num<100)
{
	System.out.println("The Given Number is Less than 3 Digit");
}
else
{
temp1=num*2;
temp2=num*3;
val= String.valueOf(num)+String.valueOf(temp1)+String.valueOf(temp2);
for(char j='1';j<='9';j++)
{ count=0;
	for(int i=0;i<val.length();i++)
	{ch=val.charAt(i);
		if(ch==j)
		{
			count++;
		}
		
		}
	
	
}
if(count==1)
	System.out.println("The Given Number "+val+" is a Fascinating Number" );
else
	System.out.println("The Given Number "+val+" is not a Fascinating Number" );
}

	}

}
