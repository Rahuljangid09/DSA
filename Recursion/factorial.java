public class factorial {
    public static void printFact(int n, int i, int fact){
        if(n==0){
            System.out.println(1);
            return;
        }
        if(i==n){
            fact=fact*i;
            System.out.println(fact);
            return;
        }
        fact=fact*i;
        printFact(n, i+1, fact);
    }
    public static void main(String[] args) {
        System.out.println();
        printFact(5, 1, 1);
    }
}
