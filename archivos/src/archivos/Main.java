
package archivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Miguel
 */
public class Main {

    
    public static void main(String[] args) {
        File archivo;
        try{
        archivo=new File("c:\\prueba\\archivo.txt");
        if(archivo.createNewFile()){
            System.out.println("Se ha creado el archivo");
        }
        }
        catch(IOException e){
            System.err.println("No se ha podido crear el archivo"+e);
        }
    }
    
    
    
}
