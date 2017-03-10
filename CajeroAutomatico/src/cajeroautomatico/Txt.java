
package cajeroautomatico;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Txt {

    public Txt() {
        comprobarBd();
        detxtAObjeto();
    }
    public Txt(int id,String nombre,String clave,Float saldo){
        this.id=id;
        this.nombre=nombre;
        this.clave=clave;
        this.saldo=saldo;
    }
    int id;
    String nombre;
    String clave;
    Float saldo;
    File Archivo=new File ("C:\\Prueba\\archivo.txt");
    ArrayList<Txt> Cajas=new ArrayList<Txt>();
    
    //************************************Obtener variables
    public String getNombre(){
        return this.nombre;
    }
    public int getId(){
        return this.id;
    }    
    public String getClave(){
        return this.clave;
    }
    public Float getSaldo(){
        return this.saldo;
    }
    //*************************************Set variables
    public String setNombre(String n){
        return nombre=n;
    }
    public int setId(int n){
        return id=n;
    }
    public String setClave(String n){
        return clave=n;
    }
    public Float setSaldo(Float n){
        return saldo=n;
    }
   //*************************************Metodos  
   public void comprobarBd(){
       try{
           if(!Archivo.exists()){
               Archivo.createNewFile();
               System.out.println("Base de datos de productos creada se insertara el producto");
           }
           else{
               System.out.println("La base de datos de productos existe");
           }
       }
      catch (Exception ex) 
       {  
          //Captura un posible error le imprime en pantalla   
          System.out.println(ex.getMessage());  
       }
   }
   public void LimpiarArray(){
       Cajas.clear();
       detxtAObjeto();
   }
   public void detxtAObjeto(){
       try {String Linea=null;
        BufferedReader leerFichero = new BufferedReader (new FileReader(Archivo));
        while ((Linea=leerFichero.readLine())!=null){
           StringTokenizer mistokens = new StringTokenizer(Linea, "\t");
           String           id =  mistokens.nextToken().trim();
           String       nombre =  mistokens.nextToken().trim();
           String       clave  =  mistokens.nextToken().trim();
           String       saldo  =  mistokens.nextToken().trim();
           
           int Obtid    =Integer.parseInt(id);
           Float ObSaldo=Float.parseFloat(saldo);
           
           Txt objeto=new Txt(Obtid,nombre,clave,ObSaldo);
           Cajas.add(objeto);
       }
           leerFichero.close();
       } catch (Exception e) {
       }
   }
   public void mostrarDatos(){
   LimpiarArray();
     //  if (Cajas.size()==0){detxtAObjeto();}
       for(Txt n:Cajas){
           JOptionPane.showMessageDialog(null,""+n.getId()+" "+n.getNombre()+" "+n.getClave()+" "+n.getSaldo());
       }
   }       
}
