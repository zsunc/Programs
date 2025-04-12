import java.util.*;

public class App {
    public static void main(String[] args) {
        int opc, ed[], ma[], me[], pa[], im[], n=0, sw=0;
        ed = new int[100];
        ma = new int[100];
        me = new int[100];
        pa = new int[100];
        im = new int[100];
        Scanner dat = new Scanner(System.in);
        do{
        System.out.print("\n1. DIMENSION");
        System.out.print("\n2. INGRESAR EDADES");
        System.out.print("\n3. VER");
        System.out.print("\n4. ORDENAR EDADES");
        System.out.print("\n5. CREAR VECTORES");
        System.out.print("\n6. SALIR");
        System.out.print("\n\n    ELIJA UNA OPCION ->");
        opc = dat.nextInt();
            switch (opc) {
                case 1:
                    do{
                        System.out.print("\nINGRESE LA DIMENSION [1 - 100] ->");
                        n = dat.nextInt();
                        sw = 1;
                    } while(n<0 || n>100);
                    break;
                case 2:
                    if(sw == 1){
                    
                    } else {
                        System.out.print("\nEL VECTOR NO TIENE DIMENSION");
                        }
                    break;
                case 3:
                    if(sw == 1){
                    
                    } else {
                        System.out.print("\nEL VECTOR NO TIENE DIMENSION");
                        }
                    break;
                case 4:
                    if(sw == 1){
                    
                    } else {
                        System.out.print("\nEL VECTOR NO TIENE DIMENSION");
                        }
                    break;
                case 5:
                    if(sw == 1){
                    
                    } else {
                        System.out.print("\nEL VECTOR NO TIENE DIMENSION");
                        }
                    break;
            }
        } while(opc != 6);
        dat.close();
    }
}
