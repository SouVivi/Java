import java.util.Scanner;

public class QuintaClasse {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        System.out.println("Insira sua primeira nota");
        int nota1 = notas.nextInt();

        System.out.println("Insira sua segunda nota");
        int nota2 = notas.nextInt();

        System.out.println("Insira sua terceira nota");
        int nota3 = notas.nextInt();

        System.out.println("Insira sua quarta nota");
        int nota4 = notas.nextInt();

        int media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A media das notas é: " + media);

        if(media>=6){
            System.out.println("O aluno esta aprovadol!");
        }
        else if (media>=5){
            System.out.println("O aluno esta de recuparaçao!");
        }else{
            System.out.println("O aluno esta reprovado!");
        }
    }
}
// sistema vai receber 4 notas do usuario usar classe scanner deposiks sistema entrega me
//media das 4 notas