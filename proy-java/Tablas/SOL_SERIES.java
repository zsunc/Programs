import java.util.*;
class SOL_SERIES {
		Scanner inf = new Scanner(System.in);
	void fibo(){
		int n,i, a=0, b=1, s=0, f=0;
		System.out.print("\n\nSERIE DE FIBONACI\n");
		System.out.print("\nINGRESE TAMAÑO: ");
		n = inf.nextInt();
		for (i=0;i<n;i++){
			f=a+b;
			s=s+f;
			System.out.print(" "+f);
			b=a;
			a=f;			
			}
		System.out.print("\nLA SUMA ES: "+s+"\n");
		}
	void pares(){
		int n, i, c=0, s=0;
		System.out.print("\nSERIE PARES\n");
		System.out.print("\nINGRESE TAMAÑO: ");
		n = inf.nextInt();
		for(i=0;i<n;i++){
			c=c+2;
			s=s+c;
			System.out.print(" "+c);
			}
			System.out.print("\nLA SUMA ES:  "+s+"\n");
		}
	void primos(){
		int n, c=0, nm=2, s=0;  
		System.out.print("\nSERIE NUMEROS PRIMOS\n");
		System.out.print("\nINGRESE TAMAÑO: ");
		n= inf.nextInt();
		System.out.print("\nSERIE: ");
		while (c<n){
			if(epr(nm)){
				System.out.print(nm+ " ");
				s += nm;
				c++;
				}
				nm++;
			}
		System.out.print("\nLA SUMA ES: "+s+"\n");
		}
		private boolean epr(int n){
			if (n<=1) return false;
			for(int i=2; i<= Math.sqrt(n);i++){
				if (n%i==0) return false;
				}
				return true;
			}
		
		
	void ntriangular(){
		int n,i, t=1 , ic=1, s=1;
		System.out.print("\nSERIE TRIANGULAR\n");
		System.out.print("\nINGRESE TAMAÑO: ");
		n = inf.nextInt();
		
		System.out.print("\nSERIE: "+t+" ");
		for(i=1;i<n;i++){
			t += ic;
			System.out.print(+t+" ");
			s += t;
			ic++;
			}
		System.out.print("\nLA SUMA ES: "+s+"\n");
		}
	}
