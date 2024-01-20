package examples;

import java.util.Stack;

public class Pallindrome1 {

	public static void main(String[] args) {
		String s = "ABCDCBA";
		boolean result = isPallindrome(s);
		System.out.println(result);
	}

	private static boolean isPallindrome(String s) {
		int n = s.length();
		int i =0;
		Stack<Character> stack = new Stack<>();
		for(i = 0; i<n/2; i++) {
			stack.push(s.charAt(i));
		}
		if(n%2 != 0) {
			i++;
		}
		for(; i< n; i++) {
			if(stack.pop() != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
