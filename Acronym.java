package String;

import java.util.Arrays;
import java.util.List;

public class Acronym {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("alice", "bob", "charlie");
		String s = "abc";
		boolean ans = isAcronym(words, s);
		System.out.println(ans);
	}

	private static boolean isAcronym(List<String> words, String s) {

		StringBuilder sb = new StringBuilder();
		int n = words.size();
		for(int i = 0; i< n ; i++) {
			String word = words.get(i);
			sb.append(word.charAt(0));
		}
		if(sb.toString().equals(s)) {
			return true;
		}
		return false;
	}

}
