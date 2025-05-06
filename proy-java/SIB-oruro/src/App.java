import javax.swing.*;
public class App {
    public static void main(String[] args){
        int op;
        String men="";
        Ingeniero p=null, u=null;
        Sistema sis=new Sistema();
        do{
            men=JOptionPane.showInputDialog(null, "SIB-ORURO\n1. INGRESAR\n2. VER\n3. BUSQUEDA POR ESPECIALIDAD\n4. BUSQUEDA POR GRADO\n5. BUSQUEDA POR NUMERO DE CELULAR\n6. MODIFICAR DATOS\n7. SALIR\n ELIJA UN OPCION",1);
            op=Integer.parseInt(men);
            switch(op){
                case 1: p=sis.ingreso(p, u);
                    break;
                case 2: sis.ver(p);
                    break;
                case 3: sis.busEsp(p);
                    break;
                case 4: sis.busGr(p);
                    break;
                case 5: sis.busCel(p);
                    break;
                case 6: sis.mod(p);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "SOCIEDAD DE INGENIEROS - ORURO\n");
                    break;
            }            
        } while(op!=7);
    }
}