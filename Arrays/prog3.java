public class prog3 {

    public static char solve(char arr[], char target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]>target){
                return arr[i];
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        char arr[] = {'c', 'f', 'j'};
        char target = 'f';
        System.out.println();
        System.out.println(solve(arr, target));
    }
}
