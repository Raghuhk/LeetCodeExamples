package example.easy;

public class Palindrome {
	public static void main(String []s){
		System.out.println(isPalindrome(12344321));
		System.out.println(isPalindrome(3457543));
	}
	public static Boolean isPalindrome(int x){
		String input = new Integer(x).toString();
		Integer length = input.length();
		String firstHalf = input.substring(0,length/2);
		StringBuffer secondHalfBuffer = new StringBuffer(input.substring((length%2==0)?length/2:length/2+1)).reverse();
		if(firstHalf.equalsIgnoreCase(secondHalfBuffer.toString())){
			return true;
		}
		return false;
	}
	
	public static Boolean revisedIsPalindrome(int x){
		int lengthOfInt = findLengthOfInt(x);
		Boolean isPalindrome=true;
		for(int i =1;i<=lengthOfInt/2;i++){
			if(findNumberAtPosition(x, i)!=findNumberAtPosition(x,lengthOfInt+1-i)){
				isPalindrome=false;
				break;
			}
		}
		return isPalindrome;
	}
	
	public static int findNumberAtPosition(long number, int position){
		if(number<0){
			number= number*-1;
		}
		long multiplier = 10;
		long divisor = 1;
		for(int i =1;i<position;i++){
			multiplier=multiplier*10;			
			divisor = divisor*10;
		}
		long numberAtPosition = (number%(multiplier))/(divisor);
		return new Long(numberAtPosition).intValue();
	}
	
	public static int findLengthOfInt(long number){
		if(number<0){
			number= number*-1;
		}
		long length=0;
		for(int i = 1000000000, j=10;i>=1;i=i/10, j--){
			if(number/i>0){
				length = j;
				break;
			}
			
		}
		return new Long(length).intValue();
		
	}
	

}
