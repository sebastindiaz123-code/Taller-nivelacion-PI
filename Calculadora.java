import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora Básica ===");
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Elige una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double resultado;

        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Error: no se puede dividir entre cero.");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}