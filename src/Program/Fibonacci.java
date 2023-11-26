package Program;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Se llama al método que ejecuta el programa
        mostrarPrograma();
    }

    // Función recursiva que calcula un término de la serie de Fibonacci
    static int serieFibonacci(int termino){
        int actual; // Creo la variable actual para almacenar el valor de ese término de la serie fibonacci

        /* El 1 será el caso base de la serie fibonacci, a partir de ahí, la suma de los dos últimos términos
           es el siguiente. En caso de que termino sea 1, se almacenará ese valor. */
        if(termino == 0 || termino == 1){
            actual = 1;
        }
        else{
            // El valor enésimo es igual a la suma de los dos valores anteriores
            actual = serieFibonacci(termino - 1) + serieFibonacci(termino - 2);
        }

        return actual;
    }

    // Método para mostrar el programa desde main
    static void mostrarPrograma(){
        int cantidad;

        Scanner scanner = new Scanner(System.in);

        System.out.println("SERIE DE FIBONACCI");
        System.out.println("------------------");
        System.out.print("Indica la cantidad de terminos que quieres mostrar: ");
        cantidad = scanner.nextInt();

        System.out.println("¿Quieres mostrar la serie en orden inverso? (S/N): ");
        char opcion = scanner.next().charAt(0);

        // Con el condicional if/else se muestra un mensaje de error si la cantidad es menor que 1
        if(cantidad > 0){
            // Utilizo un bucle for para poder mostrar por pantalla cada uno de los valores
            // Si no se utilizara el bucle for, mostraría solo el último valor.

            for(int i = 0; i < cantidad; i++){
                int valor = serieFibonacci(i);
                System.out.print(valor + " ");
            }
        }

        else{
            System.out.println("ERROR!: La cantidad tiene que ser mayor o igual que 0");
        }
    }
}

