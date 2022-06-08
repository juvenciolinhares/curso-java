
public class WrapperClasses {
	public static void main (String [] args) {

		/*classes wrappers
		 * representam tipos primitivos em objetos(tipos referencia)
		 * para cada tipo primitivo temos uma classe Wrapper
		 * todas tem o mesmo nome do tipo primitivo,
		 * porém começando com letra maiuscula.
		 * exceções: 
		 * int => integer;
		 * char => Character;
		 */
		//sintaxe: 

		Double preco = new Double("12.45");
		//The constructor Double(String) has been deprecated since version 9 and marked for removal
		
		//conversoes de valores:
		int i = preco.intValue();
		byte b = preco.byteValue();
		
		
		//outra forma:
		Double preco1 = Double.valueOf("12.45");
		
		Boolean casado = Boolean.valueOf("yes");
		
		//conversão estática:
		double d1 = Double.parseDouble("123.45");
		int ii = Integer.parseInt("123");
		float f = Float.parseFloat("3.14F");
		
		//converter valor binário:
		int i2 = Integer.parseInt("101011", 2);//2 depois da virgula por que 2 é tipo de valor binario.
		System.out.println(i2);
		
		System.out.println(preco);
		System.out.println(casado);
		System.out.println(d1);
		System.out.println(ii);
		System.out.println(f);
		
	}

}
