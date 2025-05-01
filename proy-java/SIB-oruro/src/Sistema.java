import javax.swing.*;
public class Sistema {
    Ingeniero ingreso(Ingeniero p, Ingeniero u){
    String dat="";
    do{
        if(p==null){
            p=new Ingeniero();
            dat=JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE MATRICULA");
            p.ma=Integer.parseInt(dat);
            p.nom=JOptionPane.showInputDialog(null, "INGRESE SU NOMBRE COMPLETO");
            p.dir=JOptionPane.showInputDialog(null, "INGRESE SU DIRECCION");
            p.esp=JOptionPane.showInputDialog(null, "INGRESE LA ESPECIALIDAD");
            dat=JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE CELULAR");
            p.cel=Integer.parseInt(dat);
            p.gr=JOptionPane.showInputDialog(null, "INGRESE EL GRADO DEL INGENIERO");
            p.sig=null;
        } else {
            u=new Ingeniero();
            dat=JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE MATRICULA");
            u.ma=Integer.parseInt(dat);
            u.nom=JOptionPane.showInputDialog(null, "INGRESE SU NOMBRE COMPLETO");
            u.dir=JOptionPane.showInputDialog(null, "INGRESE SU DIRECCION");
            u.esp=JOptionPane.showInputDialog(null, "INGRESE LA ESPECIALIDAD");
            dat=JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE CELULAR");
            u.cel=Integer.parseInt(dat);
            u.gr=JOptionPane.showInputDialog(null, "INGRESE EL GRADO DEL INGENIERO");
            u.sig=p;
            p=u;
            }
            dat=JOptionPane.showInputDialog("ESCRIBA 'FIN' PARA FINALIZAR");
    } while(dat.compareTo("FIN")!=0);
    return (p);
    }
    void ver(Ingeniero x){
        String cad="";
        while(x!=null){
            cad=cad+"MATRICULA: "+x.ma+"\n";
            cad=cad+"NOMBRE: "+x.nom+"\n";
            cad=cad+"DIRECCION: "+x.dir+"\n";
            cad=cad+"ESPECIALIDAD: "+x.esp+"\n";
            cad=cad+"CELULAR: "+x.cel+"\n";
            cad=cad+"GRADO: "+x.gr+"\n";
            cad=cad+"\n";
            x=x.sig;
        }
        JOptionPane.showMessageDialog(null,"SOCIEDAD DE INGENIEROS - ORURO\n"+cad);
    }
    void busEsp(Ingeniero x){
        String cad="", aux="";
        aux=JOptionPane.showInputDialog(null, "INGRESE LA ESPECIALIDAD A BUSCAR");
        while(x!=null){
            if(aux.compareTo(x.esp)==0){
                cad="MATRICULA: "+x.ma+"\n";
                cad=cad+"NOMBRE: "+x.nom+"\n";
                cad=cad+"DIRECCION: "+x.dir+"\n";
                cad=cad+"ESPECIALIDAD: "+x.esp+"\n";
                cad=cad+"CELULAR: "+x.cel+"\n";
                cad=cad+"GRADO: "+x.gr+"\n";
            }
            x=x.sig;
        }
        JOptionPane.showInputDialog(null, "SOCIEDAD DE INGENIEROS - ORURO\n"+cad);
    }
    void busGr(Ingeniero x){
        String cad="", aux="";
        aux=JOptionPane.showInputDialog(null, "INGRESE LA ESPECIALIDAD A BUSCAR");
        while(x!=null){
            if(aux.compareTo(x.gr)==0){
                cad="MATRICULA: "+x.ma+"\n";
                cad=cad+"NOMBRE: "+x.nom+"\n";
                cad=cad+"DIRECCION: "+x.dir+"\n";
                cad=cad+"ESPECIALIDAD: "+x.esp+"\n";
                cad=cad+"CELULAR: "+x.cel+"\n";
                cad=cad+"GRADO: "+x.gr+"\n";
            }
            x=x.sig;
        }
        JOptionPane.showInputDialog(null, "SOCIEDAD DE INGENIEROS - ORURO\n"+cad);
    }
    void busCel(Ingeniero x){
        String cad="", aux="";
        int num;
        aux=JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE CELULAR A BUSCAR");
        num=Integer.parseInt(aux);
        while(x!=null){
            if(num==x.cel){
                cad="MATRICULA: "+x.ma+"\n";
                cad=cad+"NOMBRE: "+x.nom+"\n";
                cad=cad+"DIRECCION: "+x.dir+"\n";
                cad=cad+"ESPECIALIDAD: "+x.esp+"\n";
                cad=cad+"CELULAR: "+x.cel+"\n";
                cad=cad+"GRADO: "+x.gr+"\n";
            }
            x=x.sig;
        }
        JOptionPane.showInputDialog(null, "SOCIEDAD DE INGENIEROS - ORURO\n"+cad);
    }
    void mod(Ingeniero x){
        String cad="", aux="", datosAntiguos="";
        int matricula;
        aux=JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE MATRICULA A MODIFICAR");
        matricula=Integer.parseInt(aux);
        while(x!=null){
            if(matricula==x.ma){
                // Guardamos los datos antiguos
                datosAntiguos="DATOS ANTIGUOS:\n";
                datosAntiguos+="MATRICULA: "+x.ma+"\n";
                datosAntiguos+="NOMBRE: "+x.nom+"\n";
                datosAntiguos+="DIRECCION: "+x.dir+"\n";
                datosAntiguos+="ESPECIALIDAD: "+x.esp+"\n";
                datosAntiguos+="CELULAR: "+x.cel+"\n";
                datosAntiguos+="GRADO: "+x.gr+"\n\n";
                
                // Modificamos los datos
                x.nom=JOptionPane.showInputDialog(null, "INGRESE EL NUEVO NOMBRE");
                x.dir=JOptionPane.showInputDialog(null, "INGRESE LA NUEVA DIRECCION");
                x.esp=JOptionPane.showInputDialog(null, "INGRESE LA NUEVA ESPECIALIDAD");
                x.cel=Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL NUEVO NUMERO DE CELULAR"));
                x.gr=JOptionPane.showInputDialog(null, "INGRESE EL NUEVO GRADO");
                
                // Preparamos los datos actualizados
                cad="DATOS ACTUALIZADOS A:\n";
                cad+="MATRICULA: "+x.ma+"\n";
                cad+="NOMBRE: "+x.nom+"\n";
                cad+="DIRECCION: "+x.dir+"\n";
                cad+="ESPECIALIDAD: "+x.esp+"\n";
                cad+="CELULAR: "+x.cel+"\n";
                cad+="GRADO: "+x.gr+"\n";
            }
            x=x.sig;
        }
        JOptionPane.showMessageDialog(null, "SOCIEDAD DE INGENIEROS - ORURO\n"+datosAntiguos+cad);
    }
}
