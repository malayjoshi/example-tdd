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

}


