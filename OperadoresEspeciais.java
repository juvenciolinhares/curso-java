import java.util.Scanner;

public class OperadoresEspeciais {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//operador ternário(3 operandos):

		int idade = 6;

		String x = (idade >= 18) ? "Maior de Idade" : "Menor de Idade";

		//operador de separação de expressoes;

		String sexo = "M", pais = "Brasil";
		
		System.out.println(x);
		System.out.println(sexo);
		System.out.println(pais);

		//calculo do diâmetro de um cìrculo:
		System.out.println("Digite o valor do raio: ");
		
		double raio = sc.nextDouble();
		double diametro = raio * 2;
		
		//calculo da circunferencia:
		double circunferencia = 2 * Math.PI * raio;
		
		//area do circulo:
		double area = Math.PI * Math.pow(raio, 2);// ou Math.PI *(raio * raio);

		
		System.out.println("Diametro: " + diametro);
		System.out.println("Circunferencia: " + circunferencia);
		System.out.println("Area: " + area);



	}

}
