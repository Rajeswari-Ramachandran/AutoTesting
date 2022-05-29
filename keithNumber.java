package numberProject;

public class keithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=742;
		int temp1=0,temp2=0;
		while(num!=0)
		{
			//temp1=num/10;
			temp2=num%10;
			temp1=temp1+temp2;
			
			System.out.println(temp1);
			num=num/10;
		}

	}

}
