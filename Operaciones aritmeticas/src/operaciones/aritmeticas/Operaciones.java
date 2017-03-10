
package operaciones.aritmeticas;


public class Operaciones {
     int dato1=0 ,dato2=0, resultado=0;
     
    
     public void setSuma(int a,int b){
         this.dato1=a;
         this.dato2=b;
         //el dato 2 tiene el valor del entero b
         this.resultado=dato1+dato2;
     }
     public void setResta(int a,int b){
         this.dato1=a;
         this.dato2=b;
         //el dato 2 tiene el valor del entero b
         this.resultado=dato1-dato2;
     }
     public void setMultiplicacion(int a,int b){
         this.dato1=a;
         this.dato2=b;
         //el dato 2 tiene el valor del entero b
         this.resultado=dato1*dato2;
     }
     public void setDivision(int a,int b){
         this.dato1=a;
         this.dato2=b;
         //el dato 2 tiene el valor del entero b
         this.resultado=dato1/dato2;
     }
     public void setModulo(int a,int b){
         this.dato1=a;
         this.dato2=b;
         //el dato 2 tiene el valor del entero b
         this.resultado=dato1%dato2;
     }
     public void imprimiresultado(){
         System.out.println("El resultado es ="+resultado);
     }
}
