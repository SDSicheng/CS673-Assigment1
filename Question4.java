import java.util.Scanner;
import java.util.Stack;
public class Question4 {
    public void combine() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter your first list:(separated by\",\")");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("enter your second list:(separated by\",\")");
        String input1 = scanner1.nextLine().trim();
        String input2 = scanner2.nextLine().trim();

        StringBuilder result = new StringBuilder();

        if (!isSameLength(input1, input2)) {
            System.out.println("Not the same length");
        } else {
            for (int i = 0; i < input1.length(); i++) {
                result.append(input1.charAt(i));
            }
            result.append(",");
            for (int i = 0; i < input2.length(); i++) {
                result.append(input2.charAt(i));
            }
            System.out.println("["+result.toString()+"]");
        }
    }

    private boolean isSameLength(String input1, String input2) {
        String[] list1 = input1.split(",");
        String[] list2 = input2.split(",");

        return list1.length == list2.length;
    }

}
