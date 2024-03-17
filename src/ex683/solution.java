package ex683;

import java.util.ArrayList;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        while (true) {
            int max = -50, min = 300;
            int ntemp = 0, pos = 0;
            ntemp = sc.nextInt();
            if (ntemp == 0) {
                break;
            }
            int[] arr = new int[ntemp];
            for (int i = 0; i < ntemp; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(arr[i], max);
                min = Math.min(arr[i], min);
            }
            if (min != max) {
                ArrayList<Integer> maxims = new ArrayList<Integer>();
                ArrayList<Integer> minims = new ArrayList<Integer>();
              for (int i = 0; i < ntemp; i++) {
                   if (arr[i] == min) {
                      minims.add(i);
                 } else if (arr[i] == max) {
                     maxims.add(i);
                 }
               }
               int minrepmax = 200001;
               int abs;
               for (int i = 0; i<maxims.size(); i++) {
                   for (int j= 0; j < minims.size(); j++) {
                    abs = Math.abs(maxims.get(i)-minims.get(i));
                        minrepmax=Math.min(abs,minrepmax);
                    }
             }
                pos = minrepmax;
            }
            


            System.out.println(min+" "+max+" "+pos);
        }
    }

}
