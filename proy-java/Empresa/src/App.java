import java.io.*;
import javax.swing.*;
public class App {
    public static void main(String[] args) throws IOException {
        int op;
        String men="";
        Empleados emp=new Empleados();
        do{
            men=JOptionPane.showInputDialog("1. INGRESO\n2. VER\n 3. SALIR\n ELIJA OPCION");
            op=Integer.parseInt(men);
            switch (op) {
                case 1: emp.ingreso();
                    break;           
                case 2: emp.leer();
                    break;
            }
        } while(op!=3);
    }
}
