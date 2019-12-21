package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double x, double y) throws IllegalArgumentException{
		double quotient = y/x;
		if (x == 0.0) {
			throw new IllegalArgumentException();
		}
		return quotient;
	}

	public String reverseString(String strNoob) throws IllegalStateException{
	String reverse = "";
	for (int i = strNoob.length()-1; i >= 0; i--) {
		reverse = reverse + strNoob.charAt(i);
	}
	if (strNoob.equals("")) {
			throw new IllegalStateException();
		}
	
	
		return reverse;
		
	}

}
