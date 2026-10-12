import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int age = sc.nextInt();
        System.out.printf("Olá %s, sua idade é %d anos", nome, age);
    }
}