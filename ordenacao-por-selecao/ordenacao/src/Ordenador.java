public class Ordenador {

    public static Integer buscarMenor(Integer[] array){
        Integer menor = null;
        int indexDoMenor = -1;

        for (int i = 0; i < array.length; i++){
            if(array[i] != null && (menor == null || array[i] < menor)){
                menor = array[i];
                indexDoMenor = i;
            }
        }
        if(indexDoMenor != -1)
            array[indexDoMenor] = null;

        return menor;
    }

    public static Integer buscarMaior(Integer[] array){
        Integer maior = null;
        int indexDoMaior = -1;

        for (int i = 0; i < (array.length); i++){
            if (array[i] != null && (maior == null || array[i] > maior)) {
                maior = array[i];
                indexDoMaior = i;
            }
        }
        if(indexDoMaior != -1){
            array[indexDoMaior] = null;
        }

        return maior;
    }

    public static Integer[] ordenarArray(Integer[] array, String ordem){
        Integer[] arrayOrdenado = new Integer[array.length];

        for(int i = 0; i < (array.length); i++){

            if (ordem.equalsIgnoreCase("decrescente")){
                arrayOrdenado[i] = buscarMaior(array);
            }
            else if (ordem.equalsIgnoreCase("crescente")){
                arrayOrdenado[i] = buscarMenor(array);
            }
        }
        return arrayOrdenado;
    }
}