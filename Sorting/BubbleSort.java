class BubbleSort{
    public static void bubbleInDesc(int[]arr){
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = true;
                }
            }
            if(flag == false) break;
        }
    }
    public static void main(String[] args) {
        int []arr= {3,5,1,6,0};
        bubbleInDesc(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}