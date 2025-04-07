import java.util.Scanner;

public class EjercicioVectores3 {
    public static void main(String[] args) {
        /*
        * Realizar un programa que permita la carga de 15 numeros en un vector.
        * Una vex cargados, se nececita que el programa cuente e informe por pantalla cuantas veces se cargo el numero 3
        * */

        //Carga de 15 numeros en un vector
        int numeros[]= new int[15];
        Scanner teclado = new Scanner(System.in);

        for (int i=0;i<15;i++){
            System.out.println("Ingrese el numero para el indice:"+i);
            numeros[i]=teclado.nextInt();
        }
        //Contar cuantos numeros 3 hay


    }
}
