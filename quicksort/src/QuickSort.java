import java.util.ArrayList;

public class QuickSort {

    public static ArrayList<Integer> ordenar(ArrayList<Integer> array ){

        if(array.size() < 2){
            return array;
        }
        else{
            ArrayList<Integer> arrayOrdenado = new ArrayList<>();
            ArrayList<Integer> arrayMenores = new ArrayList<>();
            ArrayList<Integer> arrayMaiores = new ArrayList<>();
            int pivo = array.getFirst();

            for(int i = 1; i < array.size(); i++){

                if(array.get(i) < pivo){
                    arrayMenores.add(array.get(i));
                }else{
                    arrayMaiores.add(array.get(i));
                }
            }
            arrayOrdenado.addAll(ordenar(arrayMenores));
            arrayOrdenado.add(pivo);
            arrayOrdenado.addAll(ordenar(arrayMaiores));
            return arrayOrdenado;
        }

    }
}
