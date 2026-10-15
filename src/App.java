public class App {
    public static void main(String[] args) {

       int[] numeros = {5,3,4,1,2};
        System.out.println("Arreglo original: " + java.util.Arrays.toString(numeros));
        Bubble burbuja = new Bubble();

        //Llamo al método
        burbuja.bubbleSort(numeros);
    }
}
