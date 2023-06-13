// ejercicio 2 sumativa 2 .cpp : Programa que muestra la tabla de multiplicar y de dividir del 1 al 10 de cualquier numero entero. Por: Josmar Osorio. Para: Programación II-UBA.

import java.util.Scanner;//Importamos la libreria java.util.Scanner para poder leer datos ingresador por pantalla.

public class TablasDeMultiplicaryDividir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//Creamos el objeto sc para leer la entrada de datos que ingrese el usuario.

        System.out.println("Por favor ingrese un numero para visualizar su tabla de multiplicar y su tabla de dividir: "); //Mostramos el mensaje que le indica al usuario que debe ingresar un numero.
        int numero = sc.nextInt();//Leemos el numero ingresado por el usuario.

        for(int i = 1; i < 11; ++i) { //Creamos un bucle de tipo for que nos ayude a multilicar el numero ingresado por el usuario desde el 1 hasta llegar al 10.
            System.out.println(numero + "x" + i + "= " + numero * i);//Calculamos y mostramos el resultado por pantalla.
        }

        System.out.println();

        for (int i = numero, count = 0; count < 10; i += numero, count++) {//Creamos un ciclo for para calcular la tabla de divir de el numero ingresado.
            float resultado = (float) i / numero;                          //Este ciclo aumenta dependinedo de el numeor ingresado y finaliza solo cuando el ciclo se haya repedido un total de 10 veces.
            System.out.println(i + "/" + numero + "= " + resultado);
        }
    }
}