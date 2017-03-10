
package tablasmult;


public class tablas {
    Integer numero=0;
    Integer multiplo=0;
    Integer resultado=0;
    Integer contador=1;

    public tablas() {
    }
    public void setTablamultiplicar(int numer){
    this.numero=numer;
        System.out.println(numero+"*"+1+"="+(resultado=numero*1));
        System.out.println(numero+"*"+2+"="+(resultado=numero*2));
        System.out.println(numero+"*"+3+"="+(resultado=numero*3));
        System.out.println(numero+"*"+4+"="+(resultado=numero*4));
        System.out.println(numero+"*"+5+"="+(resultado=numero*5));
        System.out.println(numero+"*"+6+"="+(resultado=numero*6));
        System.out.println(numero+"*"+7+"="+(resultado=numero*7));
        System.out.println(numero+"*"+8+"="+(resultado=numero*8));
        System.out.println(numero+"*"+9+"="+(resultado=numero*9));
        System.out.println(numero+"*"+10+"="+(resultado=numero*10));
    }
    public void setTablaciclo(int numer){
        this.numero=numer;
        do{
            System.out.println(numero+"*"+contador+"="+(resultado=numero*contador));
            this.contador++;
        }
        while(contador<=10);    
    
    }
}
