package numberProject;

public class neonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=45;
int num1=num*num;
int temp1,temp2=0, temp=num;

while(num1!=0)
{
	temp1=num1%10;
	temp2=temp2+temp1;
	num1=num1/10;

}
if(temp2==temp)
	System.out.println("The Number  "+temp+" is a Neon Number");
else
	System.out.println("The Number  "+temp+" is not a Neon Number");
	}

}
