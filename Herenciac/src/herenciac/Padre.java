
package herenciac;

/**
 *
 * @author Miguel
 */
public class Padre {

    public Padre(String nombre) {
        this.nombre= nombre;
    }
    private String nombre;
    String apellido;
    public void caminar(){
        System.out.println("Padre camina");
        
    }
    protected void comer(){
        
        System.out.println("Padre come");
    }
    private void trabajar(){
        System.out.println("Padre trabaja");
        
    }
    public String getNombre(){
        return this.nombre;
        
    }
}
