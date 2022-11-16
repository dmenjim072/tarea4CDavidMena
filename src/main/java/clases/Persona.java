/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


/**
 *
 * @author david
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String NIF;
    private char sexo;
    private double peso;
    private int altura;
    
    public Persona() {
    
    }

    
    public Persona(String nombre, int edad, String NIF, char sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.NIF = NIF;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public boolean filtrarSexo(char sexo){
        
        boolean sexoFiltrado = true;
        
        if (sexo != 'H' || sexo != 'M' || sexo != 'O'){
            sexoFiltrado = false;
        }
        
        return sexoFiltrado;
    }
    
    public String generaNIF(){
        
        int numeroNIF = 0;
        int numeroAleatorio = 0;
        String letraNIF = "";    
                     
        numeroNIF = numeroAleatorio.random
        
        letraNIF = numeroNIF % 23;
    
    return ;
    }
}