package co.incubyte;

public class StringCalculator {
	public static int add(String numbers) {
		int sum=-1;
		
		if(numbers.length()==0)
			sum=0;
		else if( numbers.length()==1 )
			sum=Integer.parseInt(numbers);
		
		return sum;
		
	}
}
