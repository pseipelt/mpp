package Utils;

/**
 *
 * @author Pascal
 */
public class ArrayUtil {

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
