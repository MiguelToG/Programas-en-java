
package mediax;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class claseMedia {

    public claseMedia() {
    }
    ArrayList<Double> datos=new ArrayList();
    public void agregarDatos (double data){
        datos.add(data);
        
    }
    public void borrarMemoria(){
        datos.clear();
    }
    public void calcularMedia(){
        double suma=0.0;
        for (int i = 0; i < datos.size(); i++) {
            suma=suma+datos.get(i); 
        }
        double media=0.0;
        media=suma/datos.size();
        JOptionPane.showMessageDialog(null,"El valor de la media es="+media);
    }
}
