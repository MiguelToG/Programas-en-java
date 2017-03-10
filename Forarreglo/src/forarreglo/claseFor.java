
package forarreglo;

public class claseFor {

    public claseFor() {
  elfor();
    }
    Integer[] numeros=new Integer[10];
     public void elfor(){
         for(int index=0;index<10;index++){
         numeros[index]= (int)(Math.random()*100+1);
         }
    
}
    public void datos(){
      numeros[0]=4;
      numeros[2]=4;
      numeros[3]=4;
      numeros[4]=4;
      numeros[5]=4;
    }
    public void imprimirarreglo(){
            for(int i=0;i<10;i++){
                System.out.println("numeros["+i+"] = "+numeros[i]);
            
            }
    }
}
