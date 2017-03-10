
package trycatch1;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Clase {

    public Clase() {
    }
     public void cargarImg(){
        try{
            Icon icon=new ImageIcon(getClass().getResource("/Imágenes/Sin título.png"));
            Formulario.iconos.setIcon(icon);
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null,"error "+error) ;
        }
    }
}
