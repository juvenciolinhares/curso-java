import javax.swing.JOptionPane;

public class EntradaGraficaDeDados {

	public static void main(String[] args) {
		
		//receber e imprimir informa��es pro usu�rio por meio de uma entrada grafica:
		
		String nome = JOptionPane.showInputDialog("qual seu nome?");
		JOptionPane.showMessageDialog(null, nome);

	}

}
