import java.util.Stack;

public class ParanthesisChecker {

	public static void main(String[] args) {
		String str = "[{(}]";
		System.out.println("Entered String is :" + str);

		paranthesisChecker(str);
	}

	private static void paranthesisChecker(String str) {

		String mystr = str;
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < mystr.length(); i++) {
			char ch = mystr.charAt(i);

			if (st.isEmpty()) {
				st.push(ch);

			} else if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else if (ch == ')') {
				if (st.peek() == '(') {
					st.pop();
				} else {
					st.push(ch);
				}
			} else if (ch == '}') {
				if (st.peek() == '{') {
					st.pop();
				} else {
					st.push(ch);
				}

			} else if (ch == ']') {
				if (st.peek() == '[') {
					st.pop();
				} else {
					st.push(ch);
				}
			}
		}
		if (st.isEmpty()) {
			System.out.println("String is Well formed ");
		} else {
			System.out.println("string is not well formed ");
		}

	}

}
