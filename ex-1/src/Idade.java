public class Idade {

    public static void main(String[] args) {
        int idade = 15;
        System.out.println("A idade é de " + idade + " anos");

        int resultado1 = (idade + 5) * 2;
        System.out.println("Resultado 1: " + resultado1);

        int resultado2 = idade - 5;
        System.out.println("Resultado 2: " + resultado2);

        if (idade > 20) {
            System.out.println("A idade é maior que 20");
        } else {
            System.out.println("A idade é menor ou igual a 20");
        }
    }
}
