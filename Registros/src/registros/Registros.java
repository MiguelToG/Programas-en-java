
package registros;

import java.io.*;
import java.util.*;

/**
 *
 * @author Miguel
 */

public class Registros {

//zona de variables
       int id;
       String descripcion;
       double precio;
       int cantidad;
      File FicheroProducto = new File("C:\\Users\\Miguel\\Downloads\\insertar-modificar-eliminarEnJava\\insertar-modificar-eliminarEnJava\\productos.txt");
  ArrayList<Registros>  cositas=new ArrayList<Registros>(); 
    
    /**
     * @param args the command line arguments
     */
  //Main
    public static void main(String[] args) {
      Registros c=new Registros();
      c.comprobarBd();
      c.InsertarProductos(3,"sandia",1.56,60000);
      c.MostrarObjetos();
      c.modificarFichero();
    }
    
   public Registros(int id,String descripcion,double precio,int cantidad)
    {
         this.id=id;
         this.descripcion=descripcion;
         this.precio=precio; 
         this.cantidad=cantidad; 
    }
   
   public Registros(){}
   //obtener el valor de las variables *****************************************************
   public  int getId()
   {
      return this.id;
       
    }
   public  String getDescripcion()
   {
      return this.descripcion;
       
    }
   public  double getPrecio()
   {
      return this.precio;
       
    }
   public  int getCantidad()
   {
      return this.cantidad;
       
    }
    
   
    //Modificar variables
    public  int setId(int n)
   {
      return id=n;
       
    }
   public  String setDescripcion(String n)
   {
      return descripcion=n;
       
    }
   public  double setPrecio(double n)
   {
      return precio=n;
       
    }
   public  int setCantidad(int n )
   {
      return cantidad=n ;
       
    }
    
