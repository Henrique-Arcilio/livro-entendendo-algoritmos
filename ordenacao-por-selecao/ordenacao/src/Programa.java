import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Integer[] array = new Integer[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.printf("informe o %d° valor: ", i+1);
            int valor = scanner.nextInt();
            array[i] = valor;
        }
        System.out.print("Crescente ou decrescente: ");
        String escolha = scanner.next();
        Integer[] arrayOrdenado = Ordenador.ordenarArray(array, escolha.toLowerCase());

        System.out.println("Valores em ordem: ");
        for(Integer num : arrayOrdenado) {
            System.out.print(num + " ");
        }
    }
}