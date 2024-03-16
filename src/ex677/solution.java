package ex677;

import java.util.Scanner;
import java.math.BigInteger;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String base;
        for (int i = 0; i < n; i++) {
            base = sc.next();
            BigInteger pow = new BigInteger(base);
            pow = pow.pow(2);
            
            System.out.println(pow);
        }
        sc.close();
    }

}
