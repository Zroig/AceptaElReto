package ex659;

import java.util.Scanner;

public class solution {
	    static java.util.Scanner in;

	    public static boolean casoDePrueba() {
	    	int e = in.nextInt();
	    	if (e == 0) {
	            return false;
	    	} else {
	            int length = (int)(Math.log10(e)+1);
	            int array[];
	            array = new int[length];
	            System.out.println(length);
	            String eString = String.valueOf(e);
	            System.out.println(eString);
	            for (int i = 0; i<length; i++) { 
	            	System.out.println(eString.charAt(length)); 
	            }
	            return true;
	         }
	    } // casoDePrueba

	    public static void main(String[] args) {
	        in = new java.util.Scanner(System.in);
	        while (casoDePrueba()) {
	        }
	    } // main

	} // class solution
