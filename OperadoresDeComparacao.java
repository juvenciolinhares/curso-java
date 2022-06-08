
public class OperadoresDeComparacao {

	public static void main(String[] args) {
		
		/*operador de comparação:
		 *  ==(igual)
		 *  !=(diferente)
		 *  ><, maior, menor que;
		 *  <= >=, maior ou igual, menor ou igual
		 * sempre retorna um valor booleano
		 */
		int x = 6;
		System.out.println(x == 6);
		System.out.println(x == 7);
		System.out.println(x != 6);
		System.out.println(x > 0);
		System.out.println(x < 6);
		System.out.println(x <= 7);
		System.out.println(x >= 7);
		
		//instaceof só é valido para objetos:
		/*int x = 6
		 * system.out.println(x instanceof int); o compilador nao aceita
		 */
		Integer y = 10;
		System.out.println(y instanceof Integer);
		System.out.println("oi" instanceof String);
		
	}

}
