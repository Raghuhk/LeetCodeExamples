package example.easy;

public class ReverseInteger {
	
	public static void main(String []s){
		/*Integer x = 200;
		Boolean isNegative = x<0?true:false;
		if(isNegative){
			x=x*-1;
		}
		Integer[] output = new Integer[20];
		Integer outputInt= 0;
		int outputIndex=0;
		for(int i =10, j=0, remainder=0 ;j<10;i=i*10, outputIndex++, j++){
			remainder=(x%i)/(i/10);
			output[outputIndex]=remainder;
		}
		
		
		
		for(int i =outputIndex-1, multiplier=1;i>=0;i--, multiplier=multiplier*10){
			/*if(outputInt+(output[i]*multiplier) < outputInt){
				outputInt=0;
				break;
			}*//*
			if(output[i]<0){
				break;
			}outputInt=outputInt+(output[i]*multiplier);
		}
		if(isNegative){
			outputInt=outputInt*-1;
		}
		System.out.println(outputInt);
		System.out.println(Integer.MAX_VALUE);
		
		
		//return outputInt;*/
		
		System.out.println(reverseModified(3456));
		System.out.println(reverseModified(1000));
		System.out.println(reverseModified(1));
		System.out.println(reverseModified(1123455666));
		//reverseModified(6665543211);
		System.out.println(reverseModified(-1563847412));
	}
	
	public static int reverseInt(Integer x){
		Boolean isNegative = x<0?true:false;
		if(isNegative){
			x=x*-1;
		}
		Boolean validNumberStarted = false;
		Long[] output = new Long[20];
		Long outputLong= 0l;
		int outputIndex=10;
		Integer maximumOutputIndex=0;
		Long remainder = 0l;
		for(Long i=10000000000l; i>1; i=i/10, outputIndex--){
			remainder = (x%i)/(i/10);
			if(remainder>0&&!validNumberStarted){
				validNumberStarted = true;
				maximumOutputIndex = outputIndex;
			}
			if(validNumberStarted){
				output[outputIndex-1]=remainder;
			}
		}
		
		for(int i =maximumOutputIndex-1, multiplier=1;i>=0;i--, multiplier=multiplier*10){
			/*if(outputInt+(output[i]*multiplier) < outputInt){
				outputInt=0;
				break;
			}*/
			if(output[i]<0){
				break;
			}outputLong=outputLong+(output[i]*multiplier);
		}
		if(isNegative){
			outputLong=outputLong*-1;
		}
		
		if(outputLong>Integer.MAX_VALUE || outputLong < Integer.MIN_VALUE){
			outputLong=0l;
		}
		return outputLong.intValue() ;
	}
	
	private static int reverseModified(Integer x){
		Boolean isNegative = x<0?true:false;
		if(isNegative){
			x=x*-1;
		}
		Boolean validNumberStarted = false;
		Long outputLong= 0l;
		Long remainder = 0l;
		Long multiplier=1l;
		for(Long i=10000000000l; i>1; i=i/10){
			remainder = (x%i)/(i/10);
			if(remainder>0&&!validNumberStarted){
				validNumberStarted = true;
			}
			if(validNumberStarted){
				
				outputLong=outputLong+(remainder*multiplier);
				multiplier=multiplier*10;
			}
		}
		
		
		if(isNegative){
			outputLong=outputLong*-1;
		}
		
		if(outputLong>Integer.MAX_VALUE || outputLong < Integer.MIN_VALUE){
			outputLong=0l;
		}
		return outputLong.intValue() ;
	}

}
