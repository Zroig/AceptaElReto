package ex373;

public class solution {
	static java.util.Scanner in;

    public static void casoDePrueba() {
      long n, a, d;
      n=in.nextInt();
      a = n-2;
      d = n*n*n - a*a*a;
      System.out.println(d);
    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
