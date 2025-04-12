import java.util.*;
class operaciones {
Scanner dato= new Scanner(System.in);
    void suma (){
    int n,m,s=0;
    System.out.println("\nS U M A");
    System.out.print("INGRESE UN NUMERO: ¬ ");
    n = dato.nextInt();
    System.out.print("INGRESE UN SEGUNDO NUMERO: ¬ ");
    m = dato.nextInt();
    s = n + m;
    System.out.println("EL RESULTADO DE LA SUMA ES: "+s+"\n");
    }
    void resta(){
        int n,m,r=0;
        System.out.println("\nR E S T A");
        System.out.print("INGRESE UN NUMERO: ¬ ");
        n = dato.nextInt();
        System.out.print("INGRESE UN SEGUNDO NUMERO: ¬ ");
        m = dato.nextInt();
        r = n - m;
        System.out.println("EL RESULTADO DE LA RESTA ES: "+r+"\n");
    }
}
