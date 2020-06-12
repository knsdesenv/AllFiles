package metodosOrdenação;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class BoubleSort {
	public static LinkedList<Long> boubbleSort(LinkedList<Long> array) throws IOException {
		long tempoInicial = 0;
		long tempoFinal = 0;
		
		tempoInicial = System.currentTimeMillis();
	
		for (int i = 0; i < array.size() - 1; i++) {
			for (int j = 1; j < array.size() - i; j++) {
				if (array.get(j - 1) > array.get(j)) {
					Collections.swap(array, j - 1, j);			
				}
			}
			tempoFinal = System.currentTimeMillis();
		}	
		JOptionPane.showMessageDialog(
				null, "Executado em = " + (tempoFinal - tempoInicial) + " ms", "AVISO", JOptionPane.WARNING_MESSAGE);
		return array;
	}

}
