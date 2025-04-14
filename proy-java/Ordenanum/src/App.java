import java.util.*;
class nums {
    private int a, b, c;
    public nums(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void ord() {
        int[] arr = {a, b, c};
        int i = 0;
        do {
            Arrays.sort(arr);
            System.out.println("Números ordenados ascendentemente: " + Arrays.toString(arr));
            i++;
        } while (i < 1);
    }
}
public class App {
    public static void main(String[] args){
        Scanner ing = new Scanner(System.in);
        System.out.print("Ingrese tres números separados por espacio: ");
        int a = ing.nextInt(), b = ing.nextInt(), c = ing.nextInt();
        nums obj = new nums(a, b, c);
        obj.ord();
        ing.close();
    }
}
