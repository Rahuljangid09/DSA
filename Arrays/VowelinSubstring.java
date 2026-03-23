public class VowelinSubstring {
    public static int VowelinSubstring(String str, int k){
        int r=k-1,maxCount=0;
        for(int i=0; i<str.length(); i++){
            int count = 0;
            for(int j=i; j<=r && j<str.length(); j++){
                if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'){
                    count++;
                }
            }
            maxCount=Math.max(maxCount, count);
            r++;
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String str = "abciiidef";
        int k=3;
        System.out.println();
        System.out.println(VowelinSubstring(str,k));
    }
}
