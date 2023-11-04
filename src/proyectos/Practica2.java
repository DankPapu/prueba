/*Javier ALejandro Torres Martinez ING.Tics Practica No.2 /Hola y Nombre*/
package proyectos;

import java.util.Scanner;

public class Practica2 {
    
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        System.out.println("Ingresa tu nombre:");
        String nombre = Scanner .nextLine();
        System.out.println("Hola " + nombre + " un gusto en conocerte");
    }
}

