
package Ejercicio6;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumeroComplejo numero1,numero2,suma,mult;
        double a,b,c,d;
        int opcion;
        
        do {            
            System.out.println("\t.:Operaciones con Numeros Complejos:.");
            System.out.println("1. Sumar 2 numeros complejos");
            System.out.println("2. Multiplicar 2 numeros complejos");
            System.out.println("3. Comparar 2 numeros complejos (iguales o no)");
            System.out.println("4. Multiplicar un numero complejo por un entero");
            System.out.println("5. Salir");
            System.out.println("Digite la opcion de menu: ");
            opcion = entrada.nextInt();
            
            
            switch(opcion){
                case 1: System.out.println("\nDigite el primer numero complejo: ");
                        System.out.print("Digite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();
                        System.out.println("\nDigite el segundo numero complejo: ");
                        System.out.print("Digite la parte real: ");
                        c = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = entrada.nextDouble();
                        
                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);
                        
                        suma = numero1.calcularSuma(numero2);
                        System.out.println("\nLa suma es: "+suma.getA()+" + "+suma.getB()+" i ");
                        
                        break;
            }
            
        } while (opcion !=5);
    }
}
