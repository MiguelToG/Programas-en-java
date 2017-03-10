
package miventana;
import javax.swing.JOptionPane;
public class Data {

    public Data() {
    }
   
    
    Integer[] edad=new Integer[15];
    String[] name=new String[15];
    Integer posicion=0;
    public void capturadatos(){
        if (posicion<15) {
               name[posicion]=Ventana.nombre.getText();
    edad[posicion]=Integer.parseInt( Ventana.edad.getText());
    posicion++;
    String pos=String.valueOf(posicion);
    Ventana.contador.setText(pos);
        } else {
            JOptionPane.showMessageDialog(null,"Error ya no se pueden guardar mas registros","Error",JOptionPane.PLAIN_MESSAGE);
        }
 
//Capturar en edad el valor del textfield y lo convertira a entero
    //Tipodedato.parsetipodedato(Tipo de dato a convertir);
    
    }
    public void imprimirdatos(){
        for(int i =0;i<posicion;i++){
        JOptionPane.showMessageDialog(null,"El nombre capturado es ="+name[i]+"\nLa edad de esta persona es="
                +edad[i],"mensaje",JOptionPane.PLAIN_MESSAGE);}
    }
}
