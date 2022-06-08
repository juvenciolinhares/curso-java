/*
 * Cálculo do IMC
 * IMC = peso(kg)/ altura(metros) *
 */
import javax.swing.JOptionPane;

public class Imc {
	public static void main (String [] args) {

		String peso =JOptionPane.showInputDialog("Qual seu peso em quilogramas?");
		String altura = JOptionPane.showInputDialog("Qual sua altura?");

		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);

		String msg =(imc >=20 && imc <=25) ? "Peso ideal": "Fora do peso ideal";
		msg = "IMC= " + imc + "\n" + msg;

		JOptionPane.showMessageDialog(null, msg);

	}

}
