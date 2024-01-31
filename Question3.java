import java.util.Scanner;
import java.util.Stack;
public class Question3 {
    public void verify() {
        System.out.println("enter the string you want to verify");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim().replaceAll("\\s", "");//remove all white spaces
        boolean result = isPalindrome(input);
        System.out.printf(" The answer is "+result );
    }


    private boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        int length = input.length();
        int middle = input.length() / 2;
        for (int i = 0; i < middle; i++)
            stack.push(input.charAt(i));
        //even number
        if (input.length() % 2 == 0) {
            for (int i = middle; i < length; i++) {
                if (stack.empty()) return true;
                if (stack.pop() != input.charAt(i))
                    return false;
            }
        }
        //odd number
        for (int i = middle + 1; i < length; i++) {
            if (stack.empty()) return true;
            if (stack.pop() != input.charAt(i))
                return false;
        }
        return true;
    }
}

