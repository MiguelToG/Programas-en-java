/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdouble;

/**
 *
 * @author Miguel
 */
public class Double {

    public static void main(String[] args) {  
        int angulo = 30;
        double b = Math.toRadians(angulo);
        double seno30=Math.sin(b);
        double x=254999.99999999997;
        System.out.println("El seno de 30 sin fijar es " +seno30);
        System.out.println("El seno de 30 fijado es " +fijarNumero(seno30, 1));     
        System.out.println("Inicial 0.034999999999999996 fijado es " +fijarNumero(0.034999999999999996, 3));
        System.out.println("Inicial 254999.99999999997 fijado es " +fijarNumero(x, 0));
        System.out.println("Inicial 0.333333333333333 fijado es " +fijarNumero(0.333333333333333, 3));
        System.out.println("Inicial 0.123456789123459999999 fijado es " +fijarNumero(0.123456789123459999999, 14));
        System.out.println("Inicial 1.78098098 "+fijarNumero(1.78098098,1));
        double r=fijarNumero(1.778787,1);
        System.out.println(r);
    } 
    
    public static double fijarNumero(double numero, int digitos) {
        double resultado;
        resultado = numero * Math.pow(10, digitos);
        resultado = Math.round(resultado);
        resultado = resultado/Math.pow(10, digitos);
        return resultado;
    }
}

