package numberProject;
import java.util.*;

public class evilNumber {

	public static void main(String[] args) {
		
		 int val,temp=0,x,temp1=0;
	        /* Evil Number - get the binary value of the number 
	         * and check the number of of 1's in its binary equivalent
	         * '
	         */
		 @SuppressWarnings("resource")
		 Scanner input=new Scanner(System.in);
		 System.out.println("The Enter the Number");
		 val=input.nextInt();
		 String bi=Integer.toBinaryString(val);
	        x=Integer.valueOf(bi);
	       while(x!=0)
	        {
	        	temp=x%10;
	        	if(temp==1)
	        		temp1=temp1+1;
	           	else
	        		System.out.println();
	        			
	          x=x/10;
	        
	        }
	  
	       if((temp1%2)==0)
	    	   System.out.println("The Entered Number "+val+" is a Evil Number");
	       else
	    	   System.out.println("The Entered Number "+val+" is not a Evil Number");
	}

}
