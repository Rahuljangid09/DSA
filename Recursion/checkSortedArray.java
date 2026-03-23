public class checkSortedArray {
    public static boolean flag=true;
    public static void checkSorted(int arr[], int idx){
        if(idx==arr.length-1){
            System.out.println(flag);
            return;
        }
        if(arr[idx]>arr[idx+1]){
            flag=false;
        }
        checkSorted(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,4};
        System.out.println();
        checkSorted(arr,0);
    }
}
