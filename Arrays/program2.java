public class program2 {

    public static int findElement(int arr[], int key){
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }else if(key<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int key=9;
        System.out.println("Index of key Element is :- "+findElement(arr,key)+"  ");;
    }
}
