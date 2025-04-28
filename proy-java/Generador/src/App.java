import javax.swing.*;
public class App {
    public static void main(String[] args){
        int op, n=0, ma[][];
        ma = new int[20][20];
        solucion sol=new solucion();
        String men="";
        do{
            men=JOptionPane.showInputDialog("MENU\n1. DIMENSION\n2. MATRIZ MAGICA\n3. MATRIZ TUNEL\n4. TRIANGULO DE PASCAL\n5. SERIE VIBORA\n6. SERIE FACTORIALES\n7. SALIR\nELIJA UNA OPCION",1);
            op=Integer.parseInt(men);
            switch (op){
                case 1:
                    men=JOptionPane.showInputDialog(null, "INGRESE DIMENSION");
                    n=Integer.parseInt(men);
                    break;
                case 2: sol.magico(n, ma);
                    break;
                case 3: sol.tunel(n, ma);
                    break;
                case 4: sol.pascal(n, ma);
                    break;
                case 5: sol.vibora(n, ma);
                    break;
                case 6: sol.seriefact(n, ma);
                    break;
            }
        } while(op != 7);
    }
}
