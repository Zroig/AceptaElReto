package ex399;

import java.util.HashMap;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        HashMap<Integer, Integer> perlas = new HashMap<Integer, Integer>();
        String n;
        int aux, cont, max = Integer.MIN_VALUE;
        boolean NextInLine;
        Scanner sc = new Scanner(System.in);
        while (true) {
            NextInLine = true;
            n = sc.nextLine();
            if (n.equals("0")) {
                break;
            }

            for (int i = 0; i < n.length()-2; i++) {
                
                if (!n.equals(" ")) {
                    aux = Character.getNumericValue(n.charAt(i));
                    if (perlas.containsKey(aux)) {
                        perlas.put(aux, perlas.get(aux)+1);
                    } else {
                        perlas.put(aux, 1);
                    }
                    max = Math.max(max, aux);
                }
            }
            if((perlas.size()-1) % 2 == 0) {
                System.out.println("NO");
                NextInLine = false;
            }
            if (NextInLine) {
                for (int i = 0; i < perlas.size()-1; i++) {
                    if (perlas.get(i) == 1 && perlas.get(i) != max) {
                        System.out.println("NO");
                        break;
                    }
                }
            }
            System.out.println("Se puede");
            

            }
            
        }

    }
