package fibonacci;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter the nth term to calculate the Fibonacci Sequence to:");
		int n = input.nextInt();
		for(int i =0; i<=n; i++) {
			System.out.print(" " + BinetsFormula(i));
		}
		input.close();
	}
	
	public static int BinetsFormula(int n) {
		int ans = (int) (( Math.pow((1 + Math.sqrt(5)), n) - Math.pow((1 - Math.sqrt(5)), n))/(Math.pow(2, n) * Math.sqrt(5)));
		return ans;
	}
}