package ex319;
import java.util.*;
public class solution {

	  static Scanner in;

	  public static boolean casoDePrueba() {

	    if (in.hasNext())
	      return false;
	    else {
	      String n = in.nextLine();
	      String[] np = n.split(" ");
	      int nmarc = 1;
	      int nobj = 1;
	       nmarc = Integer.parseInt(np[0]);
	       nobj = Integer.parseInt(np[1]);
	      System.out.println(nmarc+" "+nobj);
	      int cont = 0;
	      if (nobj == 0) {
	        nobj = 10000;
	      }
	      if (nmarc == 0) {
	        nmarc++;
	        cont++;
	      }
	      while (nmarc != nobj) {
	        if (nmarc > nobj) {
	          nmarc /= 3;
	          cont++;
	        }
	        else if (nmarc*2==nobj || nmarc%2 == 0 || nobj % 2 == 0) {
	          nmarc *= 2;
	          cont++;
	        }
	        else if (nmarc<nobj || nmarc == 0) {
	          nmarc++;
	          cont++;
	        }
	      }
	      System.out.println(cont);

	      return true;
	    }

	  } // casoDePrueba

	  public static void main(String[] args) {

	    in = new java.util.Scanner(System.in);

	    while(casoDePrueba())
	      ;

	  } // main

	} // class Solution
