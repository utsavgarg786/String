package examples;

public class Fibonaci {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int count =10;
		System.out.print(n1 + " " + n2);
		fibonaci(n1, n2, count);
	}

	private static void fibonaci(int n1, int n2, int count) {
		int n3;

		for(int i = 2; i< count; i++) {
			n3 = n1+n2;
			System.out.print(" ");
			System.out.print(n3);
			n1 = n2;
			n2 = n3;
			
		}
		
	}

}
