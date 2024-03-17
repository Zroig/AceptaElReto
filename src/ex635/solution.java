package ex635;

public class solution {
	static java.util.Scanner in;

    public static void casoDePrueba() {
      int a, s; //a - year s - century
      a = in.nextInt();
      if (a<100) {
    	  s = 1;
      } else if (a%100==0) {
    	  s=a/100;
      } else {
    	 s = a/100+1;  
      }
      System.out.println(s);
    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
