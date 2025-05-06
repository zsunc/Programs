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
            dat=JOptionPane.showInputDialog("ESCRIBA 'FIN' PARA FINALIZAR","FIN");
    } while(dat.compareTo("FIN")!=0);
    return (p);
    }
    void ver(Ingeniero x){
        String cad="";
        while(x!=null){
            cad=cad+"MATRICULA: "+x.ma+"\n"+"NOMBRE: "+x.nom+"\n"+"DIRECCION: "+x.dir+"\n"+"ESPECIALIDAD: "+x.esp+"\n"+"CELULAR: "+x.cel+"\n"+"GRADO: "+x.gr+"\n"+"\n";
            x=x.sig;
        }
        JOptionPane.showMessageDialog(null,"SOCIEDAD DE INGENIEROS - ORURO\n"+cad);
    }
    void busEsp(Ingeniero x){
        String cad="", aux="";
        aux=JOptionPane.showInputDialog(null, "INGRESE LA ESPECIALIDAD A BUSCAR");
        while(x!=null){
            if(aux.compareTo(x.esp)==0){
                cad="MATRICULA: "+x.ma+"\n"+"NOMBRE: "+x.nom+"\n"+"DIRECCION: "+x.dir+"\n"+"ESPECIALIDAD: "+x.esp+"\n"+"CELULAR: "+x.cel+"\n"+"GRADO: "+x.gr+"\n";
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
                cad="MATRICULA: "+x.ma+"\n"+"NOMBRE: "+x.nom+"\n"+"DIRECCION: "+x.dir+"\n"+"ESPECIALIDAD: "+x.esp+"\n"+"CELULAR: "+x.cel+"\n"+"GRADO: "+x.gr+"\n";
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
                cad="MATRICULA: "+x.ma+"\n"+"NOMBRE: "+x.nom+"\n"+"DIRECCION: "+x.dir+"\n"+"ESPECIALIDAD: "+x.esp+"\n"+"CELULAR: "+x.cel+"\n"+"GRADO: "+x.gr+"\n";
            }
            x=x.sig;
        }
        JOptionPane.showInputDialog(null, "SOCIEDAD DE INGENIEROS - ORURO\n"+cad);
    }
    void mod(Ingeniero x){
        String cad="", aux="", datos="";
        int mat;
        aux=JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE MATRICULA A MODIFICAR");
        mat=Integer.parseInt(aux);
        while(x!=null){
            if(mat==x.ma){
                datos="DATOS ANTIGUOS:\n";
                datos+="MATRICULA: "+x.ma+"\n";
                datos+="NOMBRE: "+x.nom+"\n";
                datos+="DIRECCION: "+x.dir+"\n";
                datos+="ESPECIALIDAD: "+x.esp+"\n";
                datos+="CELULAR: "+x.cel+"\n";
                datos+="GRADO: "+x.gr+"\n\n";
                x.nom=JOptionPane.showInputDialog(null, "INGRESE EL NUEVO NOMBRE");
                x.dir=JOptionPane.showInputDialog(null, "INGRESE LA NUEVA DIRECCION");
                x.esp=JOptionPane.showInputDialog(null, "INGRESE LA NUEVA ESPECIALIDAD");
                x.cel=Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL NUEVO NUMERO DE CELULAR"));
                x.gr=JOptionPane.showInputDialog(null, "INGRESE EL NUEVO GRADO");
                cad+="DATOS ACTUALIZADOS A:\n"+"MATRICULA: "+x.ma+"\n"+"NOMBRE: "+x.nom+"\n"+"DIRECCION: "+x.dir+"\n"+"ESPECIALIDAD: "+x.esp+"\n"+"CELULAR: "+x.cel+"\n"+"GRADO: "+x.gr+"\n";
            }
            x=x.sig;
        }
        JOptionPane.showMessageDialog(null, "SOCIEDAD DE INGENIEROS - ORURO\n"+datos+cad);
    }
}
