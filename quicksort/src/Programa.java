import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String valores = scanner.nextLine();
        String[] cadaValor = valores.split(" ");

        for(String valor : cadaValor){
           lista.add(Integer.parseInt(valor));
        }

        for(int num: QuickSort.ordenar(lista)){
           System.out.println(num);
        }
    }
}