
public class OperadoresMatematicos {

	public static void main(String[] args) {
		
		//o operador mais soma, mas tamb�m n�meros, mas tamb�m concatena strings:
		double a = 7 + 4;
		String b = "Oi " + "Programador Java";
		
		//operador m�dulo(mod): resto da divis�o entre dois n�meros:
		double c = 4 % 3;
		
		//obs.: sempre que o mod da divis�o � 0 significa que o n�mero � par.
		double d = 4 % 2;
		
		//numeros positivos e negativos:
		double e = -(-3);
		double f = -(+3);
		
		//incrementa��o, decrementa��o: 
		double g = 6;
		double h = ++g;
		double i = --g;
		
		//p�s-incremento, p�s-decremento:
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
