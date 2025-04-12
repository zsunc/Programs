import java.util.*;

public class capicua {
    static boolean esC(int n) {
        int org = n, inv = 0;
        while (n != 0) {
            int digito = n % 10;
            inv = inv * 10 + digito;
            n /= 10;
        }
        return org == inv;
    }

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese un número para verificar si es capicúa: ");
        int n1 = ingreso.nextInt();
        if (esC(n1)) {
            System.out.println(n1 + " es un número capicúa.");
        } else {
            System.out.println(n1 + " no es un número capicúa.");
        }
    }
}
