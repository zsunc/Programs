import java.util.*;
public class contador{
	static void contar(int x, int sw){
		int c=0, u;
		String res="";
		do {
			u = x % 10;
			if (u%2 == sw){
				c++;
				res=u + res;
				}
				x=x/10;
			}
			while (x!=0);
			if (sw==0){
				System.out.print("\n"+res+" Total pares= "+c);
				} else {
					System.out.print("\n"+res+" Total impares= "+c);
					}
		}
		static void primos(int x){
			int c=0,u=0;
			String res="";
			do{
				u=x%10;
				if(u==1 || u==2 || u==3 || u==5 || u==7 ){
					c++;
					res=u+res;
					} x=x/10;
				}
				while (x!=0);
				System.out.print("\n"+res+" Total primos= "+c);
			}
			public static void main(String[] args) {
				int n;
				Scanner ingreso=new Scanner(System.in);
				System.out.print("Ingrese un numero= ");
				n=ingreso.nextInt();
				contar(n,0);
				contar(n,1);
				primos(n);
				}
	}
