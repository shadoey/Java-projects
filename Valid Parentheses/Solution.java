import java.util.Stack;

public class Solution {

    public boolean Parentesis(String A) {
        if (A.length() % 2 != 0) {
            return false;
        }
        Stack<Character> p = new Stack<>();
        for (char s : A.toCharArray()) {
            if (s == '(' || s == '{' || s == '[') {
                p.push(s);
            } else {
                if (s == ')' && !p.isEmpty() && p.peek() == '(') {
                    p.pop();
                } else {
                    if (s == '}' && !p.isEmpty() && p.peek() == '{') {
                        p.pop();
                    } else {
                        if (s == ']' && !p.isEmpty() && p.peek() == '[') {
                            p.pop();
                        }
                    }

                }

            }

        }
        return p.isEmpty();
    }
}
