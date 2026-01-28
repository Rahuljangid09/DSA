public class prog3 {

    public static double solve(int arr[], int k){
        int l=0,r=k-1;
        double maxAvg = 0,sum=0;
        for(int i=l; i<=r; i++){
            sum+=arr[i]; 
        }
        if(arr.length==k){
            return sum/k;
        }else if(arr.length==1){
            return sum/k;
        }
        while(r<arr.length-1){
            sum-=arr[l];
            l++;
            r++;
            sum+=arr[r];
            maxAvg = Math.max(maxAvg, sum/k);
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        int arr[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println();
        System.out.println(solve(arr,k));
    }
}
