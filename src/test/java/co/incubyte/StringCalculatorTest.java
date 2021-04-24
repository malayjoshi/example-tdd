package co.incubyte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

private StringCalculator calculator;
	
	//set up 
	@BeforeEach                                         
    public void setUp() throws Exception {
        calculator = new StringCalculator();
    }
	
	@Test                                               
    @DisplayName("Empty String should return 0")   
    public void testEmptyString() {
        assertEquals(0, calculator.add(""));          
    }
	
	@Test
	@DisplayName("A number string should return number")
	public void testSingleNumberString() {
		assertEquals(1, calculator.add("1"));
	}
	
	@Test
	@DisplayName("A sum should be returned for numbers delimited by comma")
	public void testSumReturnForNumbersDelimitedByComma() {
		assertEquals(5,calculator.add("2,3") );
	}
	
	@Test
	@DisplayName("A sum should be returned on multiple numbers")
	public void testSumReturnForMultipleNumbers() {
		assertEquals(6,calculator.add("1,2,3") );
	}
	
	@Test
	@DisplayName("A sum should be returned for numbers including new line")
	public void testSumReturnedForStringWithNewLine() {
		assertEquals( 6,calculator.add("1\n2,3") );
	}

}


