public class selectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0; i<=arr.length-2; i++){
            int minimum = i;
            for(int j=i; j<=arr.length-1; j++){
                if(arr[j]<arr[minimum]){
                    minimum=j;
                }
            }
            int temp = arr[minimum];
            arr[minimum]=arr[i];
            arr[i]=temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {20,40,10,15,80,60};
        selectionSort(arr);
    }
}
