import java.util.Scanner;

public class First {
    /*
    Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente.
    El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que los tres valores introducidos
    por el teclado sean valores distintos. Presente un mensaje de alerta en caso de que se detecte la introducción de
    valores iguales.
    */

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Introduce el primer valor: ");
        Scanner valorA = new Scanner(System.in);
        a = valorA.nextInt();
        System.out.println("Introduce el segundo valor: ");
        Scanner valorB = new Scanner(System.in);
        b = valorB.nextInt();
        System.out.println("Introduce el tercer valor: ");
        Scanner valorC = new Scanner(System.in);
        c = valorC.nextInt();

        if (a == b || b == c || c == a) {
            System.out.println("Los valores introducidos son iguales");
        } else if (a > b && a > c) {
            System.out.println("El valor mayor es: " + a);
            if (b > c) {
                System.out.println("El valor menor es: " + c);
            } else {
                System.out.println("El valor menor es: " + b);
            }
        } else if (b > a && b > c) {
            System.out.println("El valor mayor es: " + b);
            if (a > c) {
                System.out.println("El valor menor es: " + c);
            } else {
                System.out.println("El valor menor es: " + a);
            }
        } else {
            System.out.println("El valor mayor es: " + c);
            if (a > b) {
                System.out.println("El valor menor es: " + b);
            } else {
                System.out.println("El valor menor es: " + a);
            }
        }
    }
}
