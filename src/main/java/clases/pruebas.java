/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author david
 */
public class pruebas {
    
    public static void main(String[] args) {
        
        Persona juan = new Persona();
        System.out.println(juan);
        Persona maria = new Persona("Maria", 23, 'M', 60.3, 166);
        
        Serie s1 = new Serie();
        System.out.println(s1);
        maria.darLike(s1);
        System.out.println(s1);
        
        System.out.println(maria);
        juan.setEdad(15);
        System.out.println("IMC maria");
    }
}
