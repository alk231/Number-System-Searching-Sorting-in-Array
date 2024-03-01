class P2{
    public static int lastOccurrence(int[]arr,int target){
        int l=0;
        int h = arr.length - 1;
        int result = -1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(arr[m]== target){
                result= m;
                l = m+1;
            }
            else if(arr[m]<target){
                l=m+1;
            }
            else{
                h=m-1;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[]arr= {1,1,1, 2 ,3 ,4, 4, 5, 6,6,6,6};
        int target= 4;
        int result = lastOccurrence(arr,target);
        System.out.println(result);
    }
}