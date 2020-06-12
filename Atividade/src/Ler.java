import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Ler {

	public LinkedList<Long> Ler(String caminho) {
			LinkedList<Long> numeros = new LinkedList<>();
			
			try {
				BufferedReader arquivo = new BufferedReader(new FileReader(caminho));
				String	linha = arquivo.readLine();
			
				try {				
					while (arquivo.ready()) {
					linha = arquivo.readLine();
				

					    System.out.println(linha);					
					    numeros.add(Long.parseLong(linha));	
					      
					}		 
					arquivo.close();
					return numeros;

				} catch (IOException ex) {
					JOptionPane.showMessageDialog(
							null, "Erro: não foi possivel ler o arquivo!", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
			} catch (FileNotFoundException ex) {
				JOptionPane.showMessageDialog(
						null, "Erro: Arquivo não encontrado!", "ERRO", JOptionPane.ERROR_MESSAGE);

			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		// TODO Auto-generated constructor stub
	}



