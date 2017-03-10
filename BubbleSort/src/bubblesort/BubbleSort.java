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
public class BubbleSort {
    
    private int[] _array;

    public int[] getArray() {
        return _array;
    }

    public void setArray(int[] _array) {
        this._array = _array;
    }
    
    public BubbleSort(int[] array)
    {
        _array = array;
    }
    
    public int[] SortAsc(){
        // [3,1,1,2,7]
        // [3,1,2,7,9]
        // [1,2,3,7,9]
        int[] array = getArray();
        int size = array.length;
        int temporal = 0;
        
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - 1; j++) {
                // 3 > 1
                if(array[j - 1] >  array[j]){
                    // temporal = 0
                    temporal = array[j -1];
                    // temporal = 3
                    // array[j] = 1
                    array[j-1] = array[j];
                    // array[j-1] = 1
                    // temporal = 3
                    array[j] = temporal;
                    // array[j] = 3
                    // temporal = 3
                }
            }
        }
        
        return array;
    }
}
