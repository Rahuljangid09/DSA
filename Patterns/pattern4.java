package Patterns;

public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int num;
        System.out.println();
        for(int i=1; i<=n; i++){
            num=i;
            for(int sp=1; sp<=n-i; sp++){
                System.out.print("_ ");
            }
            for(int j=1; j<=i; j++){
                System.out.print((num--)+" ");
            }
            for(int k=2; k<=i; k++){
                System.out.print((k)+" ");
            }
            System.out.println();
        }
    }
}
