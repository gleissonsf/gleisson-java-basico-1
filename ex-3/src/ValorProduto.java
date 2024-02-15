import java.util.Scanner;

public class   ValorProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto : ");
        double valorProduto = scanner.nextDouble();

        System.out.printf("Valor casas decimais: %.2f | Valor inteiro: %d\n", valorProduto, (int) valorProduto);

        int valorInt = 10;
        double novoValorDouble = valorInt;
        System.out.printf("Novo: %d | Convertido: %.2f\n", valorInt, novoValorDouble);


        double valorDouble = 10.0;
        int convertidoParaInt = (int) valorDouble;
        System.out.printf("Original: %.2f | Convertido para int: %d\n", valorDouble, convertidoParaInt);

        scanner.close();
    }
}
