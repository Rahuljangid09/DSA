package Basic_Function_code;

public class fibonacci {

    public static void printFibonacci(int num){
        int a=0;
        int b=1;
        int next;
        for(int i=0; i<=num; i++){
            System.out.print(a+" ");
            next = a+b;
            a=b;
            b=next;
        }
    }
    public static void main(String[] args) {
        printFibonacci(10);
    }
}
