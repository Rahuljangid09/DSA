public class checkSorted {

    public static boolean checkSorted(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={20,90,100,120};
        if(checkSorted(arr)){
            System.out.println("Given array is sorted");
        }else{
            System.out.println("Not sorted");
        }
    }
}
