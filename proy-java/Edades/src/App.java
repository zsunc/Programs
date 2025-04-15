import java.util.*;
public class App {
    public static void main(String[] args) {
        int opc,ed[],pa[],im[],n=0,sw=0,max=0,min=0,rg[],pr[];
        ed = new int[100];
        pa = new int[100];
        im = new int[100];
        pr = new int[100];
        rg = new int[100];
        Solucion sol = new Solucion();
        Scanner dat = new Scanner(System.in);
        do{
        System.out.print("\n\n1. DIMENSION");
        System.out.print("\n2. INGRESAR EDADES");
        System.out.print("\n3. FILTRAR POR EDAD");
        System.out.print("\n4. VER");
        System.out.print("\n5. ORDENAR EDADES");
        System.out.print("\n6. CREAR VECTOR DIGITOS (PAR/IMPAR)");
        System.out.print("\n7. CREAR VECTOR DIGITOS PRIMOS");
        System.out.print("\n8. SALIR");
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
                    sol.ingreso(n, ed);
                    System.out.print("\n-- INGRESE RANGO DE EDADES --\n");
                    System.out.print("\nINGRESE LA EDAD MINIMA ->");
                    min = dat.nextInt();
                    System.out.print("\nINGRESE LA EDAD MAXIMA ->");
                    max = dat.nextInt();
                    } else {
                        System.out.print("\nEL VECTOR NO TIENE DIMENSION");
                    }
                    break;
                case 3:
                    if(sw==1){
                        System.out.print("\nINGRESE EDAD MINIMA: ");
                        min = dat.nextInt();                        
                        System.out.print("\nINGRESE EDAD MAXIMA: ");
                        max = dat.nextInt();
                        sol.filtar(n, ed, rg, min, max);
                    } else {
                        System.out.print("\nEL VECTOR NO TIENE DIMENSION");
                    }
                    break;
                case 4:
                    if(sw == 1){
                    sol.ver(n, ed);
                    } else {
                        System.out.print("\nEL VECTOR NO TIENE DIMENSION");
                    }
                    break;
                case 5:
                    if(sw == 1){
                    sol.ordenar(n, ed);
                    } else {
                        System.out.print("\nEL VECTOR NO TIENE DIMENSION");
                    }
                    break;
                case 6:
                    if(sw == 1){
                    sol.pasar(n, min, max, ed, pa, im);
                    } else {
                        System.out.print("\nEL VECTOR NO TIENE DIMENSION");
                    }
                    break;
                case 7:
                    if(sw == 1){
                   sol.primos(n, min, max, ed, pr);
                    } else {
                        System.out.print("\nEL VECTOR NO TIENE DIMENSION");
                    }
                    break;
            }
        } while(opc != 8);
        dat.close();
    }
}
