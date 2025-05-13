import javax.swing.*;
public class DatosP {
    int aux_ci=0, sw=0;
    Persona ingreso (Persona p1, Persona u1) { 
        String res="";
        do{
            if (p1==null) {
                p1=new Persona ();
                res=JOptionPane.showInputDialog ("INGRESE NUM. DE CARNET:");
                p1.ci=Integer.parseInt(res);
                p1.no=JOptionPane.showInputDialog("INGRESE NOMBRE:");
                p1.di=JOptionPane.showInputDialog ("INGRESE DIRECCION:");
                p1.se=JOptionPane.showInputDialog ("INGRESE SEXO\n F : FEMENINO | M : MASCULINO");
                p1.pun=null;
            } else {
                do{
                    u1=p1;
                    sw=0;
                    aux_ci=Integer.parseInt(JOptionPane.showInputDialog ("INGRESE NUM. DE CARNET:"));
                    while (u1!=null) {
                        if (u1.ci==aux_ci) {
                            sw=1;
                            JOptionPane.showMessageDialog(null, "ESTE CARNET YA SE ENCUENTRA EN LA LISTA");
                            break;
                        }
                        u1=u1.pun;
                    }
                } while (sw==1);
                    u1=new Persona ();
                    u1.ci=aux_ci;
                    u1.no=JOptionPane.showInputDialog ("INGRESE NOMBRE:");
                    u1.di=JOptionPane.showInputDialog ("INGRESE DIRECCION:");
                    u1.se=JOptionPane.showInputDialog ("INGRESE SEXO:\n F : FEMENINO | M : MASCULINO");
                    u1.pun=p1;
                    p1=u1;
            }
            res=JOptionPane.showInputDialog ("PARA SALIR PRESIONE [>]",">");
        } while (res.compareTo(">") !=0);
    return (p1);
    }
    void ver (Persona u1) {
        String cad="";
        while (u1!=null) {
        cad+="Carnet: "+u1.ci+"\nNombre: "+u1.no+"\nDireccion: "+u1.di+"\nSexo: "+u1.se;
        u1=u1.pun;
        JOptionPane.showMessageDialog(null, cad);
        }
    }
    void separa (Persona u1){;
        Persona masc = null;
        Persona fem = null;
        while (u1!=null) {
            if(u1.se.equals("M")){
                Persona aux= new Persona();
                aux.ci = u1.ci;
                aux.no = u1.no;
                aux.di = u1.di;
                aux.se = u1.se;
                aux.pun = masc;
                masc = aux;
            } else if(u1.se.equals("F")){
                Persona aux= new Persona();
                aux.ci = u1.ci;
                aux.no = u1.no;
                aux.di = u1.di;
                aux.se = u1.se;
                aux.pun = fem;
                fem = aux;
            }
            u1 = u1.pun;
        }
        String chom="Lista de hombres:\n";
        String cfem="Lista de mujeres:\n";
        Persona cad = masc;
        while (cad != null) {
            chom += "Carnet: "+cad.ci+"\nNombre: "+cad.no+"\nDireccion: "+cad.di+"\nSexo: "+cad.se+"\n\n";
            cad = cad.pun;
        }
        cad = fem;
        while (cad != null) {
            cfem += "Carnet: "+cad.ci+"\nNombre: "+cad.no+"\nDireccion: "+cad.di+"\nSexo: "+cad.se+"\n\n";
            cad = cad.pun;
        }
        JOptionPane.showMessageDialog(null, chom);
        JOptionPane.showMessageDialog(null, cfem);
    }
}