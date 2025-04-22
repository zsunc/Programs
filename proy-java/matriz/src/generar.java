import java.util.*;
public class generar {
    Scanner es= new Scanner(System.in);
    void ingreso(int n, int x[][]){
        int i,j;
        System.out.print("\nINGRESE "+(n*n)+" NUMEROS\n");
        for (i=0; i<n; i++){
            for(j=0; j<n; j++){
            System.out.print("INGRESE NUMERO -");
            x[i][j] = es.nextInt();
            }
        }
    }
    void buscar(int n,int x[][]){
        int i,j, may= -99999 , fmay=0, cmay=0, men=99999,fmen=0,cmen=0;
        System.out.print("\nINGRESE "+(n*n)+" NUMEROS\n");
        for (i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(x[i][j]>may){
                    may=x[i][j];
                    fmay=i;
                    cmay=j;
                }
                if(x[i][j]<men){
                    men=x[i][j];
                    fmen=i;
                    cmen=j;
                }        
            }
        }
        System.out.print("\nEL MAYOR ES ="+may);
        System.out.print("\nESTA EN LA FILA #"+fmay+"\nCOLUMNA #"+cmay);
        System.out.print("\nEL MENOR ES ="+men);
        System.out.print("\nESTA EN LA FILA #"+fmen+"\nCOLUMNA #"+cmen);
    }
    void sumar_pri(int n, int x[][]){
        int i,j,k,s=0,num,sw=0;
        for (i=0; i<n; i++){
            for(j=0; j<n; j++){
                sw=0;
                num=x[i][j];
                for(k=2; k<num; k++){
                    if(num%k==0){
                        sw=1;
                        break;
                    }
                }
                if(sw==0){
                s=s+x[i][j];
                System.out.print("\n +"+x[i][j]);
                }
            }
        }
        System.out.print(" = "+s);
    }
    void imprimir(int n, int x[][]){
        int i,j;
        for (i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.print(" "+x[i][j]);
            }
            System.out.print("\n");
        }
    }
}
