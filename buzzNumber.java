package numberProject;
import java.util.*;


public class buzzNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A Number is said to be Buzz if it ends with the Number
		//7 or if the number is divisible by 7
		int num;
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Number");
		num=input.nextInt();
	int temp;
	temp =num%10;
		if ((temp==7) || ((num%7)==0))
			System.out.println("The Number  "+num+" is a Buzz Number");
		else
			System.out.println("The Number  "+num+" is not a Buzz Number");

	}

}
