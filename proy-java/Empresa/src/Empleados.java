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
                nom=nom+"              ";
                nom=nom.substring(0,20);
            } else{
                nom=nom.substring(0,20);
            }
            dir=JOptionPane.showInputDialog("INGRESE DIRECCION");
            if(dir.length()<25){
                dir=dir+"             ";
                dir=dir.substring(0,25);
            } else{
                dir=dir.substring(0,25);
            }
            cel=Integer.parseInt(JOptionPane.showInputDialog("INGRESE CELULAR"));
            suel=Float.parseFloat(JOptionPane.showInputDialog("INGRESE SUELDO"));
            est=Integer.parseInt(JOptionPane.showInputDialog("INGRESE ESTADO\n1. ACTIVO\n2. INACTIVO"));
            archi.seek(archi.length());
            grabar(ci,nom,dir,cel,est,suel);
            JOptionPane.showMessageDialog(null,"LA INFORMACION FUE GUARDADA");
            res=JOptionPane.showInputDialog("ESCRIBA 'FIN' PARA SALIR","FIN");
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
                cad+="CI: "+ci+"\nNOMBRE: "+nom+"\nDIRECCION: "+dir+"\nCELULAR: "+cel+"\nSUELDO: "+suel+"\nESTADO: "+est+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,cad);
    }
    void editar() throws IOException {
        abrir();
        int i,op,buscador;
        String men="", menu="";
        boolean encontrado;
        men=JOptionPane.showInputDialog("INGRESE EL CARNET A BUSCAR.");
        buscador=Integer.parseInt(men);
        long can_reg = archi.length()/106;
        encontrado=false;
        for (i=0; i<can_reg; i++) {
            archi.seek(106*i);
            ci = leer_int();
            nom = leer_cad(20);
            dir = leer_cad(25);
            cel = leer_int();
            est = leer_int();
            suel = leer_float();
            if (ci==buscador) {
                encontrado=true;
                menu="¿QUE CAMPO DESEA EDITAR?"+"\n1. CI: "+ci+"\n2. NOMBRE: "+nom+"\n3. DIRECCION: "+dir+"\n4. CELULAR: "+cel+"\n5. ESTADO: "+est+"\n6. SUELDO: "+suel+"\nINGRESE OPCION.";
                op=Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (op) {
                    case 1:
                        ci = Integer.parseInt(JOptionPane.showInputDialog("NUEVO CI.", ci));
                        break;
                    case 2:
                        nom = JOptionPane.showInputDialog("NUEVO NOMBRE.", nom);
                        if (nom.length()<20) nom = nom + "                    ";
                        nom = nom.substring(0, 20);
                        break;
                    case 3:
                        dir = JOptionPane.showInputDialog("NUEVA DIRECCION.", dir);
                        if (dir.length()<25) dir = dir + "                         ";
                        dir = dir.substring(0, 25);
                        break;
                    case 4:
                        cel = Integer.parseInt(JOptionPane.showInputDialog("NUEVO CELULAR.", cel));
                        break;
                    case 5:
                        est = Integer.parseInt(JOptionPane.showInputDialog("NUEVO ESTADO.\n1. ACTIVO.\n2. INACTIVO.", est));
                        break;
                    case 6:
                        suel = Float.parseFloat(JOptionPane.showInputDialog("NUEVO SUELDO.", suel));
                        break;
                }
                archi.seek(106*i);
                grabar(ci, nom, dir, cel, est, suel);
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO EL REGISTRO CON EXITO.");
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL NUMERO DE CELULAR.");
        }
        archi.close();
    } 
}
