
package estructuraif;

public class Claseif {
    public Claseif(){
        
    }
    Integer num1=0, num2=0;
    public void setIgual(int x, int y){
    this.num1=x;
    this.num2=y;
    if(num1==num2){
        System.out.println("Los numeros son iguales");
    }
    else{System.out.println("Los numeros son diferentes");
    }
    }
    
    public void setMayor(int x, int y){
    this.num1=x;
    this.num2=y;
    if(num1>num2){
        System.out.println("El numero es mayor");
    }
    else{System.out.println("El numero es menor");
    }
    }
    public void setMenor(int x, int y){
    this.num1=x;
    this.num2=y;
    if(num1<num2){
        System.out.println("El numero es menor");
    }
    else{System.out.println("El numero es mayor");
    }
    }
}
