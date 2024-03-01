public class P5 {
    public static boolean isPerfectSquare(int n){
        int l =0;
        int h= n;
        boolean boolValue=false;
        while(l<=h){
            int m =l+(h-l)/2;
            int result=m*m;
            if(result==n){
                boolValue= true;
                break;
            }
            else if(result>n){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return boolValue;
    }
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
}
