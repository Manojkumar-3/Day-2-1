package basics1;

public class Sqrt {

	public static void main(String[] args) {
		double result,number=99;
		 
		double squareRoot = number / 2;
	 
		do {
			result = squareRoot;
			squareRoot = (result + (number / result)) / 2;
		} while ((result - squareRoot) != 0);
	 
		System.out.println(squareRoot);
	    }   

	}


