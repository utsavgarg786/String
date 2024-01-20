package examples;

public class ReverseString {

	public static void main(String[] args) {

		String s = "utsavabc";
		reverseString(s);
	}

	private static void reverseString(String s) {
		
		char[] a = s.toCharArray();
		char temp;
		int start = 0;
		int n = a.length-1;
		for(int i = n; i>= start; i--) {
			temp = a[start];
			a[start] = a[i];
			a[i] = temp;
			start++;
		}

		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * char[] a = s.toCharArray(); char temp; int start = 0; int end = a.length -1;
		 * for(int i =end; i>= start;i--) { temp = a[start]; a[start] = a[i]; a[i] =
		 * temp; start++; } System.out.println(a);
		 */
	}
}
