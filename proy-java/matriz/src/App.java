import java.util.*;
public class App {
    public static void main(String[] args){
        int n, m[][];
        m = new int [15][15];
        Scanner dat = new Scanner(System.in);
        generar gen =  new generar();
        do{
            System.out.print("INGRESE DIMENSION ");
            n = dat .nextInt();
        } while(n<=0);
        gen.ingreso(n,m);
        gen.imprimir(n, m);
        gen.buscar(n, m);
        gen.sumar_pri(n, m);
        dat.close();   
    }
}
