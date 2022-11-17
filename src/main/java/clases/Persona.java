/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author david
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String NIF;
    private char sexo;
    private double peso; //KG
    private int altura; //cm
    
    public Persona() {
    
    }

    
    public Persona(String nombre, int edad, char sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;        
        this.sexo='O';
        if (filtrarSexo(sexo)){
            this.sexo = sexo;
        }
        this.peso = peso;
        this.altura = altura;
        this.NIF = generaNIF();
    }
    
    private boolean filtrarSexo(char sexo){
        
        return (sexo == 'H' || sexo == 'M' || sexo == 'O');
    }
    
    private static String generaNIF(){
               
        String nif = "";        
        int letraNIF = 0;    
        String letra = "";
        
        Random numAleatorio = new Random();
        int numeroRandom = numAleatorio.nextInt(1, 99999999);
                
        letraNIF = numeroRandom % 23;
        
        switch (letraNIF){
            case 0:
                letra = "T";
                break;
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;    
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            case 22:
                letra = "E";
                break;            
        }
               
        numeroRandom = Integer.valueOf(numeroRandom);
        
        nif = numeroRandom + letra;
        
        return nif;
        }
    
    public boolean esMayorEdad(){
        return this.edad>=18;
    }
    
    public float calcularIMC(){
        return (float)(peso/Math.pow(this.altura, 2));
    }
    
    public void darLike(Serie serie){
        serie.darLike();
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
}