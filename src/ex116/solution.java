package ex116;
public class solution { // Asume fichero llamado solution.java

	    static java.util.Scanner in;

	    public static void casoDePrueba() {
	      
	       System.out.println("Hola mundo.");

	    } // casoDePrueba

	    public static void main(String[] args) {

	        in = new java.util.Scanner(System.in);

	        int numCasos = in.nextInt();
	        for (int i = 0; i < numCasos; i++)
	            casoDePrueba();
	    } // main
	} // class solution
