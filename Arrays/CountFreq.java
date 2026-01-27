public class CountFreq {
    public static void countFreq(int arr[]){
        boolean[] visited = new boolean[arr.length];
        for(int i=0; i<arr.length; i++){
            int count=0;
            if(visited[i]) continue;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println("Frequency of element "+ arr[i]+" is "+count);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,2,2,3};
        countFreq(arr);
    }
}
