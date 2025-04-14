import java.util.*;
public class App {
    static void compara(int n) {
        int sumP = 0, sumI = 0;
        String p = "", i = "";
        while (n != 0) {
            int digito = n % 10;
            if (digito % 2 == 0) {
                sumP += digito;
                p = digito + " " + p;
            } else {
                sumI += digito;
                i = digito + " " + i;
            }
            n /= 10;
        }
        System.out.println("Digitos pares: " + p + "\n (Suma = " + sumP + ")");
        System.out.println("Digitos impares: " + i + "\n (Suma = " + sumI + ")");
        if (sumP > sumI) {
            System.out.println("- La suma de pares es mayor. -");
        } else if (sumP < sumI) {
            System.out.println("- La suma de impares es mayor. -");
        } else {
            System.out.println("- Ambas sumas son iguales. -");
        }
    }
    public static void main(String[] args){
         Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese un numero para separar digitos en pares e impares: ");
        int n2 = ingreso.nextInt();
        compara(n2);
        ingreso.close();
    }
}
