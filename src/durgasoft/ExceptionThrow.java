package durgasoft;

import java.security.InvalidParameterException;

public class ExceptionThrow {

	public static void main(String[] args) {
		
		//throw new ArithmeticException("/ by 0");
		throw new InvalidParameterException("enter value");
	}

}
