import java.util.*;
public class Solucion {
    Scanner dat = new Scanner(System.in);
    void ingreso (int n, int e[]){
        System.out.print("\nINGRESE "+n+" EDADES\n");
        for(int i=0; i<n; i++){
            System.out.print("INGRESE LA EDAD: ");
            e[i] = dat.nextInt();
        }
    }
    void ver (int n, int e[]){
        int i;
        System.out.print("\n\n-- EDADES DEL VECTOR --\n");
        for(i=0; i<n; i++){
            System.out.print("\n"+(i+1)+". EDAD: "+e[i]);
        }
    }
    void ordenar (int n, int ed[]){
        int i,j,aux,sino=0;
        System.out.println("\n-- ELIJA EL MODO A ORDENAR LAS EDADES --");
        System.out.println("- ASCENDENTE: 1");
        System.out.println("- DESCENDENTE: 2");
        System.out.print("\nELIJA OPCION ->");
        sino=dat.nextInt();
        if(sino==1){
            for(i=0; i<n-1; i++){
                for(j=i+1; j<n; j++){
                    if(ed[i]<ed[j]){
                        aux=ed[i];
                        ed[i]=ed[j];
                        ed[j]=aux;
                    }
                }
            }
        } else {
            for(i=0; i<n-1; i++){
                for(j=i+1; j<n; j++){
                    if(ed[i]>ed[j]){
                        aux=ed[i];
                        ed[i]=ed[j];
                        ed[j]=aux;
                    }
                }
            }
        }
        ver(n,ed);
    }
    void verimpa(int n, int ve[]){
        int i, s=0;
        for(i=0; i<n; i++){
            if(ve[i]>0){
                s=s+ve[i];
                System.out.print("\n   ~ "+ve[i]);
            }
        }
        System.out.print("\n\nLA SUMA ES: "+s+"\n");
    }
    void pasar(int n, int ed[], int pa[], int im[]){
        int i;
        for(i=0; i<n; i++){
            if(ed[i]%2==0){
            pa[i]=ed[i];
            } else {
                im[i]=ed[i];
            }
        }
        System.out.print("\n-- EDADES PARES --\n");
        verimpa(n, pa);
        System.out.print("\n-- EDADES IMPARES --\n");
        verimpa(n, im);
    }
}