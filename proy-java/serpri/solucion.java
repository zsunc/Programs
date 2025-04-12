class solucion {
int primo(int x){
    int i=0, sw=1;
    if(x==1 || x==2)
    sw=1;
    else {
        for (i=2; i<x; i++){
            if (x%i ==0){
                sw=0;
                break;
                }
            }
        }
        return (sw);
    }   
void serie(int n){
    int i,s=0,co=0,sw=0;
    System.out.print("SERIE DE PRIMOS\n");
    for(i=1; i<=1000; i++){
        sw=primo(i);
        if(sw==1){
            co++;
            System.out.print(" "+i);
            s=s+i;
            if (co==n)
                break;
        }
    }
    System.out.print("\nLA SUMA ES = "+s);
    System.out.println("\nEL PROMEDIO ES = "+(s/co));
}
void vibora (int n){
    int i,j,se=0,c=0;
    for (i=1; i<n; i++){
        c++;
        if(c%2==1){
            for (j=1; j<=n; j++){
                se++;
                System.out.printf("%4d",se);
                }
                se=se+n;
                System.out.print("\n");
    }
    else {
        for (j=1; j<=n; j++){
            System.out.printf("%4d",se);
            se--;
            }
            se=se+n;
            System.out.print("\n");
        }
    }
}
void pascal(int n){
    int i,j,spc;
    for (i=0; i<n; i++){
        for(spc=0; spc<n-i-1; spc++){
            System.out.print(" ");
            }
            int val=1;
            for(j=0; j<=i; j++){
                System.out.print(val+" ");
                val=val * (i-j)/(j+1);
                }
                System.out.println();
            }
        }
void concen(int n){
    int i,j;
    for(i=0; i<n; i++){
        for(j=0; j<n; j++){
            int arb = i;
            int izq = j;
            int dbj = n-1-i;
            int drc = n-1-j;
            int borde = arb;
            if (izq<borde) borde = izq;
            if (dbj<borde) borde = dbj;
            if (drc<borde) borde = drc;
            System.out.print((borde+1));
            }
        System.out.println();
        }
    }
}
