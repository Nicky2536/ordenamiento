import java.util.*;

public class Ordenamiento {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Random ram = new Random();
        System.out.print("Ingrese la cantidad de numeros: ");
        int cn = teclado.nextInt();
        int arr[] = new int[cn];
        
        for (int i = 0; i < cn; i++) {
            arr[i] = ram.nextInt(100); 
        }
        
        System.out.println("Arreglo original : " + Arrays.toString(arr));
        ordenar(arr);
        System.out.println("Arreglo ordenado : " + Arrays.toString(arr));
        teclado.close();
    }

    private static void ordenar(int v[]) {
        // 1. Encontrar el valor máximo del arreglo
        int max = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > max) max = v[i];
        }

        // 2. Crear arreglo de conteo con tamaño (max + 1)
        int[] conteo = new int[max + 1];

        // 3. Contar cuántas veces aparece cada número
        for (int i = 0; i < v.length; i++) {
            conteo[v[i]]++;
        }

        // 4. Reconstruir el arreglo ordenado
        int indice = 0;
        for (int i = 0; i < conteo.length; i++) {
            while (conteo[i] > 0) {
                v[indice] = i;
                indice++;
                conteo[i]--;
            }
        }
    }
}
//Counting Sort (Ordenamiento por Conteo): ordenamiento no por conteo sino por cantidad de numero
