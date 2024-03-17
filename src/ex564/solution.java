package ex564;

public class solution {
	static java.util.Scanner in;

    public static void casoDePrueba() {
        int n = 0, k = 0, j = 0; 
        n = in.nextInt();
        double potencia = 0;
        potencia = Math.pow(2, n);
        for (int i = 0; i<potencia; i++) {
        	j = i*2;
        	if (j % 7 == 0) {
        		k++;
        	}
        }
        System.out.println(k);
    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
