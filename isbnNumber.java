package numberProject;

public class isbnNumber {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
/*he ISBN number is a legal number when
 * 1*Digit1 + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7 + 8*Digit8 + 9*Digit9 + 10*Digit10
		 *  is divisible by 11.
		 *   The digits are taken from right to left.
		 *    So, if the ten-digit number is 7426985414, Digit1 and Digit10 will be 4 and 7, respectively.
		 */
		/*7*1 + 7*2 + 9*3 + 0*4 + 6*5 + 0*6 + 9*7 + 5*8 + 2*9 + 1*10 */
long num=1259060977l;
long temp=0,temp1=0,temp2=num;
for(int i=1;num!=0;i++)
{
	temp=num%10;
	temp1=temp1+(temp*i);
	num=num/10;
	}
	if((temp1%11)==0)
		System.out.println("The Number "+temp2+" is a ISBN Number");
else
	System.out.println("The Number "+temp2+" is not a ISBN Number");
	
	}

}
