public class TiposPrimitivos {

	public static void main(String[] args) {

		/*tipos primitivos:
		 * int, byte, short,long(numero inteiros)
		 * float, double(ponto flutuante)
		 * char void boolean
		 * alocados na mem�ria stack, s�o apenas um valor,
		 * n�o s�o objetos.
		 */
		char sexo = 'F';
		byte b =127; 
		short s = 32760;
		int i = 2000000000; 
		long l =900000000;
		double peso = 56.43;
		float temperatura= 36.5f;

		//formato binario:
		byte bb = 0b01010101;
		short ss = 0b0101010101010101;
		int ii = 0b01010101010101010101010101010101;	
		System.out.println(bb);
		System.out.println(ss);
		System.out.println(ii);
		
		//cast implicito: uma variavel menor "cabe numa maior"
		i = s;
		System.out.println(i);
		
		//cast explicito=> quando assumo a perda de informa��es:
		i = (int)peso;
		System.out.println(i); 
	}
}
