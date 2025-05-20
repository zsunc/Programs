import javax.swing.*;
import java.io.*;
public class Inventario extends RW {
    void ingreso() throws IOException{
        String men="";
        abrir();
        do{
            nom=JOptionPane.showInputDialog("INGRESE NOMBRE DEL PRODUCTO");
            nom=String.format("%-20s",nom).substring(0,20);
            marc=JOptionPane.showInputDialog("INGRESE MARCA DEL PRODUCTO");
            marc=String.format("%-20s",marc).substring(0,20);
            model=JOptionPane.showInputDialog("INGRESE MODELO DEL PRODUCTO");
            model=String.format("%-20s",model).substring(0,20);
            tipo=JOptionPane.showInputDialog("INGRESE TIPO DEL PRODUCTO");
            tipo=String.format("%-20s",tipo).substring(0,20);
            seri=Integer.parseInt(JOptionPane.showInputDialog("SERIE DEL PRODUCTO"));
            cant=Integer.parseInt(JOptionPane.showInputDialog("CANTIDAD DEL PRODUCTO"));    
            garan=Integer.parseInt(JOptionPane.showInputDialog("GARANTIA DEL PRODUCTO\n1. CON GARANTIA\n2. SIN GARANTIA"));
            precio=Float.parseFloat(JOptionPane.showInputDialog("PRECIO DEL PRODUCTO"));
            archi.seek(archi.length());
            grabar(seri, cant, garan, nom, marc, model, tipo, precio);
            JOptionPane.showMessageDialog(null,"PRODUCTO INGRESADO");
            men=JOptionPane.showInputDialog("PARA SALIR PRESIONE ENTER.","EXIT");
        } while(men.compareTo("EXIT")!=0);
        archi.close();
    }
    void ver() throws IOException{
        long tam_cad;
        String cad="";
        int i;
        abrir();
        tam_cad=archi.length()/176;
        for (i=0; i<tam_cad; i++){
            archi.seek(176*i);
            seri=leerent();
            cant=leerent();
            garan=leerent();
            nom=leercad(20);
            marc=leercad(20);
            model=leercad(20);
            tipo=leercad(20);
            precio=leerflt();
            if(cant>=1){
                cad+="\nSERIE: "+seri+"\nCANTIDAD: "+cant+"\nNOMBRE: "+nom+"\nMARCA: "+marc+"\nMODELO: "+model+"\nTIPO: "+tipo+"\nPRECIO: "+precio+"\nGARANTIA: "+garan+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,cad);
    }
    void editar() throws IOException {
        abrir();
        int i,op,buscador;
        String men="", menu="";
        boolean encontrado;
        men=JOptionPane.showInputDialog("INGRESE EL NUMERO DE SERIE A BUSCAR.");
        buscador=Integer.parseInt(men);
        long ln_cad = archi.length()/176;
        encontrado=false;
        for (i=0; i<ln_cad; i++) {
            archi.seek(176*i);
            seri=leerent();
            cant=leerent();
            garan=leerent();
            nom=leercad(20);
            marc=leercad(20);
            model=leercad(20);
            tipo=leercad(20);
            precio=leerflt();
            if (seri==buscador) {
                encontrado=true;
                menu="¿QUE CAMPO DESEA EDITAR?"+"\n1. SERIE: "+seri+"\n2. CANTIDAD: "+cant+"\n3. GARANTIA: "+garan+"\n4. NOMBRE: "+nom+"\n5. MARCA: "+marc+"\n6. MODELO: "+model+"\n7. TIPO: "+tipo+"\n8. PRECIO: "+precio+"\nINGRESE OPCION.";
                op=Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (op) {
                    case 1: seri=Integer.parseInt(JOptionPane.showInputDialog("NUEVA SERIE.", seri));
                        break;
                    case 2: cant=Integer.parseInt(JOptionPane.showInputDialog("NUEVA CANTIDAD.", cant));
                        break;
                    case 3: garan = Integer.parseInt(JOptionPane.showInputDialog("NUEVA GARANTIA.", garan));
                        break;
                    case 4: nom = JOptionPane.showInputDialog("NUEVO NOMBRE.", nom);
                            nom = String.format("%-20s", nom).substring(0, 20);
                        break;
                    case 5: marc = JOptionPane.showInputDialog("NUEVA MARCA.", marc);
                            marc = String.format("%-20s", marc).substring(0, 20);
                        break;
                    case 6: model = JOptionPane.showInputDialog("NUEVO MODELO.", model);
                            model = String.format("%-20s", model).substring(0, 20);
                        break;
                    case 7: tipo = JOptionPane.showInputDialog("NUEVO TIPO.", tipo);
                            tipo = String.format("%-20s", tipo).substring(0, 20);
                        break;
                    case 8: precio = Float.parseFloat(JOptionPane.showInputDialog("NUEVO PRECIO.", precio));
                        break;
                }
                archi.seek(176*i);
                grabar(seri, cant, garan, nom, marc, model, tipo, precio);
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO EL REGISTRO CON EXITO.");
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL NUMERO DE SERIE.");
        }
        archi.close();
    }
}