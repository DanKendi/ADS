import java.util.Scanner;

public class exericicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Digite um número qualquer: ");
        int a = in.nextInt();
        System.out.printf("Digite um número maior que o anterior: ");
        int b = in.nextInt();

        while (b < a){
            System.out.println("Número menor!");
            System.out.printf("Digite um número maior que o anterior: ");
            b = in.nextInt();
        }
        System.out.printf("%d > %d", a,b);
    }
}
