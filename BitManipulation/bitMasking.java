package BitManipulation;

public class bitMasking {
    public static void main(String[] args) {
        int n=5;
        int pos=3;
        int bitMask=1<<pos;
        int opr=0;
        if(opr==1){
            System.out.println();
            System.out.println((bitMask | n));
        }else{
            System.out.println((~(bitMask))&n);
        }
    }
}
