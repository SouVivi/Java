import java.awt.*;

public class CanetaJava {
   String modelo;
   String cor;
   float ponta;
   int carga;
   boolean tampada;
   boolean desenhar;
   boolean pintar;

   void rabiscar(){
       if(this.tampada == true){
           System.out.println("Erro! A caneta esta tampada!");
       }else{
           System.out.println("Estou rabiscando!");
       }
   }
   void tampar(){
       this.tampada = true;
   }
   void destampar(){
       this.tampada = false;
   }
   void desenha(){
       this.desenhar = false;
   }
   void pinta(){
       this.pintar = true;
   }
   void estado(){

       System.out.println("Esta caneta é do modelo:"+ this.modelo);
       System.out.println("Esta caneta tem a cor:"+ this.cor);
       System.out.println("Esta caneta tem a ponta"+ this.ponta);
       System.out.println("Esta caneta esta com a carga em:"+ this.carga + "%");
       System.out.println("Esta caneta esta tampada?"+ this.tampada);
       System.out.println("Esta caneta esta desenhando"+ this.desenhar);
       System.out.println("Esta caneta esta pintando"+ this.pintar);
   }
}
