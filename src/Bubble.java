public class Bubble {
    public void bubbleSort(int[] numeros) {
        for (int i = 0;i<numeros.length-1;i++){
            for (int j = 1;j < numeros.length;j++){
                if (numeros[j-1] > numeros[j]){
                    int temp = numeros[j-1];
                    numeros[j-1] = numeros[j];
                    numeros[j] = temp;;
                }
            }
        }
        System.out.println("Arreglo ordenado:" + java.util.Arrays.toString(numeros));
    }
}
