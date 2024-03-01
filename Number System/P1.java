import java.util.Scanner;

public class P1 {
    public static String getBinaryRepresentation(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            str.insert(0, rem);
            n = n / 2;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getBinaryRepresentation(num));
    }
}
