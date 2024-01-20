package examples;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 6;
		int b = 4;
		
		swap(a,b);
	}

	private static void swap(int a, int b) {
		
		int temp =0;
		temp =a;
		a= b;
		b= temp;
		System.out.println(a);
		System.out.println(b);
		
	}

}
