/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Semana6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(100) + 1; 
        int num2 = random.nextInt(100) + 1; 

        int sumaCorrecta = num1 + num2;

        System.out.println("¿Cuál es la respuesta de este problema?");
        System.out.print(num1 + " + " + num2 + " = ");

        Scanner scanner = new Scanner(System.in);

        try {
            int respuestaUsuario = scanner.nextInt();

            if (respuestaUsuario == sumaCorrecta) {
                System.out.println("Excelente");
            } else {
                System.out.println("Incorrecto, la respuesta es " + sumaCorrecta);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("WARNING: El numero ingresado no es válido.");
            System.exit(0);
        } finally {
            scanner.close();
        }
    }
}