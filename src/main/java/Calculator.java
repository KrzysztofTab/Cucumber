public class Calculator {
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static int subtractTwoNumbers(int a, int b) {
        return a - b;
    }

    public static int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }

    public static float divideTwoNumbers(float a, float b) {
        if (b == 0) {
            System.out.println("b nie może być 0");
            return 0;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        int result = addTwoNumbers(7, 8);
        System.out.println(result);

        /*nt result = subtractTwoNumbers(7, 8);
        System.out.println(result);*/

    }
}
