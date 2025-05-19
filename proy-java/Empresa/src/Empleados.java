import javax.swing.*;
import java.io.*;
public class Empleados extends ProcesoRW{
    void ingreso() throws IOException{
        String res="";
        abrir();
        do{
            res=JOptionPane.showInputDialog("INGRESE CI");
            ci=Integer.parseInt(res);
            nom=JOptionPane.showInputDialog("INGRESE NOMBRE");
            if(nom.length()<20){
                nom=nom+"    ";
                nom=nom.substring(0,20);
            } else{
                nom=nom.substring(0,20);
            }
            dir=JOptionPane.showInputDialog("INGRESE DIRECCION");
            if(dir.length()<25){
                dir=dir+"    ";
                dir=dir.substring(0,25);
            } else{
                dir=dir.substring(0,25);
            }
            cel=Integer.parseInt(JOptionPane.showInputDialog("INGRESE CELULAR"));
            suel=Float.parseFloat(JOptionPane.showInputDialog("INGRESE SUELDO"));
            est=Integer.parseInt(JOptionPane.showInputDialog("INGRESE ESTADO\n1. ACTIVO\n2. INACTIVO"));
            grabar(ci,nom,dir,cel,est,suel);
            JOptionPane.showMessageDialog(null,"LA INFORMACION FUE GUARDADA");
            res=JOptionPane.showInputDialog("ESCRIBA 'FIN' PARA SALIR");
        } while(res.compareTo("FIN")!=0);
        archi.close();
    }
    void leer() throws IOException{
        long can_reg;
        String cad="";
        int i;
        abrir();
        can_reg=archi.length()/106;
        for(i=0; i<can_reg; i++){
            archi.seek(106*i);
            ci=leer_int();
            nom=leer_cad(20);
            dir=leer_cad(25);
            cel=leer_int();
            est=leer_int();
            suel=leer_float();
            if(est==1){
                cad=cad+ci+" "+nom+" "+dir+" "+cel+" "+suel+" "+est+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,cad);
    }
}
