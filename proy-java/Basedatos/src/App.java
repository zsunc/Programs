import javax.swing.*;
public class App {
    public static void main(String[] args) {
        int op;
        String men="";
        DatosP dat=new DatosP();
        Persona p=null, u=null;
            do{
                men=JOptionPane.showInputDialog("\n1. CREAR\n2. VER\n3. SEPARAR LISTAS\n4. SALIR\n ELIJA OPCION");
                op=Integer.parseInt(men);
                switch (op){
                    case 1: p=dat.ingreso (p, u);
                    break;
                    case 2: dat.ver (p);
                    break;
                    case 3: dat.separa (p);
                    break;
                    case 4: JOptionPane.showMessageDialog (null, "CERRANDO PROGRAMA");
                    break;
                }
            } while (op!=4);
    }
}
