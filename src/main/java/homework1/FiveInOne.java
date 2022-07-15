package homework1;

public class FiveInOne {

    public static int sum(int a, int b) {
        int result = a + b;
        System.out.println(a + " + " + b + "" + " = " + result);
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        System.out.println(a + " * " + b + "" + " = " + result);
        return result;
    }

    public static int subtract(int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + "" + " = " + result);
        return result;
    }

    public static int divide(int a, int b) {
        int result = a / b;
        System.out.println(a + " / " + b + "" + " = " + result);
        return result;
    }

    public static int remainder(int a, int b) {
        int result = a % b;
        System.out.println(a + " % " + b + "" + " = " + result);
        return result;
    }
}

