import javax.swing.*;
public class solucion {
    void magico(int n, int x[][]){
        int c=0,f=0,s=0,ctd=0,i,j;
        String cad="";
        c=n/2;
        do{
            ctd++;
            x[f][c]=ctd;
            if(ctd%n==0){
                f++;
            } else
            if (f==0){
                c++;
                f=n-1;
            } else {
                if(c==n-1){
                    f--;
                    c=0;
                } else {
                    f--;
                    c++;
                    }
                }
        } while (ctd<n*n);
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                cad=cad+" "+x[i][j]; 
            }
            s=s+x[i][i];
            cad=cad+"\n";
        }
        JOptionPane.showMessageDialog(null,"MATRIZ MAGICA\n"+cad+"\nLA SUMA ES ="+s);
    }
    void tunel(int n, int x[][]){
        int i,j,k;
        String dat="";
        for(i=0; i<n; i++){
            for(j=i; j<n-i; j++){
                for(k=i; k<n-i; k++){
                    x[j][k]=(i+1);
                }
            } 
        }
        dat="";
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                dat=dat+" "+x[i][j];
            }
            dat=dat+"\n";
        }
        JOptionPane.showMessageDialog(null, "MATRIZ TUNEL\n"+dat);
    }
    void pascal(int n, int x[][]){
        int i,j,k;
        String dat="";
        for(i=0; i<n; i++){
            x[i][0]=1;
            for(j=1; j<=i; j++){
                x[i][j]=x[i-1][j-1]+x[i-1][j];
            }
        }
        for(i=0; i<n; i++){
            for(k=0; k<n-i-1; k++){
                dat=dat+" ";
            }
            for(j=0; j<=i; j++){
                dat=dat+x[i][j]+" ";
            }
            dat=dat+"\n";
        }
        JOptionPane.showMessageDialog(null,"TRIANGULO DE PASCAL\n"+dat);
    }  
    void vibora(int n, int x[][]){
        int i,j,num=1;
        String dat="";
        for(i=0; i<n; i++){
            if(i%2==0){
                for(j=0; j<n; j++){
                    x[i][j]=num;
                    num++;
                }
            } else {
                for(j=n-1; j>=0; j--){
                    x[i][j]=num;
                    num++;   
                }
            }
        }
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                dat=dat+" "+x[i][j];
            }
            dat=dat+"\n";
        }
        JOptionPane.showMessageDialog(null,"SERIE VIBORA\n"+dat);
    }
    void seriefact(int n, int x[][]){
        int i;
        String dat="";
        x[1][0]=1;
        for(i=1; i<n; i++){
            x[1][i]=x[1][i-1]*(i+1);
        }
        for(i=0; i<n; i++){
            x[2][i]=i+1;
        }
        x[0][0]=1;
        for(i=1; i<n; i++){
            x[0][i]=x[0][i-1]+x[2][i-1];
        }

        for(i=0; i<n; i++){
            dat=dat+" "+x[0][i];
        }
        JOptionPane.showMessageDialog(null, "SERIE FACTORIALES\n"+dat);
    }
    void serfact(int n, int x[][]){
        int i, s, fact[], nat[];
        String dat="";
        fact =new int[n*2];
        nat =new int[n];
        fact[0]=1;
        for(i=1; i<n*2; i++){
            fact[i]=fact[i-1]*(i+1);
        }
        for(i=0; i<n; i++){
            nat[i]=i+1;
        }
        x[0][0]=fact[0]+fact[1]+nat[0];
        s=x[0][0];

        for(i=1; i<n; i++){
            if(i*2+1<fact.length){
            x[0][i]=fact[i*2]+fact[i*2+1]+nat[i]+s;
            s=x[0][i];
            }
        }
        for(i=0; i<n; i++){
            dat=dat+" "+x[0][i];
        }
        JOptionPane.showMessageDialog(null,"SERIE GENERADA\n"+dat);
    }
    void sertact(int n, int x[][]) {
        int i;
        String dat = "";
    
        // Arrays para los factoriales y los números naturales
        int[] factoriales = new int[n + 1];  // Para almacenar los factoriales
        int[] naturales = new int[n];  // Para almacenar los números naturales
    
        // Inicializar los factoriales (de 1! a n!)
        factoriales[0] = 1;  // 1! = 1
        for (i = 1; i <= n; i++) {
            factoriales[i] = factoriales[i - 1] * i;
        }
    
        // Inicializar los números naturales (de 1 a n)
        for (i = 0; i < n; i++) {
            naturales[i] = i + 1;
        }
    
        // Iniciar con el primer valor de la serie:
        // 1 + 1! + 2! + el primer número natural (1)
        x[0][0] = factoriales[0] + factoriales[1] + naturales[0]; 
        int sumaAnterior = x[0][0];  // Guardamos la suma de la primera iteración
    
        // Generar la serie:
        for (i = 1; i < n; i++) {
            // Tomamos los dos siguientes factoriales, el siguiente número natural y la suma anterior
            if (i * 2 + 1 < factoriales.length && i < naturales.length) {
                x[0][i] = sumaAnterior + factoriales[i * 2] + factoriales[i * 2 + 1] + naturales[i];
                sumaAnterior = x[0][i];  // Actualizamos la suma para la siguiente iteración
            }
        }
    
        // Crear el mensaje de salida con la serie
        for (i = 0; i < n; i++) {
            dat = dat + " " + x[0][i];
        }
    
        // Mostrar el mensaje con la serie
        JOptionPane.showMessageDialog(null, "SERIE GENERADA\n" + dat);
    }
    
    
    
    
    
}
