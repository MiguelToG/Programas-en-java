
package hilos;

/**
 *
 * @author Miguel
 */
public class main {

    
    public static void main(String[] args) {
        Data t=new Data();
        Thread CPU1=new Thread(t);
        Thread CPU2=new Thread(t);
        CPU1.start();
        CPU2.start();
    }
    
}
