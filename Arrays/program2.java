public class program2 {

    public static int findElement(int arr[], int key){
       int l = 0;
       int r = arr.length-1;
       while(l<r){
        int mid = (l+r)/2;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]>key){
            r = mid-1;
        }else{
            l=mid+1;
        }
       }
       return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int key=9;
        if(findElement(arr, key)==-1){
            System.out.println("Element not found!");
        }else{
            System.out.println("Element found at index: "+findElement(arr, key));
        }
    }
}
