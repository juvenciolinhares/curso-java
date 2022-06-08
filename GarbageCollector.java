
public class GarbageCollector {

	public static void main(String[] args) {
		/*
		 * variavel primitiva 
		 * quando o valor é atualizado, o valor antigo é substituido.
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
		 * quando esses valores são alterados para um novo valor
		 * o valor antigo ainda permanece na memória
		 * exemplo:
		 */
		nome = "Juvencio";
		System.out.println(nome);
		
		nome = "Ana Thereza";
		System.out.println(nome);
		/*
		 * o nome juvencio ainda fica alocado em memoria
		 * então o garbage collector tem a função de exlcuir esse valor 
		 * que nao faz mais referencia a nenhuma variavel.
		 */
		
		nome = null;
		System.out.println(nome);
		/*
		 * a variavel nao esta mais apontando pra nada 
		 * nesse caso Ana Thereza também vai ser exlcuido pelo Garbage collector
		 */
	}

}
