package org.generation.sasec5;

import java.util.Scanner;

public class codigodeotros5 {
	//Añado la clase main
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);//Añado System.in y libreria
	        System.out.print("Introduzca un número: ");
	        int ni = scanner.nextInt(); //Cambio a next.Int
	        int c = ni;

	        int afo = 0;
	        int noAfo = 0;
	     
	      while (ni > 0) {
          int digito = ni % 10; //cambio para que no multiplique
          //Cambio las sentencias if para que sean aceptadas, el or nos ayuda a iterar entre posibilidades
          if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
              afo++;
          } else {
              noAfo++;
          }
          ni /= 10;
      }

      if (afo > noAfo) {
          System.out.println("El " + c + " es un número afortunado.");
      } else {
          System.out.println("El " + c + " no es un número afortunado.");
      }
      //Cierro el scanner
    scanner.close();
  }
}
