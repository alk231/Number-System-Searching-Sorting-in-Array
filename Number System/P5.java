import java.util.Scanner;

class P5{
    public static int findingOddOccurring(int[]arr){
        int xor=0;
        for(int i =0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findingOddOccurring(arr));
    }
}