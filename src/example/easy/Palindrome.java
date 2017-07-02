package example.easy;

public class Palindrome {
	public static void main(String []s){
		System.out.println(isPalindrome(12344321));
		System.out.println(isPalindrome(3457543));
	}
	public static Boolean isPalindrome(int x){
		String input = new Integer(x).toString();
		Boolean isPalindrome = false;
		Integer length = input.length();
		Integer halfLength=(length%2==0)?length/2:length/2+1;
		String firstHalf = input.substring(0,length/2);
		String secondHalf = input.substring(halfLength);
		StringBuffer secondHalfBuffer = new StringBuffer();
		secondHalfBuffer.append(secondHalf);
		secondHalfBuffer.reverse();
		String secondHalfReverse=secondHalfBuffer.toString();
		if(firstHalf.equalsIgnoreCase(secondHalfReverse)){
			isPalindrome=true;
		}
		return isPalindrome;
	}
	

}
