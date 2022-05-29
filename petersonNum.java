package numberProject;

public class petersonNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=148;
		int temp1,temp2,temp3=0,fact=1;
		temp1=num;
		while(num!=0)
		{
			temp2=num%10;
			for(int i=1;i<=temp2;i++)
			{
				fact=fact*i;
			}
			temp3=temp3+fact;
			fact=1;
			num=num/10;
		}
if(temp3==temp1)
	System.out.println("The Number  "+temp1+"is a Peterson Number");
else
	System.out.println("The Number  "+temp1+"is not a Peterson Number");
	}

}
