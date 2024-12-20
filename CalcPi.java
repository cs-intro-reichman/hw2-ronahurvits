// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int iterations = Integer.parseInt(args[0]);
		double one = (double) 1;
		double initDenominator = (double) 1;
		double calcPi = 0;
		for (int i = 0; i < iterations; i++) {
			if (i%2 == 0) calcPi += (one/initDenominator);
			else calcPi -= (one/initDenominator);
			initDenominator +=2;

		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + calcPi*4);
	}
}
