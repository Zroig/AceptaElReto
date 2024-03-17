package ex156;

import java.util.ArrayList;
import java.util.Scanner;

public class solution {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    while (n-- > 0) {
        ArrayList<String> redos = new ArrayList<String>();
        ArrayList<String> words = new ArrayList<String>();
        boolean newWord = false;
        String rd;
        while (true) {
            rd = sc.next();
            if (rd.equals(".")) {
                break;
            }
            if (rd.equals("<")) {
                if (words.size() > 0) {
                    redos.add(words.get(words.size()-1));
                    words.remove(words.size()-1);
                }
                newWord = false;
                continue;
            }
            if (rd.equals(">")) {
                if (redos.size() > 0) {
                    if (newWord) {
                        if (words.size() > 0) {
                            words.add(words.get(words.size()-1));
                        }
                    } else {
                        words.add(redos.get(redos.size()-1));
                        redos.remove(redos.size()-1);
                        newWord = true;
                    }
                } else {
                    if (words.size() > 0) {
                        if (newWord) {
                            words.add(words.get(words.size()-1));
                        }

                    }
                }
                continue;
            }
            newWord = true;
            words.add(rd);

        }
        for (int i = 0; i< words.size(); i++) {
            System.out.print(words.get(i)+(i == words.size()-1 ? "": " "));
        }
        System.out.println("");

    }
    sc.close();
   }
}
