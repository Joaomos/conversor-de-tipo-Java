import java.util.Scanner;

public class ConversorDeUnidades {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\nConversor de Unidades");
			System.out.println("1 - Temperatura");
			System.out.println("2 - Distância");
			System.out.println("3 - Peso");
			System.out.println("0 - Sair");
			System.out.println("Escolha uma opção: ");
			opcao = entrada.nextInt();
			
			
			switch (opcao) {
			case 1:
				converterTemperatura(entrada);
				break;
			case 2:
				converterDistancia(entrada);
				break;
			case 3:
				converterPeso(entrada);
				break;
			case 0:
				System.out.println("Programa encerrado.");
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
			}
			
		} while (opcao != 0);
		
		entrada.close();
	}
	
	static void converterTemperatura(Scanner scanner) {
		System.out.println("\nConverter Temperatura:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        int escolha = scanner.nextInt();
        
        if(escolha == 1) {
        	System.out.println("\nDigite a temperatura em Celsius: ");
        	Double temperaturaCelsius = scanner.nextDouble();
        	Double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        	System.out.printf("%.2f °C é igual a %.2f °F\n", temperaturaCelsius, temperaturaFahrenheit);
        } else if(escolha == 2) {
        	System.out.println("\nDigite a temperatura em Fahrenheit: ");
        	Double temperaturaFahrenheit = scanner.nextDouble();
        	Double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5/9;;
        	System.out.printf("%.2f °F é igual a %.2f °C\n", temperaturaFahrenheit, temperaturaCelsius);
        } else {
        	System.out.println("Opção inválida!");
        }
	}
	
	static void converterDistancia(Scanner scanner) {
		System.out.println("\nConverter Distância:");
        System.out.println("1 - Metros para Quilômetros");
        System.out.println("2 - Quilômetros para Metros");
        System.out.println("3 - Quilômetros para Milhas");
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        
        if(escolha == 1) {
        	System.out.println("Digite a Distância em Metros: ");
        	Double distanciaMetros = scanner.nextDouble();
        	Double distanciaQuilometros = distanciaMetros / 1000;
        	System.out.printf("%.2f metros é igual a %.2f quilômetros\n", distanciaMetros, distanciaQuilometros);
        } else if(escolha == 2) {
        	System.out.println("Digite a Distância em Quilômetros: ");
        	Double distanciaQuilometros = scanner.nextDouble();
        	Double distanciaMetros = distanciaQuilometros * 1000;
        	System.out.printf("%.2f quilômetros é igual a %.2f metros\n", distanciaQuilometros, distanciaMetros);
        } else if(escolha == 3) {
        	System.out.println("Digite a Distância em Quilômetros: ");
        	Double distanciaQuilometros = scanner.nextDouble();
        	Double distanciaMilhas = distanciaQuilometros * 0.621371;
        	System.out.printf("%.2f quilômetros é igual a %.2f milhas\n", distanciaQuilometros, distanciaMilhas);
        } else {
        	System.out.println("Opção inválida!");
        }
        
	}

	
	static void converterPeso(Scanner scanner) {
		System.out.println("\nConverter Peso:");
        System.out.println("1 - Quilogramas para Libras");
        System.out.println("2 - Gramas para Quilogramas");
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        
        if(escolha == 1) {
        	System.out.println("Digite o peso em Quilogramas: ");
        	Double pesoQuilogramas = scanner.nextDouble();
        	Double pesoLibras = pesoQuilogramas * 2.20462;
        	System.out.printf("%.2f kg é igual a %.2f lb\n", pesoQuilogramas, pesoLibras);
        } else if(escolha == 2) {
        	System.out.println("Digite o peso em Gramas: ");
        	Double pesoGramas = scanner.nextDouble();
        	Double pesoQuilogramas = pesoGramas / 1000;
        	System.out.printf("%.2f g é igual a %.2f kg\n", pesoGramas, pesoQuilogramas);
        } else {
        	System.out.println("Opção inválida!");
        }
	}

}
