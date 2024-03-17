package ex100;
import java.util.*;
//NOT SENDED
public class solution {
	static java.util.Scanner in;

    public static void casoDePrueba() {
    	int contador = 0, aux = 0;
    	Scanner sc = new Scanner(System.in);
    	String Entrada = sc.nextLine();
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	map.put(Character.getNumericValue(Entrada.charAt(0)), Character.getNumericValue(Entrada.charAt(0)));
    	map.put(Character.getNumericValue(Entrada.charAt(1)), Character.getNumericValue(Entrada.charAt(1)));
    	map.put(Character.getNumericValue(Entrada.charAt(2)), Character.getNumericValue(Entrada.charAt(2)));
    	map.put(Character.getNumericValue(Entrada.charAt(3)), Character.getNumericValue(Entrada.charAt(3)));
    	System.out.println(map);
    	
    	int asc = map.get(1)*1000+map.get(2)*100+map.get(3)*10+map.get(4);
    	int desc = map.get(4)*1000+map.get(3)*100+map.get(2)*10+map.get(1);
    	System.out.println(asc);
    	System.out.println(desc);
     
    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
