package study;

import java.util.Scanner;

public class StringCalculator {
    public static int calculator(String input) {
        String[] array = input.split("\\s");
        int result = Integer.parseInt(array[0]);
        String operator = null;
        for (int i=1;i< array.length;i++) {
            if(i % 2 == 0) {
                int num = Integer.parseInt(array[i]);
                if (operator != null) {
                    if (operator.equals("+")) {
                        result += num;
                    } else if (operator.equals("-")) {
                        result -= num;
                    } else if (operator.equals("*")) {
                        result *= num;
                    } else if (operator.equals("/")) {
                        result /= num;
                    }
                }
            } else {
                operator = array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //"2 + 3 * 4 / 2"
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        calculator(input);
    }
}
