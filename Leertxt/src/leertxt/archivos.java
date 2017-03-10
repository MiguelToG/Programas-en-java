
package leertxt;

import java.io.*;

/**
 *
 * @author Miguel
 */
public class archivos {
    public String leerTxt(String direccion){
        String texto="";
        try{
            BufferedReader bf=new BufferedReader(new FileReader(direccion));
            String temp="";
            String bfread;
            while((bfread= bf.readLine())!=null){//Haz el ciclo mientras bf tiene datos
                temp= temp + bfread; //guardado el texto del archivo
                
            }
            texto=temp;
        }
        
        catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        return texto;
        
    }
    
    
}
