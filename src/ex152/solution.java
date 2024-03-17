package ex152;
import java.util.Scanner;
import java.util.*;

public class solution {
	public static void main(String[] args) {
		int n;
		int aux;
		int max;
		int maxKey = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			//valor, repeticions
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			for (int i = 0; i<n; i++) {
				aux = sc.nextInt();
				if (map.containsKey(aux)) {
					map.put(aux, map.get(aux) + 1);
				} else {
					map.put(aux, 1);
				}
			}
			
			max = 0;
			for (int cops : map.keySet()) {
				
				int ifMax = map.get(cops);
				
				// max = Math.max(map.get(cops), max);
				if (max < ifMax) {
					max = ifMax;
					maxKey = cops;
				}
			}
			System.out.println(maxKey);
			//System.out.println(map);
			
		}
		sc.close();
	}

}
