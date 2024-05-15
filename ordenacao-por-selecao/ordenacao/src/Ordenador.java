public class Ordenador {

    public static int buscarMenor(int[] array){
            int menor = array[0];
            for (int num : array){
                if (num < menor){
                    menor = num;
                }
            }
            return menor;
    }

    public static int buscarMaior(int[] array){
        int maior = array[0];
        for (int num : array){
            if (num > maior){
                maior = num;
            }
        }
        return maior;
    }

    //public static int ordenar(int[] array, int escolha){
//}