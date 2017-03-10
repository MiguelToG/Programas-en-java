
package arraylist;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class arrayClase {

    public arrayClase() {
        //constructor
    }
    ArrayList<Integer> enteros=new ArrayList();
    public void agregarDatos(int a){
        enteros.add(a);
        
    }
    public void mostrarArreglo(){
        for (int i = 0; i < enteros.size(); i++) {
            JOptionPane.showMessageDialog(null, "Numero de posicion "+i+"es ="+enteros.get(i) );
        }
        
    }
}
