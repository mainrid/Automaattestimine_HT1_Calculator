package stringCalc;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class StringCalcTest {

	@Test
	public void emtyInputShouldReturnZero() {
		Calculator calc= new Calculator();
		int result= calc.add("");
		assertThat(result, is(0));
		
	}
	
	@Test
	public void numberOneInputShouldReturnOne() {
		Calculator calc= new Calculator();
		int result= calc.add("1");
		assertThat(result,is(1));
		
	}
	
	@Test
	public void twoOrMoreNumbersReturnsTheSum() {
		Calculator calc= new Calculator();
		int result= calc.add("1, 2");
		assertThat(result, is(3));
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void nullInputReturnsIllegalArgumentException() {
		Calculator calc= new Calculator();		
		calc.add(null);
	
	}
	

}
