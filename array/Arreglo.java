package arreglo;

import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int n, k, resultado = 0, sumaValores = 0, nuevoVal = 0, arr[][];

        n = l.nextInt();
        k = l.nextInt();

        arr = new int[k + 1][n];

//  llenamos la primer fila del arreglo con el número de elementos especificados.
//  validamos la entrada de valores enteros positivos, n >= 1, n < 100.
        for (int i = 0; i < arr[0].length; i++) {
            boolean bandera = true;
            while (bandera) {
                int valPos = l.nextInt();
                if (valPos >= 1 && valPos < 100) {
                    arr[0][i] = valPos;
                    sumaValores += arr[0][i];
                    bandera = false;
                } else {
                    System.out.println("Valores incorrectos, debe ingresar números enteros positivos menores de 100");
                }
            }

        }
//  realizamos el proceso de resolución del problema, recorriendo la matriz de arreglos, 
//  llenado las posiciones de las filas con los valores correspondientes.
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                nuevoVal = (sumaValores - arr[i][j]);
                if (i == (arr.length - 1)) {
                    break;
                } else {
                    arr[i + 1][j] = nuevoVal;
                    resultado += arr[i + 1][j];

                }

            }
            sumaValores = resultado;
            resultado = 0;
        }

//  Obtenemos el resultado final de la suma de ultima fila del arreglo de matrices, 
//  y lo mandamos imprimir finalmente.
        for (int i = 0; i < arr[k].length; i++) {
            resultado += arr[k][i];
        }
        System.out.println("Resultado: " + resultado);

    }

}
