
package menu;


public class Clasemenu {

    public Clasemenu() {
        opciones();
    }
    Integer opcion=0;
    public void setMenu(int opc){
        opcion=opc;//obtener valor para nuestro menu
        switch (opcion){
            case 1:
                System.out.println("caso 1"
                +"\nEste es mi switch");
             break;
            case 2:
                System.out.println("caso 2");
             break;
            case 3:
                System.out.println("salir");
                break;
            default:
                System.out.println("Caso no existe");
             
        }
    }
    public void opciones(){
        System.out.println("1.- opcion numero uno");
        System.out.println("2.- opcion numero dos");
        System.out.println("3.- opcion salir");
    }
    public void setIfanidado(int opc){
        opcion=opc;
        if (opc==1) {
            System.out.println("caso 1");
        } else {
            if (opc==2) {
                System.out.println("Caso 2");
            } else {
                if (opc==3) {
                    System.out.println("Salir");
                    
                } else {
                    System.out.println("Esta opcion no existe");
                }
            }
        }
                
    }
}
