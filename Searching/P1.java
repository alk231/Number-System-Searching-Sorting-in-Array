import java.util.Scanner;

class P1{
    public static int linearSearch(int[]arr , int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add :");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i =0 ;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to be searched in array :");
        int x = sc.nextInt();
        System.out.println(linearSearch(arr , x));
    }
}