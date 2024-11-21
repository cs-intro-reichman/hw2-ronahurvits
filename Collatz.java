// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int myNum = Integer.parseInt(args[0]);
		String finOut = args[0];
		int myNumRange = Integer.parseInt(args[0]);
		for (int i = 1; i <= myNum; i++) {
			myNum += 1;
			// while (myNum > 1) {
			// 	// System.out.println("test" +myNum);
			// 	if (myNum%2==0) myNum = myNum/2; else myNum= (myNum*3) +1;
			// 	finOut = finOut + ", " + myNum;
			// }
			while (myNum > 1) {
				// System.out.println("test" +myNum);
				if (myNum%2==0) myNum = myNum/2; else myNum= (myNum*3) +1;
				finOut = finOut + ", " + myNum;
			}
			
			System.out.println(finOut);
		}
		System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1");
	}
}
