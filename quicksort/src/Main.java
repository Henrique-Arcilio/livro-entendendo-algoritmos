import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(1);
        lista.add(7);
        lista.add(5);
        lista.add(75);
        lista.add(22);
        lista.add(22);
       for(int num: QuickSort.ordenar(lista)){
           System.out.println(num);
       }
    }
}