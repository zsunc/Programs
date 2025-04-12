import java.util.*;
class SERIES {
	SOL_SERIES sol=new SOL_SERIES();
	void menu_series(){
		int op;
		Scanner dat = new Scanner(System.in);
		do{
		System.out.print("\nMENU SERIES");
		System.out.print("\n1 : FIBONACCI");
		System.out.print("\n2 : PARES");
		System.out.print("\n3 : PRIMOS");
		System.out.print("\n4 : NUMEROS TRIANGULARES");
		System.out.print("\n5 : SALIR");
		System.out.print("\nELIJA OPCION  ¬");
		op=dat.nextInt();
		switch(op){
			case 1: sol.fibo();
			break;
			case 2 : sol.pares();
			break;
			case 3: sol.primos();
			break;
			case 4: sol.ntriangular();
			break;
				}
			}
			while (op != 5);
		}
	}
