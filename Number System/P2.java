import java.util.Scanner;

public class P2 {
    public static boolean checkPower(int n){
        
        int val =1;
        while(val<n){
            val=val*2;
        }
        if(val==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPower(n));
    }
}
