import javax.swing.JOptionPane;

public class EntradaGraficaDeDados {

	public static void main(String[] args) {
		
		//receber e imprimir informações pro usuário por meio de uma entrada grafica:
		
		String nome = JOptionPane.showInputDialog("qual seu nome?");
		JOptionPane.showMessageDialog(null, nome);

	}

}
