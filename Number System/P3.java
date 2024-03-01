import java.util.Scanner;

public class P3 {
    public static boolean isEven(int n){

        int num = n & 1;
        if(num==1){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}
