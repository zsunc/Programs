import java.io.*;
public class ProcesoRW {
RandomAccessFile archi;
int ci,cel,est; 
String nom,dir;
float suel;
//nom=20, dir=25, int= 4,4,4 float 4 = 40+50+4+4+4+4 = 106 
    void abrir() throws IOException{
        archi=new RandomAccessFile("E:/proyects/EMPRESA/EMPLEADO.txt","rw");
    }
    String leer_cad (int longitud) throws IOException{
        int i;
        String cad="";
        for (i=0; i<longitud; i++){
            cad=cad+archi.readChar();
        }
        return cad;
    }
    int leer_int() throws IOException{
        int numE;
        numE=archi.readInt();
        return numE;
    }
    float leer_float() throws IOException{
        float numR;
        numR=archi.readFloat();
        return numR;
    }
    void grabar(int ci, String nom, String dir, int cel, int est, float suel) throws IOException{
        archi.writeInt(ci);
        archi.writeChars(nom);
        archi.writeChars(dir);
        archi.writeInt(cel);
        archi.writeInt(est);
        archi.writeFloat(suel);
    }
}
