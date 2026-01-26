public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int i=0; i<=arr.length-1; i++){
            int didSwap=0;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
            }
            //if the array is already sorted it will check once and break
            if(didSwap==0){
                break;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={20,50,10,30,60,40};
        bubbleSort(arr);
    }
}
