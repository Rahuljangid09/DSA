package Patterns;

public class pattern5 {
    public static void main(String[] args) {
        int n = 4;
        int totalrow = 2 * n - 1;
        System.out.println();
        for (int i = 1; i <= totalrow; i++) {

            int stars;
            int space;

            if (i > n) {
                stars = 2 * (totalrow - i + 1) - 1;
                space = i - n;
            } else {
                stars = i * 2 - 1;
                space = n - i;
            }

            for (int sp = 1; sp <= space; sp++) {
                System.out.print("_ ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
