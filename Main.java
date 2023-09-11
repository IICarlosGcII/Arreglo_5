import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int arreglo[]; //Iniciamos el arreglo por otro metodo
        boolean creciente=false, decreciente=false; // Declaramos variables de tipo booleano
        arreglo = new int[10]; //Terminamos de declarar el arreglo con 10 espacios

        System.out.println("Guardando los valores asignados al arreglo A... ");
        for(int i=0 ; i<10 ; i++ ) { //Guardamos los datos en el arreglo
            System.out.print("Digite los numeros para el arreglo: ");
            arreglo[i] = entrada.nextInt(); //Usamos el escanner
        }
        for(int i=0 ; i<9 ; i++){
            if(arreglo[i] < arreglo[i+1]){//1-2-3-4-5-6...a-[a+1] logica de un arreglo creciente
                creciente = true; //Creciente es verdadero
            }
            if(arreglo[i] > arreglo[i+1]) {//6-5-4-3-2-1...[a+1]-a logica de un arreglo decrecuente
                decreciente = true; //Creciente es falso o decreciente es verdadero
            }
        }

        if(creciente == true && decreciente == false){
            System.out.println("El arreglo es creciente");
        }
        else if(creciente == false && decreciente == true){
                System.out.println("El arreglo es decreciente");
        }
        else if(creciente == true && decreciente == true){
                System.out.println("El arreglo esta desordenado");
        }
        else if(creciente == false && decreciente == false){
                System.out.println("El arreglo contiene datos iguales");
            }
        }
    }










