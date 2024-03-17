package ex680;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int longitud, recorregut, descans, avance=0, cont=0;
        int[] split = new int[3];
        for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    split[j] = sc.nextInt();
                }
            longitud = split[0];
            recorregut = split[1];
            descans = split[2];
            avance = 0;
            cont = 0;
           while (true) {
            if (avance >= longitud) {
                System.out.println(cont);
                break;
            }
            cont++;
            avance += recorregut;
            if (avance < longitud) {
                avance -= descans;
            }
            if (avance <= 0) {
                System.out.println("IMPOSIBLE");
                break;
            }
           
            
            

           }

        }
        sc.close();
    }

}
