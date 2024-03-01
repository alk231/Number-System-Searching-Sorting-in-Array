import java.util.Scanner;

public class P4 {
    public static int countSetBit(int n){
        int count=0;
        while(n>0){
            int rem = n & 1;
            count=count+rem;
            n=n>>1;
        }        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countSetBit(n));
    }
}
