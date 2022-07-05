package homework1;

public class Operations {

    public static int getA() {
        int result = -5 + 8 * 6;
        System.out.println("-5 + 8 * 6 = " + result);
        return result;
    }

    public static int getB() {
        int result = (55 + 9) % 9;
        System.out.println("(55+9) % 9 = " + result);
        return result;
    }

    public static int getC() {
        int result = 20 + -3 * 5 / 8;
        System.out.println("20 + -3*5 / 8 = " + result);
        return result;
    }

    public static int getD() {
        int result = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + result);
        return result;
    }

}
