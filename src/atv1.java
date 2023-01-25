import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class atv1 {

    static int x=0,y=0,z=0,contapassos=0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        atravessaRua();

        if(x<=y) {
            while (y>x) {

                x = x + z;
                contapassos++;
            }
            if(x==y){
                System.out.println("Você chegou ao seu destino em: "+contapassos);
            }
            else if(x>y){
                System.out.println("Você ultrapassou seu destino com: "+contapassos+" passos");
            }
        }
        else if(x>y){
            System.out.println("Você já ultrapassou seu destino");
        }

    }
    public static void atravessaRua(){

        System.out.println("Informe sua posição atual: ");

        x = sc.nextInt();

        System.out.println("Informe o local no qual voce deseja chegar: ");

        y = sc.nextInt();

        System.out.println("Informe o quantos metros você percorre em um passo: ");

        z = sc.nextInt();


    }


}
