
public class OperadoresJava {

	public static void main(String[] args) {
		/*operador bin�rio: trabalha com dois operandos: 2 + 3.
		 * operador un�rio: trabalha com um operando: -2.
		 * Operado tern�rio: true ? "sim" : "nao";
		 */

		int x = 9 + 4;

		String y = "9" + "4"; 

		/*precedencia: * e / vem antes de + e -
		 * essa regra s� � quebrada com os ();
		 */
		double a = 7 - 4 + 3 * 2;

		double b = (7 - 4 + 3) * 2;

		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);

	}

}
