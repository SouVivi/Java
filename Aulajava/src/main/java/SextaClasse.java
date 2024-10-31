import java.util.Scanner;

public class SextaClasse {
    public static void main(String[] args) {
        Scanner imc = new Scanner(System.in);

        System.out.println("Insira seu peso");
        double massa = imc.nextDouble();

        System.out.println("Insira sua altura");
        double altura = imc.nextDouble();


        double result = massa /(altura*altura);

        System.out.println("Seu IMC é: " + result);

        if(result<=18.5){
            System.out.println("Abaixo do peso!");
        }
        else if (result >=18.6){
            System.out.println("Peso ideal!");
        }else if ((result >= 18.6) && (result <= 24.9)){
            System.out.println("Levemente acima do peso!");
        }else if ((result >= 25.0) && (result <= 29.9)){
            System.out.println("Obesidade grau 1!");
        }else if((result >= 30.0) && (result <=34.9)){
            System.out.println("Obesidade grau 2!(severa)");
        }else if (result>= 40){
            System.out.println("Obesidade grau 3!(morbida)");
        }
    }
}