/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema4;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double gradosCent,gradosFah;    // Declaración de variables
    
    gradosCent= pedirDato();            //Metodos
    gradosFah= calcularFah(gradosCent);
    mostrarResultado(gradosCent,gradosFah);
    }
    
    public static double pedirDato() {      //Metodo para pedir datos
        double dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca temperatura en grados Centigrados");
        dato = entrada.nextInt();
        return dato;
    }
    
    public static double calcularFah(double x) {        //metodo que calcula grados Fahreinheit
        double conv;
        conv = (x*9/5+32);
        return conv;
    }
    public static void mostrarResultado(double x,double y){     //Metodo que muestra resultados
        System.out.println(x+ " grados Centigrados es igual a "+y+ " grados Fahrenheit");
    }
}
