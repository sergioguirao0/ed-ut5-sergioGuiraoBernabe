package Program;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        // Se llama a la función mostrar menú. Las funciones de generar aleatorios están dentro de esta función.
        mostrarMenu();
    }

    // Función con parámetros mínimo, máximo y cantidad de números aleatorios entre esos dos valores.
    static void generarAleatorios(int min, int max, int cant){
        int aleatorio;
        for(int i = 1; i <= cant; i++){
            /* Utilizo la función random para crear números aleatorios entre 0 y 1. Estos números se multiplican por
               la diferencia entre max y min para que los números estén entre 0 y el valor de la resta de max y min.
               Con esto nos quedarían números aleatorios entre 0 y (max - min). Con round se redondea para que pueda
               salir el máximo y con (int) se convierten a enteros. Luego se le suma el mínimo para que queden entre
               el mínimo y el máximo. Si no se utilizara round, el número que se indica como máximo no aparecería
               nunca entre las posibilidades
             */
            aleatorio = min + (int)Math.round(Math.random() * (max - min));
            System.out.println(aleatorio);
        }
    }

    // Función con parámetro cantidad que genera números aleatorios entre 0 y 1.
    static void generarAleatorios(int cant){
        double aleatorio;
        for(int i = 1; i <= cant; i++){
            // La función Math.random crea siempre números aleatorios entre 0 y 1
            aleatorio = Math.random();
            System.out.println(aleatorio);
        }
    }

    // Función para mostrar el menú desde donde se llamarán a las otras funciones creadas
    static void mostrarMenu(){
        // Declaración de variables del método
        int opcion;
        int minimo;
        int maximo;
        int cantidadAleatorios;

        Scanner scanner = new Scanner(System.in);

        // Información inicial
        System.out.println("GENERADOR DE NÚMEROS ALEATORIOS");
        System.out.println("-------------------------------");

        // Bucle do/while para realizar el menú mientras no se indique la opción de salir del programa
        do{
            // Información del menú
            System.out.println("Menú: ");
            System.out.println("1. Genera números aleatorios eligiendo el mínimo, el máximo y la cantidad de números.");
            System.out.println("2. Genera números aleatorios entre 0 y 1, eligiendo la cantidad.");
            System.out.println("3. Salir del programa.");
            System.out.print("\nElige una opción: ");

            opcion = scanner.nextInt();

            // Realizo un condicional switch para desarrollar las distintas opciones
            switch(opcion){
                case 1:
                    // En la opción 1 se solicitan el mínimo, máximo y cantidad de aleatorios que se quieren ver.
                    System.out.print("Indica el número mínimo: ");
                    minimo = scanner.nextInt();
                    System.out.print("Indica el número máximo: ");
                    maximo = scanner.nextInt();
                    System.out.print("Indica la cantidad de aleatorios que quieres producir: ");
                    cantidadAleatorios = scanner.nextInt();

                    // Se llama al método creado anteriormente con los 3 parámetros
                    generarAleatorios(minimo, maximo, cantidadAleatorios);

                    System.out.print("\n");

                    break;

                case 2:
                    // En la opción 2 se solicita la cantidad de aleatorios
                    System.out.print("Indica la cantidad de aleatorios que quieres producir: ");
                    cantidadAleatorios = scanner.nextInt();

                    // Se llama al método creado anteriormente con 1 parámetro
                    generarAleatorios(cantidadAleatorios);

                    System.out.print("\n");

                    break;

                case 3:
                    // La opción 3 se utilizará para finalizar el programa
                    System.out.println("Cerrando programa. Gracias!");

                    break;

                default:
                    // Mensaje en caso de opción no válida
                    System.out.println("Incorrecto");
            }
        }while(opcion != 3);
    }
}
