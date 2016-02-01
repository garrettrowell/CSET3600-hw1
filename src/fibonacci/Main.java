package fibonacci;

public class Main {
	public static void main(String[] args) {
		int n;
		if (args.length >0) {
			n = Integer.parseInt(args[0]);
		} else {
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Enter the nth term to calculate the Fibonacci Sequence to:");
			n = input.nextInt();
			input.close();
		}
		for(int i =0; i<=n; i++) {
			System.out.println("Fibbo(" + i + ") = " + BinetsFormula(i));
		}
	}
	
	public static int BinetsFormula(int n) {
		int ans = (int) (( Math.pow((1 + Math.sqrt(5)), n) - Math.pow((1 - Math.sqrt(5)), n))/(Math.pow(2, n) * Math.sqrt(5)));
		return ans;
	}
}