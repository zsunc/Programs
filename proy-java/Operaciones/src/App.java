import java.util.*;
public class App {
    public static void main(String[] args){
        Operaciones op=new Operaciones();
        Scanner leer= new Scanner(System.in); 
        int opcion;
        do{
            System.out.println("M E N U  P R I N C I P A L\n");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. SALIR");
            System.out.print("SELECCION: ¬ ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: op.suma();
                    break;
    
            case 2: op.resta();
                    break;
    
            }
        } while(opcion != 3);
        leer.close();
    }
}
