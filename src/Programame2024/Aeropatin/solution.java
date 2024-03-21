package Programame2024.Aeropatin;

import java.util.Scanner;

public class solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h, w;
            boolean can;
            
            while(true) {
                h = sc.nextInt();
                w = sc.nextInt();
                if (h == 0 && w == 0) {
                 break;   
                }
                char[][] m = new char[h][w];

                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        m[i][j] = sc.next().charAt(0);
                    }
                }
                can = canArrive(m, 0, 0, h, w);

                if (can == true) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
                

                
            }
        }
        public static boolean canArrive(char[][] m, int x, int y, int h, int w) {
            if (x == w-1 && y == h-1) {
                return true;
            }
            m[y][x] = 'Z';

            if (x+1<w && (m[x+1][Y] != 'X' && m[y][x+1] != 'Z')) {
                return canArrive(m, x+1, y, h, w);
            } else if (y+1<h  && (m[y+1][x] != 'X' && m[y+1][x] != 'Z')) {
                return canArrive(m, x, y+1, h, w);
            } else if (0<=x-1 && (m[y][x-1] != 'X' && m[y][x-1] != 'Z')) {
                return canArrive(m, x-1, y, h, w);
            } else if (0<=y-1 && (m[y][y-1] != 'X' && m[y][y-1] != 'Z')) {
                return canArrive(m, x, y-1, h, w);
            } else {
                m[y][x]='X';
                if (0<=x-1 && (m[y][x-1] != 'X' && m[y][x-1] == 'Z')) {
                    return canArrive(m, x-1, y, h, w);
                } else if (0<=y-1 && (m[y][y-1] != 'X' && m[y][y-1] == 'Z')) {
                    return canArrive(m, x, y-1, h, w);
                } else if (x+1<w && (m[y][x+1] != 'X' && m[y][x+1] == 'Z')) {
                    return canArrive(m, x+1, y, h, w);
                } else if (y+1<h  && (m[y+1][x] != 'X' && m[y+1][x] == 'Z')) {
                    return canArrive(m, x, y+1, h, w);
                }
            }

            


            return false;
        }
        

}
