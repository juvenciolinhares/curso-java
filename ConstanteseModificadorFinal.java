
public class ConstanteseModificadorFinal {

	public static void main(String[] args) {
		
		
		 /* existem valores que sempre são alterados, exemplo:
		 * valor da população brasileira:
		 */
		int populacaoBrasileira = 203429773;
		System.out.println(populacaoBrasileira);
		
		populacaoBrasileira = 123;
		System.out.println(populacaoBrasileira);
		
		
		 /* existem valores que nunca serão alterados, exemplo:
		 * valor de pi.
		/*pra garantir que esse valor não será alterado 
		 * utilizamos um modificador final(sempre escrito em letra minuscula).
		 */
		final double PI =3.14159265358979323846;
		System.out.println(PI);
		/*se eu tentar modificar esse valor, vou receber uma mensagem de erro:
		 */
		//PI = 123=> erro apresentado: The final local variable PI cannot be assigned
		
		/*situações em que utilizo constantes: 
		 * difinir valores do sexo masculino e feminino:
		 */
		final char SEXO_MASCULINO = 'M';
		final char SEXO_FEMININO = 'F';
		/* regras de nomeação de constantes:
		 * 1-escrever em uppercase;
		 * 2- nome composto separar em _;
		 */

	}

}
