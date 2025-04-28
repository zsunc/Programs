import javax.swing.*;
public class solucion {
    void magico(int n, int x[][]){
        if(n%2==0){
            JOptionPane.showMessageDialog(null,"SOLO SE PUEDEN INGRESAR UNA DIMENSION IMPAR PARA LA MATRIZ MAGICA ");
            return;
        }
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
                cad=cad+String.format("%4d",x[i][j]);
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
                dat=dat+String.format("%4d",x[i][j]);
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
                dat=dat+"    ";
            }
            for(j=0; j<=i; j++){
                dat=dat+String.format("%4d",x[i][j]);
            }
            dat=dat+"\n";
        }
        JOptionPane.showMessageDialog(null,"TRIANGULO DE PASCAL\n"+dat);
    }  
    void vibora(int n, int x[][]){
        int i,j,num=1;
        String dat=" ";
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
                dat=dat+String.format("%4d", x[i][j]);
            }
            dat=dat+"\n";
        }
        JOptionPane.showMessageDialog(null,"SERIE VIBORA\n"+dat);
    }      
    void seriefact(int n, int x[][]){
        int fact=1, fsig=0, num;
        String dat = "";
        x[0][0] = 1;
        dat = dat + " " + x[0][0];
        for(int i = 1; i < n; i++){
            fact = fact * i;
            fsig = fact * (i + 1);
            num = i;
            x[0][i] = x[0][i-1] + fact + fsig + num;
            dat=dat+" "+x[0][i];
        }
        JOptionPane.showMessageDialog(null, "SERIE FACTORIALES\n" + dat);
    } 
}