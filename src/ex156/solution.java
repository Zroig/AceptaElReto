package ex156;

import java.util.ArrayList;
import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String L;
		for (int i = 0; i < n; i++) {
			ArrayList<String> paraules = new ArrayList<String>();
			ArrayList<String> ctrly = new ArrayList<String>();
			while (true) {
				L = sc.next();
				if (L.equals(".")) {
					break;
				}
				if (L.equals("<")) {
					if (paraules.size()>0) {
						ctrly.add(paraules.get(paraules.size()-1));
						paraules.remove(paraules.size()-1);
					}
				} else if(L.equals(">")) {
					if (ctrly.size()>0 && paraules.size()>0) {
						paraules.remove(paraules.size()-1);
						paraules.add(ctrly.get(ctrly.size()-1));
					} else if(ctrly.size()==0 && paraules.size()>0) {
						paraules.add(paraules.get(paraules.size()-1));
					}
				} else {
				paraules.add(L);
					}
					
				}
				for (int j = 0; j < paraules.size(); j++) {
					System.out.print(paraules.get(j)+" ");
				}
			}
		
		sc.close();
		
	}

}
