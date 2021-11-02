/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahomie.parenonefjmg;

import java.util.*;

/**
 *
 * @author fco-j
 */
public class Pare0None {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entry = new Scanner(System.in);
        int j1 = 0, j2 = 0, n;
        char choice;
        Random slap = new Random();
        
        do {//Pedimos manualmente los dedos (un nº de dedos
                        //por jugador)
                        System.out.println("Jugador 1, ¿cuántos dedos contamos?");
                        j1 = entry.nextInt();

                        System.out.println("Jugador 2, ¿cuántos dedos contamos?");
                        j2 = entry.nextInt();

                        if (j1 < 11 || j1 < 0 || j2 < 11 || j2 < 0) {
                            System.out.println("ERROR DE INPUT");
                        }

                        //"¿Lo introducido se sale del rango (0-10)? 
                        //PERMÍTEME QUE INSISTA"
                    } while (j1 < 11 || j1 < 0 || j2 < 11 || j2 < 0);
        
        //Se suman los números y se muestra si ha salido PARES o NONES
        n = j1 + j2;

        System.out.println("La suma es " + n);
        

        if (n % 2 == 0) {
            System.out.println("Según el resultado, ha salido PARES");
        } else {
            System.out.println("Según el resultado, ha salido NONES");
        }
        
    }
    
}
