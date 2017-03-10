
package herenciac;

/**
 *
 * @author Miguel
 */
public class Hijo extends Padre {

    public Hijo(String nombre) {
        super(nombre);
    }

    @Override
    public void caminar() {
        super.caminar(); 
        
    }
    public void comer(String c1){
        System.out.println("El hijo come "+c1);
    }
    public void caminar(Integer d1){
        System.out.println("El hijo camina "+d1+ "metros");
    }
    
    
    
}
