
public class OperadoresMatematicos {

	public static void main(String[] args) {
		
		//o operador mais soma, mas também números, mas também concatena strings:
		double a = 7 + 4;
		String b = "Oi " + "Programador Java";
		
		//operador módulo(mod): resto da divisão entre dois números:
		double c = 4 % 3;
		
		//obs.: sempre que o mod da divisão é 0 significa que o número é par.
		double d = 4 % 2;
		
		//numeros positivos e negativos:
		double e = -(-3);
		double f = -(+3);
		
		//incrementação, decrementação: 
		double g = 6;
		double h = ++g;
		double i = --g;
		
		//pós-incremento, pós-decremento:
		double j = g++;
		double l = g--;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(l);
		

	}

}
