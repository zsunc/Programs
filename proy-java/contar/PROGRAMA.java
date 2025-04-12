import java.util.*;
public class PROGRAMA {
    static void contar(int x, int y) {
        int c = 0, u1 = 0, u2, z;
        z = y;
        do {
            u1 = x % 10;
            y = z;
            c = 0;
            do {
                u2 = y % 10;
                if (u1 == u2) {
                    c++;
                }
                y = y / 10;
            } while (y != 0);
            System.out.print("\n" + u1 + " SE REPITE " + c + " VECES");
            x = x / 10;
        } while (x != 0);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner dat = new Scanner(System.in);
        System.out.print("ING. PRIMER NUMERO= ");
        a = dat.nextInt();
        System.out.print("ING. SEGUNDO NUMERO= ");
        b = dat.nextInt();

        contar(a, b);
    }
}

