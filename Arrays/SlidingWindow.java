public class SlidingWindow {
    public static int solve(int arr[],int k){
        int l=0,r=0,sum=0,maxlen=0;
        while(r<arr.length){
            sum=sum+arr[r];
            while (sum>k) {
                sum = sum-arr[l];
                l++;
            }
            if(sum<=k){
                maxlen=Math.max(maxlen,r-l+1);
                r++;
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,1,10,10};
        int k=14;
        System.out.println();
        System.out.println(solve(arr,k));
    }
}
