/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author smr1d
 */
public class ServicioPersona {
    
    private static Scanner teclado = new Scanner(System.in);
           
    public static Persona datosPersona() {
        
        Persona persona;
        
        System.out.println("Introduce tu nombre");
        String nombrePersona = teclado.nextLine();
        
        System.out.println("Introduce tu edad");
        int edadPersona = teclado.nextInt();
        
        System.out.println("Introduce tu sexo");
        char sexoPersona = teclado.next().charAt(0);

        System.out.println("Introduce tu peso");
        int pesoPersona = teclado.nextInt();
        
        System.out.println("Introduce tu altura");
        int alturaPersona = teclado.nextInt();
                
        persona = new Persona(nombrePersona, edadPersona, sexoPersona, pesoPersona, alturaPersona);
        
        return persona;
    }
    
}
