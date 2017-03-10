/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author NEKSZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arraydeprueba = new int[] { 2,7,32,4,8,2,45 };
        for(int item : arraydeprueba){
            System.out.print(item + " ");
        }
        System.out.println("");
        BubbleSort bubble = new BubbleSort(arraydeprueba);
        int[] asc = bubble.SortAsc();
        for(int item : asc){
            System.out.print(item + " ");
        }
    }
    
}