package rpnCalc;

import java.util.Stack;

public class RpnCalculator {

	private Stack<Integer> stack;
	private int accumulator;

	public RpnCalculator() {
		this.stack = new Stack<Integer>();
		this.accumulator = 0;
	}

	private void ifNextIsNumberPutToStack(String string, int index) {
		if (index < string.length()) {
			char ch = string.charAt(index);
			if (Character.isDigit(ch)) {
				this.enter();
			}
		}
	}

	public int evaluate(String string) {
		string = string.replace(" ", "");
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == '+') {
				this.plus();
				ifNextIsNumberPutToStack(string, i + 1);
			} else if (ch == '*') {
				this.multiply();
				ifNextIsNumberPutToStack(string, i + 1);
			} else {
				this.setAccumulator(Character.getNumericValue(ch));
				ifNextIsNumberPutToStack(string, i + 1);
			}
		}
		return this.getAccumulator();
	}

	public void multiply() {
		int sumOfTwo = this.drop();
		this.setAccumulator(sumOfTwo * this.getAccumulator());
	}

	public void plus() {
		int firstNumber = this.drop();
		this.setAccumulator(firstNumber + this.getAccumulator());
	}

	public void enter() {
		stack.push(this.getAccumulator());

	}

	public int getAccumulator() {
		return this.accumulator;
	}

	public int drop() {
		return this.stack.pop();
	}

	public void setAccumulator(int i) {
		this.accumulator = i;

	}

}
