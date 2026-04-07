import java.util.*;

public class Ordenamiento {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Random ram = new Random();

        System.out.print("ingrese la cantidad de numeros:");
        int cn = teclado.nextInt();

        int arr[] = new int[cn];

        
        for (int i = 0; i < cn; i++) {
            arr[i] = ram.nextInt(100); 
        }

        
        System.out.println("arreglo original : " + Arrays.toString(arr));
        ordenar(arr);
        System.out.println("arreglo ordenado : " + Arrays.toString(arr));
        teclado.close();
    }

    private static void ordenar(int v[]) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }
}
//se da una cantidad de num, y l
