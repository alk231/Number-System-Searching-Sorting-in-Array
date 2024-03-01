public class P3 {
    public static int countTotalNoOfOne(int[]arr){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int m=l+(h-l);
            if(arr[m]==0){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return arr.length -l;
    }
    public static void main(String[] args) {
        int[]arr={0 ,0 ,0 ,0 ,1, 1 ,1 ,1 ,1 ,1};
        int result=countTotalNoOfOne(arr);
        System.out.println(result);
    }
}
