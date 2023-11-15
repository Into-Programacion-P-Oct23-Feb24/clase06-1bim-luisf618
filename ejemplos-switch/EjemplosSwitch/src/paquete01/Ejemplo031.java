/*

ANA DIAZ con edad 10, es estudiante de UTPL

luis vera con edad 10, es estudiante UNL

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su universidad");
        String universidad = entrada.nextLine();
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        nombre = nombre.toLowerCase();
        char valor = nombre.charAt(0);
        switch (valor) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                nombre = nombre.toUpperCase();
                apellido = apellido.toUpperCase();
                break;

            default:
                apellido = apellido.toLowerCase();
                break;

        }
        System.out.printf("%s %s con edad %s, es estudiante de %s\n",
                nombre, apellido, edad, universidad);
    }
}
