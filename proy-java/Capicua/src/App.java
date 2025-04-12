import java.util.*;
public class App {
    static boolean Capicua(int n){
        //numero original: org || numero inverso: inv
        int org= n, inv= 0;
        while (n != 0 ){
            int ult = n% 10;
                inv = inv*10+ult;
                n /= 10;
            }
        return org == inv;
    }
    public static void main(String[] args) throws Exception {
    Scanner ing=new Scanner(System.in);
    System.out.print("ing. numero para verficar si es capicua");
    int n = ing.nextInt();
    if(Capicua(n)){
        System.out.print(n+" es un numero capicua.");
        } else {
            System.out.print(n+" no es un numero capicua");
            } ing.close();
    }
}
