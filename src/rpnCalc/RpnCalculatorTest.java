package rpnCalc;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class RpnCalculatorTest {

	@Test
	public void createCalculatorWithZeroInAccumulator() {
		RpnCalculator calc = new RpnCalculator();
		assertThat(calc.getAccumulator(), is(0));

	}			

	@Test
	public void setSomeNumberToAccumulator() {
		RpnCalculator calc = new RpnCalculator();
		calc.setAccumulator(5);
		assertThat(calc.getAccumulator(), is(5));

	}

	@Test
	public void calculatorSupportsAddition() {
		RpnCalculator c = new RpnCalculator();
		c.setAccumulator(1);
		c.enter();
		c.setAccumulator(2);
		c.plus();
		assertThat(c.getAccumulator(), is(3));
	}

	@Test
	public void calculatorSupportsAdditionAndMultiplication() {
		RpnCalculator c = new RpnCalculator();
		c.setAccumulator(1);
		c.enter();
		c.setAccumulator(2);
		c.plus();
		c.enter();
		c.setAccumulator(4);
		c.multiply();
		assertThat(c.getAccumulator(), is(12));
	}

	@Test
	public void doAdditionForOnePairOfNUmbersThenForSecondAndMultiplyTheResults() {
		RpnCalculator c = new RpnCalculator();
		c.setAccumulator(4);
		c.enter();
		c.setAccumulator(3);
		c.plus();
		c.enter();
		c.setAccumulator(2);
		c.enter();
		c.setAccumulator(1);
		c.plus();
		c.multiply();
		assertThat(c.getAccumulator(), is(21));
	}

	@Test
	public void calculateFromStringInput() {
		RpnCalculator c = new RpnCalculator();
		int result = c.evaluate("5 1 2 + 4 * + 3 + ");
		assertThat(result, is(20));
	}

}
