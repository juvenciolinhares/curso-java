
public class GarbageCollector {

	public static void main(String[] args) {
		/*
		 * variavel primitiva 
		 * quando o valor � atualizado, o valor antigo � substituido.
		 */
		int idade;
		double peso; 
		boolean casado;
		
		/*variavel de referencia:
		 * toda variavel que aponta para um objeto
		 */
		String nome; 
		/*
		 * garbage colector atua nas variaveis de referencia
		 * quando esses valores s�o alterados para um novo valor
		 * o valor antigo ainda permanece na mem�ria
		 * exemplo:
		 */
		nome = "Juvencio";
		System.out.println(nome);
		
		nome = "Ana Thereza";
		System.out.println(nome);
		/*
		 * o nome juvencio ainda fica alocado em memoria
		 * ent�o o garbage collector tem a fun��o de exlcuir esse valor 
		 * que nao faz mais referencia a nenhuma variavel.
		 */
		
		nome = null;
		System.out.println(nome);
		/*
		 * a variavel nao esta mais apontando pra nada 
		 * nesse caso Ana Thereza tamb�m vai ser exlcuido pelo Garbage collector
		 */
	}

}
