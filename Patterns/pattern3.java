package Patterns;

public class pattern3 {
    public static void main(String[] args) {

        int n = 8;
        System.out.println();
        for (int i = 1; i <= n; i++) {
            if (i > (n / 2)) {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("* ");
                }
                for (int sp = 1; sp <= i * 2 - n - 2; sp++) {
                    System.out.print("_ ");
                }
                for (int k = 1; k <= n - i + 1; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                for (int sp = n - i * 2; sp >= 1; sp--) {
                    System.out.print("_ ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
