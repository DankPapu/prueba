/*Javier ALejandro Torres Martinez ING.Tics Practica No.5 /Factorial de un numero*/
package proyectos;

import java.util.Scanner;

public class Practica5 {
    
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Que numero quieres sacarle factorial?");
        int numero = Scanner.nextInt();
        int factorial = 1;
        while (numero!=0) {
            factorial*=numero;
            numero--;
        }
        System.out.println("El factorial es: " +factorial);
    }
}
