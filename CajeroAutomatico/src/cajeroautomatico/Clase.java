package cajeroautomatico;

import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Miguel
 */
public class Clase extends Txt {

    public Clase() {
        
    }
 Integer ids;
 
    
    public Void NuevaCuenta(String a, String b, String c, String d){
LimpiarArray();
        int num=Integer.parseInt(a); 
        for(Txt n:Cajas){
      if(num==n.getId()){
          JOptionPane.showMessageDialog(null,"Esa cuenta ya existe");
      return null;}
      //n.id=num;
          }
             try{
                 
       BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Archivo,true), "utf-8"));  
          
          Fescribe.write(num+"\t"+b+"\t"+c+"\t"+d+"\r\n");  
          JOptionPane.showMessageDialog(null,"Datos agregados correctamente");          
          Fescribe.close();
             LimpiarArray();}
             
   catch(Exception ex) 
       {  
         
          System.out.println(ex.getMessage());  
         }
              return null;
    }
    ///////////////////////////////////////////////////////Depositar
    public int depositar(String a,String b){
   
    int idq=Integer.parseInt(a);
    Float sald=Float.parseFloat(b);
    Float c;
    int boleano=0;
    for(Txt n:Cajas){
        if(idq==(n.getId())){
               c=n.getSaldo()+sald;
              n.saldo=c;
              System.out.println(n.saldo);
              boleano=1;
          }
    }
    if(boleano==0){
        JOptionPane.showMessageDialog(null, "La cuenta no existe");
        return 0;}
       
           try{
                      BufferedWriter bw = new BufferedWriter(new FileWriter(Archivo));
                      
                      for(Txt n:Cajas){
                          bw.write(n.id+"\t"+n.nombre+"\t"+ n.clave+"\t"+ n.saldo+"\r\n");   
                      System.out.println(n.saldo);
                      }
                      bw.close();
                      LimpiarArray();
                     }catch (Exception ex) 
                    {  
                        
                      System.out.println(ex.getMessage());  
                    }
           
       
       JOptionPane.showMessageDialog(null,"Deposito Exitoso");
       
       
    LimpiarArray();
      
return 0;
    }
    ////////////////////////////////////////////borrar 
    public void borrarCuenta(String a,String b){
       int num=Integer.parseInt(a);
       int bolean=0;
        for(Txt n:Cajas){
            if(num ==n.getId()) {
                if (b.equals(n.getClave())){
                    bolean=1;
                }
            }   
        }
        if(bolean==1){
            try{
                      BufferedWriter bw = new BufferedWriter(new FileWriter(Archivo));
                      for(Txt n:Cajas)
                      {  
                          if(n.getId()!=num){
                           bw.write(n.id+ "\t"+n.nombre+ "\t"+ n.clave+ "\t"+ n.saldo+"\r\n");
                        }else{JOptionPane.showMessageDialog(null,"La cuenta ha sido elimanada");
                                         }
                      }
                      bw.close();
                      LimpiarArray();
                      
                     }catch (Exception ex)  {    
                      System.out.println(ex.getMessage());  
                    }
        }else{
            JOptionPane.showMessageDialog(null,"Datos incorrectos");
        }
    ////////////////////////////////////////////////////////Usuario    
    }
    public int usuario(String a,String b){
        int num=Integer.parseInt(a);
        String contra=b;
       
        if (Cajas.size()==0){detxtAObjeto();}
                       // JOptionPane.showMessageDialog(null, "Los datos son correctos");

        for(Txt n:Cajas){
            if(n.getId()==num){
                
                if(contra.equals(n.getClave())){
                    JOptionPane.showMessageDialog(null, "Los datos son correctos");
                    ids=n.getId();
           UsuarioInterfaz ocho=new UsuarioInterfaz(new javax.swing.JFrame(), true);
                    ocho.setLocationRelativeTo(null);
                    ocho.setTitle("Interfaz de usuario");
                    ocho.setVisible(true);
                    return 0;
                }
                
            }
        }
        JOptionPane.showMessageDialog(null, "Los datos son incorrectos");
                
        return 0;
    }
    public int retirar(String saldo){
        Integer Us=ids;
        Float saldito=Float.parseFloat(saldo);
        for(Txt n:Cajas){
            if(Us==n.getId()){
                
                if(n.saldo>saldito)
                n.saldo=n.saldo-saldito;
                else{
                JOptionPane.showMessageDialog(null, "No cuentas con saldo suficiente");
                return 0;
                }
            }
        }
        try{
                      BufferedWriter bw = new BufferedWriter(new FileWriter(Archivo));
                      
                      for(Txt n:Cajas){
                          bw.write(n.id+"\t"+n.nombre+"\t"+ n.clave+"\t"+ n.saldo+"\r\n");   
                      System.out.println(n.saldo);
                      }
                      bw.close();
                      LimpiarArray();
                     }catch (Exception ex) 
                    {  
                        
                      System.out.println(ex.getMessage());  
                    }
     return 0;       
    }
     public int contraNueva(String ca,String cn){
         Integer idsf=ids;
         String Contraa=ca;
         String Contran=cn;
         for(Txt n:Cajas){
          if(idsf==n.getId()){
              if(Contraa.equals(Contran)){
                  JOptionPane.showMessageDialog(null,"La contraseña nueva no puede ser la misma que tenias");
                return 0;
              }
              if(Contraa.equals(n.getClave())){
                  n.clave=Contran;
              }
              else{
                  JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
                  return 0;
              }
          }                          
         }
         try{
                      BufferedWriter bw = new BufferedWriter(new FileWriter(Archivo));
                      
                      for(Txt n:Cajas){
                          bw.write(n.id+"\t"+n.nombre+"\t"+ n.clave+"\t"+ n.saldo+"\r\n");   
                      System.out.println(n.saldo);
                      }
                      bw.close();
                      LimpiarArray();
                     }catch (Exception ex) 
                    {                          
                      System.out.println(ex.getMessage());  
                    }
         return 0;
     }
     public void actualizarSaldo(String c,String s){
         LimpiarArray();
         Integer Idw=ids;
         for(Txt n:Cajas){
         if(Idw==n.getId()){
            
           
             
         }
         
     }
         
     }
    
}
