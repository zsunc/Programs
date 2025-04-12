package src;
import java.util.*;
public class Sol_tablas {
    Scanner inf = new Scanner(System.in);
	void triangular(){
		int n,i,s=0;
		System.out.print("\n\nTABLA TRIANGULAR\n");
		System.out.print("\nINGRESE TAMAÑO: ");
		n = inf.nextInt();
		for (i=1;i<=n;i++){
			for (int j=1;j<=i;j++){
				System.out.print(" "+j);
				s+=j;
				}
				System.out.print("\n");			
			}
		System.out.print("\nLA SUMA ES: "+s+"\n");
		}
	void china(){
		int n,i,j;
		System.out.print("\n\nTABLA CHINA\n");
		System.out.print("\nINGRESE TAMAÑO: ");
		n = inf.nextInt();
		int [][] tabla= new int [n][n];
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				tabla[i][j] = (i+1) * (j+1);
				}
			}
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				System.out.printf("%3d",tabla[i][j]);
				}
				System.out.println();
			}
		}
}
