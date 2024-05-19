import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os números desejados com espaçamento entre eles (num1 num2 num3...)");
        System.out.print("valores: ");
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