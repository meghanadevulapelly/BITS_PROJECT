package day10;

public class CheckParanthesisValidOrNot {
    public static void main(String[] args) {
        String str = "({[]})";
        boolean isValid = checkParanthesis(str);
        if (isValid) {
            System.out.println("The paranthesis is valid.");
        } else {
            System.out.println("The paranthesis is not valid.");
        }
    }

    public static boolean checkParanthesis(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // Invalid character or mismatched paranthesis
            }
        }
        return stack.isEmpty(); // Valid if stack is empty at the end
    }
}
