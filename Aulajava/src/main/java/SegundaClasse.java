import java.util.Scanner;

public class SegundaClasse {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Insira o seu nome");
        String nome = dados.nextLine();

        System.out.println("Insira sua idade");
        int idade = dados.nextInt();

        System.out.println("Insira o seu peso");
        double peso = dados.nextDouble();

        System.out.println("Insira a sua altura");
        double altura = dados.nextDouble();

        System.out.println("O seu nome é: " + nome);
        System.out.println("O seu nome é: " + idade);
        System.out.println("O seu nome é: " + peso);
        System.out.println("O seu nome é: " + altura);
    }
}
