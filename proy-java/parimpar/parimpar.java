import java.util.*;

public class parimpar {
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

        System.out.println("Dígitos pares: " + p + " (Suma = " + sumP + ")");
        System.out.println("Dígitos impares: " + i + " (Suma = " + sumI + ")");

        if (sumP > sumI) {
            System.out.println("La suma de pares es mayor.");
        } else if (sumP < sumI) {
            System.out.println("La suma de impares es mayor.");
        } else {
            System.out.println("Ambas sumas son iguales.");
        }
    }

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese un número para separar dígitos pares e impares: ");
        int n2 = ingreso.nextInt();
        compara(n2);
    }
}

