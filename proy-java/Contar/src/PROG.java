import java.util.*;
public class PROG {
    static void contar(int x, int y){
        int c=0, u1=0, u2, z;
        z=y;
        do{
            u1=x%10;
            y=z;
            c=0;
            do {
                u2=y%10;
                if (u1 == u2){
                c++;
                }
                y=y/10;
            } while (y!=0);
        System.out.println(u1+" SE REPITE "+c+" VECES");
        x=x/10;
        } while (x!=0);
    }
    public static void main(String[] args) throws Exception {
    int a, b;
    Scanner dat = new Scanner(System.in);
    System.out.println("INGRESE PRIMER NUMERO -> ");
    a = dat.nextInt();
    System.out.println("INGRESE SEGUNDO NUMERO -> ");
    b = dat.nextInt();
    contar(a, b);
    dat.close();   
    }
}