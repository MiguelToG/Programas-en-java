
package herenciac;

import Polimorfismo.*;

/**
 *
 * @author Miguel
 */
public class main {

   
    public static void main(String[] args) {
      
        Hijo juan=new Hijo("Juan");
        juan.caminar(30);
        
        //Polimorfismo
        Animal a=new Animal("animal");
        a.comer();
        Animal gato=new Gato("minino");
        gato.dormir();
        Gato gato1=(Gato)gato;
    }
    
}
