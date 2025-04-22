public class generar {
    void genrar(int n, int x[][]){
        int i,j,med=0;
        med=n/2;
        for (i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(i<med && j<med)
                x[i][j]=1;
                if(i<med && j>med)
                x[i][j]=3;
                if(i>med && j<med)
                x[i][j]=4;
                if(i>med && j>med)
                x[i][j]=5;
                if(i==med || j==med)
                x[i][j]=2;
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
