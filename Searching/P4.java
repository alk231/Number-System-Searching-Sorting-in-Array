public class P4 {
    public static int countRightMostOccurrence(int[]arr , int target){
        int l=0;
        int h=arr.length-1;
        int result = -1;
        while(l<=h){
            int m=l+(h-l);
            if(arr[m]==target){
                l=m+1;
                result=m;
            }
            else if(arr[m]<target){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return result;
    }
    public static int countLeftMostOccurrence(int[]arr , int target){
        int l=0;
        int h=arr.length-1;
        int result =-1;
        while(l<=h){
            int m=l+(h-l);
            if(arr[m]==target){
                h=m-1;
                result=m;
            }
            else if(arr[m]<target){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[]arr={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 6;
        int right=countRightMostOccurrence(arr,target);
        int left=countLeftMostOccurrence(arr,target);
        System.out.println( "Target "+target +" occurs "+(right-left+1)+" times");
    }
}
