package stringCalc;

public class Calculator {

	public int add(String number) {
		if (number==null) throw new IllegalArgumentException();
		if	(number.isEmpty())	return 0;
		
		int sum=0;
		for (String num : number.split(", ")) {
			sum+=Integer.parseInt(num);
		}
		return sum;
		

	}

}
