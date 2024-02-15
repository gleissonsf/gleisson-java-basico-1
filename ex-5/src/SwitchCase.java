public class SwitchCase {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("Para o valor " + i + ": Primeira condição");
                    break;
                case 4:
                    System.out.println("Para o valor " + i + ": Segunda condição");
                    break;
                default:
                    System.out.println("Para o valor " + i + ": Não encontrou uma condição");
            }
        }
    }
}
