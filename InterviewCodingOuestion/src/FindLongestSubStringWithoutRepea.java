import java.util.HashSet;

public class FindLongestSubStringWithoutRepea {

	public static void main(String[] args) {

		String str = "abcdefaghijklmnop";// output should be abcd
		System.out.println("Enterned String is :" + str);

		String longestsubString=findLongestSubString(str);
		System.out.println("We found longest SubString in given string :"+longestsubString);
	}

	private static String findLongestSubString(String str) {

		String longesttillNow = "";
		String longestOverall = "";

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (set.contains(ch)) {
				set.clear();
				longesttillNow = "";

			}
			longesttillNow += ch;
			set.add(ch);
			if (longesttillNow.length() > longestOverall.length()) {
				longestOverall = longesttillNow;
			

			}

		}
		return longestOverall;
		

	}

}
