package ex397;
import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, cont = 0;
        for (int i = 0; i < n; i++) {
             a = sc.nextInt();
             cont = (a/2) * (a+1);
            if (cont % 3 == 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

}
