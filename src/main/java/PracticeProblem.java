public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean validIndex(int[] input, int index) {
		try {
			if((input[index])!=132323233) {
				return true;
			}
			return true;
		}
		catch (ArrayIndexOutOfBoundsException aIE) {
			return false;
		}
	}
	public static int divide(int one, int two) {
		try {
			return one/two;
		}
		catch (ArithmeticException aE) {
			return 0;
		}
	}
	public static int safeConvertStringtoInt(String input) {
		try {
			return Integer.parseInt(input);
		}
		catch (NumberFormatException nFE) {
			return 0;
		}
	}

	

}
