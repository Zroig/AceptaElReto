package ex682;
import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int patos = 0;
        for (int i = 0; i < n; i++) {
            patos = sc.nextInt();
            System.out.println(patos+" "+patos*2);
        }
        sc.close();
    }
}
