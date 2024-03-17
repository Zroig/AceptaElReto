package ex595;

public class solution {
	static java.util.Scanner in;

    public static void casoDePrueba() {
      
        int numProblema;
        numProblema = in.nextInt();
        System.out.println(numProblema / 100);

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
