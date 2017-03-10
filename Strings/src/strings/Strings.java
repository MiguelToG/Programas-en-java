
package strings;

/**
 *
 * @author Miguel
 */
public class Strings {


    public static void main(String[] args) {
        String s1="Hola"; //objeto que tiene una cadena hola
        String s2=new String(); //clase string, creandola con el constructor
        String s3=new String("hola");
        int tamaño= s1.length();//4
        System.out.println(tamaño);
        char c1=s1.charAt(0);
        System.out.println(c1);
        boolean b1=s1.startsWith("la",2);
        System.out.println(b1);
        int arroba=s1.indexOf("@");// 5
        int com=s1.indexOf(".com");//posicion que lugar
        System.out.println(arroba);
        System.out.println(com);
        String c2="hola";
        boolean b2=s1.equals(c2);
        System.out.println(b2);
        boolean b3=s1.equalsIgnoreCase(c2);
        System.out.println(b3);
                
        
    }
    
}
