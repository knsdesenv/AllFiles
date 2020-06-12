import java.util.Collections;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Busca {
	public static LinkedList<Long> binaria(LinkedList<Long> arq) {

		long op;

		op = Long.parseLong(
				JOptionPane.showInputDialog(null, "Digite um numero: ", "AVISO", JOptionPane.WARNING_MESSAGE));

		int find = Collections.binarySearch(arq, op);

		JOptionPane.showMessageDialog(null, "Elemento" + " " + op + " " + "foi encontrado na posição: " + find, "AVISO",
				JOptionPane.WARNING_MESSAGE);

		return arq;
	}
}