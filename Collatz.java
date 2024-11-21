// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		if (args[1].indexOf("v")!= -1){
			int myNum = Integer.parseInt(args[0]);
			int myNumRange = Integer.parseInt(args[0]);
			for (int i = 1; i <= myNumRange ; i++) {
			String finOut = ""+i;	
			int finOutCount = 1;
			myNum = i;
				do {
					finOutCount += 1;
					if (myNum%2==0) myNum = myNum/2; else myNum= (myNum*3) +1;
					finOut = finOut + " " + myNum;}
				while (myNum > 1);
				System.out.println(finOut + " (" + finOutCount + ")");
			}
		}
		System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
	}
}
