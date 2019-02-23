package app;

import Excepciones.isEmptyException;
import Stack.StackDoubleList;
import Stack.Stacks;

public class Main {

    public static Stacks<Integer> pila, pila2;

    public static void main(String[] args) {

        pila = new StackDoubleList<>(7);
        pila2 = new StackDoubleList<>(7);

        pila.push(5);
        pila.push(6);
        pila.push(4);
        pila.push(1);
        pila.push(2);
        pila.push(1);
        pila.push(7);
        
        pila2.push(5);
        pila2.push(6);
        pila2.push(4);
        pila2.push(1);
        pila2.push(2);
        pila2.push(1);
        pila2.push(7);

        

        if (pila.compareTo(pila2) == 0) {
            System.out.println("Las pilas son iguales"); //Primero comparara las pilas para ver si son iguales 
            System.out.println("");                      //Y el resultado sera verdadero
        }

        try {

            System.out.println("Elemento retirado de la pila 1: " + pila.pop());   //Se realizara el pop modificando la lista
            System.out.println("Elemento al inicio de la pila 2: " + pila2.peak());      //Se mostrara el elemento  
            System.out.println("");   

        } catch (isEmptyException e) {

            System.err.println(e.getMessage());

        }
        
        if (!(pila.compare(pila, pila2) == 0)) {
            System.out.println("Las pilas son diferentes");     //Al haberse cambiado la pila, se volveran a comparar
                                                                //Pero ahora el resultado sera negativo porque ya no son iguales
        }
    }

}
