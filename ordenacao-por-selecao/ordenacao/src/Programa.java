public class Programa {
    public static void main(String[] args) {

        Integer[] array = {2,1,5,3,6,12,53};
        Integer[] arrayOrdenado = Ordenador.ordenarArray(array, "crescente");
        for(Integer num : arrayOrdenado) {
            System.out.println(num);
        }
    }
}