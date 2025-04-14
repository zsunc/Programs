import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int n; 
        Solucion sol=new Solucion();
        Scanner ing=new Scanner(System.in);
        System.out.print("INGRESE EL TAMAÑO DE LA SERIE: - ");
        n = ing.nextInt();
        sol.serie(n);
        System.out.println("\nTABLA VIBORA");
        sol.vibora(n);
        System.out.println("\nTRIANGULO DE PASCAL");
        sol.pascal(n);
        System.out.println("\nANILLOS CONCENTRICOS");
        sol.concen(n);
        ing.close();
    }
}
