package metodosOrdenação;

import java.io.IOException;
import java.util.LinkedList;

public class quickSort {
	

	  public static LinkedList<Long> quickSort(LinkedList<Long> array, long l, long high) throws IOException 
  { 
		  long pivot = array.get((int) high);  
	      int i = (int) (l-1); 
	      for (int j=(int) l; j<high; j++) 
	      { 
	          if (array.get(j) <= pivot) 
	          { 
	              i++; 

	               
	              long temp = array.get(i); 
	              array.add(i, array.get(j));
	              array.add(j, temp);
	          } 
	      } 

	      long temp = array.get(i + 1); 
	      array.add(i+1,array.get((int) high));  
	      array.add((int) high, temp);
      if (l < high) 
      { 
          long pi = i+1;

          quickSort(array, l, pi-1); 
          quickSort(array,  (pi+1), high); 
      }
	return array; 
  }
}
