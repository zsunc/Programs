import java.io.*;
public class RW {
RandomAccessFile archi;
int seri, cant, garan; // serie=4, cantidad=4, garantia=4
String nom, marc, model, tipo; //nom=20,marc=20,model=20,tipo=20
float precio; // precio =4   40+40+40+40+4+4+4+4=176
    void abrir() throws IOException{
        archi=new RandomAccessFile("../Inventario/data/INVENTARIO.txt","rw");
    }
    String leercad (int tam) throws IOException{
        int i;
        String cad="";
        for (i=0; i<tam; i++){
            cad+=archi.readChar();
        }
        return cad;
    }
    int leerent() throws IOException{
        int ent;
        ent=archi.readInt();
        return ent;
    }
    float leerflt() throws IOException{
        float flt;
        flt=archi.readFloat();
        return flt;
    }
    void grabar(int serie, int cant, int garan, String nom, String marc, String model, String tipo, float precio) throws IOException{
        archi.writeInt(serie);
        archi.writeInt(cant);
        archi.writeInt(garan);
        archi.writeChars(nom);
        archi.writeChars(marc);
        archi.writeChars(model);
        archi.writeChars(tipo);
        archi.writeFloat(precio);
    }
}
