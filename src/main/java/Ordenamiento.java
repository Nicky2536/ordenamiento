
import java.util.*;

public class Ordenamiento {
    public static void main(String[] args) {
       
   Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese la cantidad de numeros");
        int cn= teclado.nextInt();
        
        int arr[] = new int [cn];
        
        for( int i = 0; i<cn; i++){
            System.out.println("ingrese numero: "+ (i+1)+ ":");
        arr[i] = teclado.nextInt(); }
         
      ordenar(arr);
        System.out.println("El arreglo Ordenado: "+ Arrays.toString(arr));
        teclado.close();
    
    private static void ordenar(int v[]) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < v.length ; j++) {
                if (v[i] > v[j]) {
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }
}
//el usuario da el tamaño de el arr
//el usuario da los datos de el arr
