package de.myplantparadise.mpp.Utils;

import java.io.Serializable;

/**
 *
 * @author Pascal
 */
public class ArrayUtil implements Serializable {

    public String[][] remove(String[][] array, int index){
        String[][] x;
        x = new String[array.length-1][5];
        for(int i=0; i<array.length; i++){
            if(i<index) x[i] = array[i];
            if(i>index) x[i-1] = array[i];
        }
        return x;
    }
}
