
	import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.swing.JOptionPane;

	public class Salvar {

		public static boolean salvar(LinkedList<Long> arq) throws IOException {

			String nomeTxt;
			
			nomeTxt = JOptionPane.showInputDialog(
					null, "Digite o nome do novo arquivo: ", "AVISO", JOptionPane.WARNING_MESSAGE) + ".txt";
		
			try (PrintWriter arquivo = new PrintWriter(new BufferedWriter(new FileWriter(nomeTxt)))) {
				
				for (int i = 0; i < arq.size(); i++) {
				
					arquivo.println(arq.get(i));
				}
			} catch (IOException e) {
				JOptionPane.showMessageDialog(
						null, "Erro", "AVISO", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			}
			return false;
		}
	

	public Salvar() {
		// TODO Auto-generated constructor stub
	}

}
