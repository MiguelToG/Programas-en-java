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
public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }
    @Override
    public void comer(){
        
        System.out.println("El"+super.getnombre()+"comen arañas");
    }
    @Override
    public void ruido(){
        
        System.out.println("El"+super.getnombre()+"ronronea");
    }
}
