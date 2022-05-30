package numberProject;

public class petersonNum {

	public static void main(String[] args) {
		// Peterson Number
		
		int num=148;
		int temp1,temp2,temp3=0,fact=1;
		temp1=num;
	do
		{
			temp2=num%10;
			for(int i=1;i<=temp2;i++)
			{
				fact=fact*i;
			}
			temp3=temp3+fact;
			fact=1;
			num=num/10;
		}	while(num!=0)
if(temp3==temp1)
	System.out.println("The Number  "+temp1+"is a Peterson Number");
else
	System.out.println("The Number  "+temp1+"is not a Peterson Number");
	}

}
