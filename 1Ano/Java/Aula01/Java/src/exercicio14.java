import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int a = in.nextInt();

        while (a < 0){
            System.out.println("Valor negativo!");
            System.out.print("Digite um valor positivo: ");
            a = in.nextInt();
        }
        System.out.println("Valor aceito!");
    }
}
