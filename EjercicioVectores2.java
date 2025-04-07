import java.util.Scanner;

public class EjercicioVectores2 {
    public static void main(String[] args) {
        /*
        * Realizar un programa que permita la carga de 10 numeros en un vector
        * Una vez cargados, se nececita que el programa determine cual es el mayor
        * y cual es el menor de ellos.
        * */

        int numeros[]=new int[10];
        Scanner teclado = new Scanner(System.in);

        //carga del vector
        for (int i=0; i<10; i++){
            System.out.println("ingrese el numero que queire cargar en la posicion"+i);
            numeros[i]= teclado.nextInt();
        }

        //busqueda del mayor
        int mayor=Integer.MIN_VALUE;
        for (int i=0;i<10;i++){
            if(numeros[i]>mayor){
                mayor=numeros[i];
            }
        }
        //busqueda del menor
        int menor=Integer.MAX_VALUE;
        for (int i=0;i<10;i++){
            if(numeros[i]<menor){
                menor=numeros[i];
            }
        }
        System.out.println("El mayor es:"+mayor);
        System.out.println("El menor es:"+menor);

    }
}
