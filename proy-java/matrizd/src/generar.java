public class generar {
    void genrar(int n, int x[][]){
        int i,j;
        for (i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(i == j)
                x[i][j]=1;
                else if(i > j)
                x[i][j]=2;
                else 
                x[i][j]=3;
            }
        }
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
