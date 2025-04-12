import java.util.*;
class TABLAS {
	SOL_TABLAS sol= new SOL_TABLAS();
	void menu_tablas(){
		int op;
		Scanner dat = new Scanner(System.in);
		do{
		System.out.print("\nMENU TABLAS");
		System.out.print("\n1 : TRIANGULAR");
		System.out.print("\n2 : CHINA");
		System.out.print("\n3 : SALIR");
		System.out.print("\nELIJA OPCION  ¬");
		op=dat.nextInt();
		switch(op){
			case 1: sol.triangular(); 
			break;
			case 2 : sol.china();
			break;
				}
			}
			while (op != 3);
		}
	}
