import java.util.*;
public class App {
    public static void main(String[] args){
		int op;
		Series ser=new Series();
		Tablas tab=new Tablas();
		Scanner ing=new Scanner(System.in);
		do { 
			System.out.print("\nM E N U  P R I N C I P A L");
			System.out.print("\n1 : SERIES ");
			System.out.print("\n2 : TABLAS ");
			System.out.print("\n3 : ELIJA OPCION  ¬");
			op = ing.nextInt();
			switch(op){
				case 1 : ser.menu_series();
				break;
				case 2 : tab.menu_tablas();
				break;		
				}
			}
			while (op != 3);
            ing.close();
		}
}
