//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CanetaJava caneta1 = new CanetaJava();

        caneta1.modelo = "Esferografica";
        caneta1.cor = "azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 90;
        caneta1.tampada = true; //trocar depois por caneta1.tampar();
        caneta1.desenhar = false;
        caneta1.pintar = false;

        caneta1.pinta();
        caneta1.estado();
        caneta1.rabiscar();


    }
}