public class While {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("Usando while:");
        while (i < 20) {
            System.out.println("valor i: " + i);
            i++;
        }

        int k = 0;

        System.out.println("\nUsando do/while:");
        do {
            System.out.println("valor k: " + k);
            k++;
        } while (k < 20);

        System.out.println("\nUsando for:");
        for (int j = 0; j < 20; j++) {
            System.out.println("valor j: " + j);
        }
    }
}
