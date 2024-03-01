public class SelectionSort {
    public static void selectionInDesc(int[]arr){
        for(int i =0;i<arr.length;i++){
            int max_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[max_idx]<arr[j]){
                    max_idx = j;
                }
            }
            if(max_idx != i){
                int temp = arr[max_idx];
                arr[max_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {3,5,1,6,0};
        selectionInDesc(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
