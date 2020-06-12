import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import metodosOrdenação.BoubleSort;
import metodosOrdenação.InsertionSort;
import metodosOrdenação.quickSort;

public class Principal {

	public static void main(String[] args) throws IOException, InterruptedException {
		Ler lerArquivo = new Ler();
		LinkedList<Long> arq = new LinkedList<Long>();
		Salvar salvarArq = new Salvar();
		Busca busca = new Busca();
		try {
			int op = 0;
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tipo de método desejado"
					+ "\n 1 - QuickSort " + "\n2 - InsertionSort" + "\n3 - BoubleSort"));
			if (op == 0) {
				JOptionPane.showInputDialog(null, "Digite uma mensagem valida", "AVISO", JOptionPane.WARNING_MESSAGE);
			}
			switch (op) {
			case 1:

				InsertionSort insertionSort = new InsertionSort();
				String caminho = JOptionPane.showInputDialog("Digite o caminho do arquivo");
				arq = lerArquivo.Ler(caminho);
				if (arq.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Erro ao ler arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
				salvarArq.salvar(insertionSort.insertionSort(arq));
				break;

			case 2:
				quickSort quickSort = new quickSort();
				String caminho2 = JOptionPane.showInputDialog("Digite o caminho do arquivo");
				arq = lerArquivo.Ler(caminho2);
				long size = arq.size();
				if (arq.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Erro ao ler arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
				salvarArq.salvar(quickSort.quickSort(arq, 0, size - 1));
				break;

			case 3:

				String caminho3 = JOptionPane.showInputDialog("Digite o caminho do arquivo");

				arq = lerArquivo.Ler(caminho3);

				if (arq.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Erro ao ler arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
				BoubleSort boubleSort = new BoubleSort();
				salvarArq.salvar(boubleSort.boubbleSort(arq));
				break;

			default:
				JOptionPane.showMessageDialog(null, "Entrada Invalida!", "AVISO", JOptionPane.WARNING_MESSAGE);
				System.exit(0);
				break;

			}
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tipo de busca:\n(1)Binaria"));

			switch (op) {
			case 1:

				Busca.binaria(arq);
				JOptionPane.showMessageDialog(null, "Acabou", "AVISO", JOptionPane.WARNING_MESSAGE);

				break;
			default:
				break;

			}

		} catch (NumberFormatException e) {
			System.exit(0);
		}
	}
}