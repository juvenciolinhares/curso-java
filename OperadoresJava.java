
public class OperadoresJava {

	public static void main(String[] args) {
		/*operador binário: trabalha com dois operandos: 2 + 3.
		 * operador unário: trabalha com um operando: -2.
		 * Operado ternário: true ? "sim" : "nao";
		 */

		int x = 9 + 4;

		String y = "9" + "4"; 

		/*precedencia: * e / vem antes de + e -
		 * essa regra só é quebrada com os ();
		 */
		double a = 7 - 4 + 3 * 2;

		double b = (7 - 4 + 3) * 2;

		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);

	}

}
