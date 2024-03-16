package ex676;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String anys;
        int anyinici, anyfinal, cont1 = 0, cont2 = 0;
        for(int i = 0; i < n; i++) {
            cont1 = 0;
            cont2 = 0;
            anys = sc.nextLine();
            String[] aux = anys.split(" ");
            anyinici = Integer.parseInt(aux[0]);
            anyfinal = Integer.parseInt(aux[1]);
            for (int j = anyinici; j <= anyfinal; j++) {
                if (j % 100 == 0 && j % 400 == 0) {
                    cont1++;
                } else if (j % 4 == 0 && j % 100 != 0) {
                    cont1++;
                } else {
                    cont2++;
                }
            }
            System.out.println(cont2+" "+cont1);
        }
        sc.close();
    }

}
