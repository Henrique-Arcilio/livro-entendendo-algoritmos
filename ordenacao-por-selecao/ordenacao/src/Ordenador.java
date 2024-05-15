public class Ordenador {

    public static int buscarMenor(Integer[] array){
            int menor = array[0];
            int indexDoMenor = 0;
            for (int i = 0; i < (array.length - 1); i++){
                if (array[i] < menor){
                    menor = array[i];
                    indexDoMenor = i;
                }
            }
            array[indexDoMenor] = null;
            return menor;
    }

    public static int buscarMaior(Integer[] array){
        int maior = array[0];
        int indexDoMaior = 0;
        for (int i = 0; i < (array.length - 1); i++){
            if (array[i] > maior){
                maior = array[i];
                indexDoMaior = i;
            }
        }
        array[indexDoMaior] = null;
        return maior;
    }

    //public static int ordenar(Integer[] array, int escolha){
        //Integer[] arrayOrdenado = new Integer[array.length];

    //}
}