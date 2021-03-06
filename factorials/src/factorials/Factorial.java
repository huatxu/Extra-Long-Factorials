package factorials;

import java.math.BigInteger;

public class Factorial { 
	private int num;
	public Factorial(int num) {
		this.num = num;
	}
	public BigInteger get() {
		return factorialRec(num);
	}
	private BigInteger factorialRec(int number) {
		if(number == 1) {
			return new BigInteger("1");
		} else return new BigInteger( "" + number ).multiply(factorialRec(number - 1));
	}
}
