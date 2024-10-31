public class SetimaClasse {
    public static void main(String[] args) {

        int DiaSemana = 7;
        String NomeDia;

        switch (DiaSemana){
            case 1: NomeDia = "Domingo"; break;
            case 2: NomeDia = "Segunda"; break;
            case 3: NomeDia = "Terca"; break;
            case 4: NomeDia = "Quarta"; break;
            case 5: NomeDia = "Quinta"; break;
            case 6: NomeDia = "Sexta"; break;
            case 7: NomeDia = "Sabado"; break;
            default: NomeDia = "Dia invalido!";
        }
        System.out.println(NomeDia);
    }
}
// colocar os meses do ano usando switch