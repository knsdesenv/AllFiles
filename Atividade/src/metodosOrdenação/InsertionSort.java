package metodosOrdenação;

import java.io.IOException;
import java.util.LinkedList;

public class InsertionSort {

	public static LinkedList<Long> insertionSort(LinkedList<Long> array) throws IOException 
    { 
        int n = array.size(); 
        for (int i = 1; i < n; ++i) { 
            long key = array.get(i); 
            int j = i - 1; 
  
            while (j >= 0 && array.get(j) > key) { 
                array.add(j -1, array.get(j) );  
                j = j - 1; 
            } 
            array.add(j +1, key);
        } 
        return array;
}   
}
