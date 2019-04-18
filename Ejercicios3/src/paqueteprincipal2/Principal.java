/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal2;
// import paquetedatos.*;
import paquetedatos.Variable;
import paquetedatos.VariableDos;
/**
 *
 * @author alexa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // metodo principal
        
        double resultado = Variable.numero1 + Variable.numero2;
        double resultado2 = VariableDos.numero3 + Variable.numero1;
        
        System.out.printf ("El resultado es: %.1f\n", resultado);
        System.out.printf ("El resultados dos es: %.1f\n", resultado2);
    }
    
}
