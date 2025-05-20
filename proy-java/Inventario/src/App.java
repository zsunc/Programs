import javax.swing.*;
import java.io.*;
public class App {
    public static void main(String[] args) throws IOException {
        int op;
        String men="";
        Inventario inv=new Inventario();
        do{
            men=JOptionPane.showInputDialog("1. INGRESO\n2. VER\n3. EDITAR\n4. SALIR\n ELIJA OPCION");
            op=Integer.parseInt(men);
            switch (op) {
                case 1: inv.ingreso();
                    break;           
                case 2: inv.ver();
                    break;
                case 3: inv.editar();
                    break;
            }
        } while(op!=4);  
    }
}
