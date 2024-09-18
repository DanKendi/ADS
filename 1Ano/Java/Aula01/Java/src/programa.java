import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a,b=0;

        System.out.print("Digite o primeiro número: ");
        a=in.nextInt();
        System.out.print("Digite o segundo número: ");
        b=in.nextInt();

        System.out.println(a+" + "+b+" = "+(a+b));

    }
}
