import java.util.Scanner;

public class ConversorBinario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número binario de 16 bits
        System.out.print("Ingrese un numero binario de 16 bits: ");
        String binario = scanner.nextLine();
        
        // Verificar si la longitud del número binario es válida
        if (binario.length() != 16) {
            System.out.println("El numero binario debe tener exactamente 16 bits.");
            return;
        }
        
        // Convertir el número binario a decimal, octal y hexadecimal
        int decimal = Integer.parseInt(binario, 2);
        String octal = Integer.toOctalString(decimal);
        String hexadecimal = Integer.toHexString(decimal);
        
        // Mostrar los resultados
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
        
        scanner.close();
    }
}
