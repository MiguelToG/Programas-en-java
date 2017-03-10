/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author Miguel
 */
public class Animal {
    
    private String nombre;
    public Animal(String nombre){
    this.nombre=nombre;    
    }
    public void comer(){
        System.out.println("El"+nombre+"come");
    }
    public void dormir(){
        System.out.println("El"+nombre+"duerme");
    }
    public void ruido(){
        System.out.println("El"+nombre+"ruido ");
    } 
    public String getnombre(){
        return nombre;
    }
    
}