   //Zona de metodos importantes ***********************************************************
   public void comprobarBd(){
        try
      {
        //Varialble con la ruta donde esta el archivo de la bd de los productos  
        //File FicheroProducto= new File("./Bd/productos.txt");
        //crear el fichero de base de datos de productos   
        if(!FicheroProducto.exists())
        {
            FicheroProducto.createNewFile();
            System.out.println("Base de datos de productos creada se insertara el producto");
        }else{System.out.println("La base de datos de productos existe");}
       }catch (Exception ex) 
       {  
          //Captura un posible error le imprime en pantalla   
          System.out.println(ex.getMessage());  
       }
     }
   public void InsertarProductos(int id,String descripcion,double precio,int cantidad)
      {
         try
      {  
         this.id=id;
         this.descripcion=descripcion;
         this.precio=precio; 
         this.cantidad=cantidad; 
           
        /* 
         * Abro el flujo de escritura, sobre el fichero con codificacion utf8
         * con la clase BufferedWriter
         */  
          BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FicheroProducto,true), "utf-8"));  
          /*Escribe en el fichero la cadena que recibe la función.  
           *el string "\r\n" significa salto de linea  y el \t significa tabulacion  */  
          Fescribe.write(getId()+"\t"+getDescripcion()+"\t"+getPrecio()+"\t"+getCantidad()+"\r\n");  
           System.out.println("El producto a sido insertado en la base de datos");           //Cierra el flujo de escritura  
          Fescribe.close();
          
        }
        catch (Exception ex) 
       {  
          //Captura un posible error le imprime en pantalla   
          System.out.println(ex.getMessage());  
       }
      } 
   public void DetxtAObjeto()
     {
        try
        {
         String linea = null;
         BufferedReader leerFichero = new BufferedReader (new FileReader(FicheroProducto));    
         while( (linea = leerFichero.readLine()) != null)
         {
            //este bucle es para meter todos los datos leidos de archivo de texto separlo en atributos y convertirlos a objeto para poder trabajar con el 
            //en esta parte le digo que lo separe en tokens pero ojo estos tokens son solo Strings tengo que convertirlos para poder emterlos en el objeto y trabajar con ellos
            StringTokenizer mistokens = new StringTokenizer(linea, "\t");
            String           id =  mistokens.nextToken().trim();
            String  descripcion =  mistokens.nextToken().trim();
            String       precio =  mistokens.nextToken().trim();
            String     cantidad =  mistokens.nextToken().trim();
           
            //transformo los tipo de String a los tipos que hace falta int double 
            int    idOperar=Integer.parseInt(id);
            double preciOperar=Double.parseDouble(precio);
            int    cantidadOperar=Integer.parseInt(cantidad);
            
            
            //lo paso al constructor para que me cree los objetos
            Registros objeto= new Registros(idOperar,descripcion,preciOperar,cantidadOperar);
            //lo añado al vecto para poder jugetear con el 
            cositas.add(objeto);
            
            }
         leerFichero.close();
       
       }catch (Exception ex) 
       {  
          //Captura un posible error le imprime en pantalla   
          System.out.println(ex.getMessage());  
       }
      }     
   public void ActualizarArraList()
   {
      //Este es el ArrayList declarado arriba 
      cositas.clear();
      DetxtAObjeto(); 
   }
      public void MostrarObjetos()
      {
     if( cositas.size()==0){DetxtAObjeto();}
     System.out.println("=========================== Articulo=========================================================================================================================================================================================");     
     for(Registros n:cositas)
     {
      System.out.println("El id es:"+n.getId()+"\t"+"La descripcion es:"+n.getDescripcion()+"\t"+"El precio es:"+n.getPrecio()+"\t"+ "La cantidad es:"+ n.getCantidad());
     }  
     System.out.println("============================FIN==============================================================================================================================================================================================");
   }
      
   public void modificarFichero()
  {
    try{
        //lo primero es Buscar el dato si no como lo vas a modificar
        //lo segundo es mostrarlo por logica si no sabes lo que tienes como vas a modificarlo 
        //lo tercero es modificarlo para esto tienes que saber que dentro de este objeto tu quieres modificar un campo ahora hay que desplegar un switch case para saber que valor vas a modificar 
        //cuarto ya tienes el ArrayList, modficicalo,   
       if( cositas.size()==0){DetxtAObjeto();}
          //PASO 1 Y 2 FUNCION DE BUSQUEDA Y MOSTRADO 
        Scanner en =new Scanner(System.in).useDelimiter("\n");
             //PASO 3 CREAR UN SWIRH CASE CON LAS OPCIONES A MODIFICAR
             //creo una variable para escanear lo que entra por teclado para asi poder modificar mas facilmente
             
        int opc=10;
             
        while(opc!=7)
             {
               menu();
               opc=en.nextInt();
               switch(opc)
               {
                    case 1: System.out.println("Introducir el id del producto y la nueva id");
                            
                    //n.getId()==idNumero
                    
                   // String      cadena=en.next(); 
                   int    idNumero=en.nextInt(); 
                   int    numero=en.nextInt();        
                    for(Registros n:cositas)
                    {
                       
                      if(n.getId()==idNumero){
                          
                        n.id =numero;     
                        System.out.println("=========================== Articulo=========================================================================================================================================================================================");
                        System.out.println("El id es:"+n.getId()+"\t"+"La descripcion es:"+n.getDescripcion()+"\t"+"El precio es:"+n.getPrecio()+"\t"+ "La cantaidad es:"+ n.getCantidad());
                        System.out.println("============================FIN==============================================================================================================================================================================================");
                        break;
                      }else{
                          System.out.println("el producto no ha sido encontrado");
                                         }  
                    }
                    break;
                    
                    
                    
                    
                    case 2: System.out.println("Inserte la descripcion del producto y la  nueva descripcion del mismo");
                    String  cadena=en.next();        
                    String cadenaNueva=en.next();        
                    for(Registros n:cositas)
                    {
                       
                      if(n.getDescripcion().equals(cadena)){
                          
                        n.descripcion=cadenaNueva;     
                        System.out.println("=========================== Articulo=========================================================================================================================================================================================");
                        System.out.println("El id es:"+n.getId()+"\t"+"La descripcion es:"+n.getDescripcion()+"\t"+"El precio es:"+n.getPrecio()+"\t"+ "La cantaidad es:"+ n.getCantidad());
                        System.out.println("============================FIN==============================================================================================================================================================================================");
                        break;
                      }else{
                          System.out.println("el producto no ha sido encontrado");
                       }  
                    }
                    
                    
                    
                    
                    
                    break;
                    case 3: System.out.println("Inserte la descripcion del producto y el precio nuevo");
                    
                           cadena=en.next();        
                    double precioNuevo=en.nextDouble();        
                    for(Registros n:cositas)
                    {
                       
                      if(n.getDescripcion().equals(cadena)){
                          
                        n.precio=precioNuevo;     
                        System.out.println("=========================== Articulo=========================================================================================================================================================================================");
                        System.out.println("El id es:"+n.getId()+"\t"+"La descripcion es:"+n.getDescripcion()+"\t"+"El precio es:"+n.getPrecio()+"\t"+ "La cantaidad es:"+ n.getCantidad());
                        System.out.println("============================FIN==============================================================================================================================================================================================");
                        break;
                      }else{
                          System.out.println("el producto no ha sido encontrado");
                      }  
                    }
                    break;
                    
                    case 4: System.out.println("Inserte la descripcion y la cantidad nueva ");
                   
                           cadena=en.next();        
                          numero=en.nextInt();        
                    for(Registros n:cositas)
                    {
                       
                      if(n.getDescripcion().equals(cadena)){
                          
                        n.cantidad =numero;     
                        System.out.println("=========================== Articulo=========================================================================================================================================================================================");
                        System.out.println("El id es:"+n.getId()+"\t"+"La descripcion es:"+n.getDescripcion()+"\t"+"El precio es:"+n.getPrecio()+"\t"+ "La cantaidad es:"+ n.getCantidad());
                        System.out.println("============================FIN==============================================================================================================================================================================================");
                        break;
                      }else{
                          System.out.println("el producto no ha sido encontrado");
                      }  
                    }
                    
                    
                    
                    
                    
                    break;
                    case 5: System.out.println("Guardar");
                    try{
                      BufferedWriter bw = new BufferedWriter(new FileWriter(FicheroProducto));
                      for(Registros n:cositas)
                      {
                          bw.write(n.id+"\t"+n.descripcion+"\t"+ n.precio+"\t"+ n.cantidad+"\r\n");   
                      }
                      bw.close();
                     }catch (Exception ex) 
                    {  
                      //Captura un posible error le imprime en pantalla   
                      System.out.println(ex.getMessage());  
                    }
                    
                    break;  
                    
                    
                    case 6: System.out.println("inserte el ID del producto que va borrar de la bd");
                            int v=en.nextInt();
                            
                    try{
                      BufferedWriter bw = new BufferedWriter(new FileWriter(FicheroProducto));
                      for(Registros n:cositas)
                      {  
                          if(n.getId()!=v){
                           bw.write(n.id+ "\t"+n.descripcion+ "\t"+ n.precio+ "\t"+ n.cantidad+"\r\n");
                        }else{
                          System.out.println("el producto ha sido eliminado");
                                         }
                      }
                      bw.close();
                      cositas.clear();
                      DetxtAObjeto();
                      
                     }catch (Exception ex) 
                    {  
                      //Captura un posible error le imprime en pantalla   
                      System.out.println(ex.getMessage());  
                    }
                    
                    break;  
                }
            } 
        } catch (Exception ex) 
       {  
          //Captura un posible error le imprime en pantalla   
          System.out.println(ex.getMessage());  
       }     
     }  
  
  private void menu()
   {
     System.out.println("--------Menu de modificaciones de productos -------");
     System.out.println("1. Modificar id");
     System.out.println("2. Modificar descripcion ");
     System.out.println("3. Modificar precio");
     System.out.println("4. Modificar cantidad");
     System.out.println("5. Guardar");
     System.out.println("6. Dar de bajar un proudcto existente");
     System.out.println("7. Salir");
   }
}