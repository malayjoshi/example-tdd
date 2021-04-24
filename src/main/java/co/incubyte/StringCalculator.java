package co.incubyte;

public class StringCalculator {
	public static int add(String numbers) {
		int sum=0;
		
		if( numbers.length()>0 ) {
			
			String[] splittedNumbers=numbers.split(",");
			for(int i=0;i<splittedNumbers.length;i++ )
				sum+=Integer.parseInt( splittedNumbers[i] );
				
		}
		
		return sum;
		
	}
}
