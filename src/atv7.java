import java.util.Scanner;

public class atv7 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numeroDeLinhas = 0;

        System.out.println("Informe o número que você deseja: ");
        numeroDeLinhas = sc.nextInt();

        formatador(numeroDeLinhas);

    }
    public static void formatador(int numeroDeLinhas){


        System.out.println("*=======================*");
        while (numeroDeLinhas!=0){
            for (int i=0;i<numeroDeLinhas;i++){
                if (i==0 || i==(numeroDeLinhas)){
                    System.out.printf("*"+numeroDeLinhas);
                }
                else{
                    System.out.printf(""+numeroDeLinhas);
                }
            }
            for (int i=0;i<numeroDeLinhas;i++){
                if (i==0){
                    System.out.printf("*"+numeroDeLinhas);
                }
                else if( i==(numeroDeLinhas-1)){
                    System.out.printf(numeroDeLinhas+"*\n");
                }
                else if(i!=0 & i!=numeroDeLinhas){
                    System.out.printf(""+numeroDeLinhas);
                }
            }
            numeroDeLinhas--;
        }
        System.out.println("*\n*           *           *\n" +
                "*-----------------------*");


    }


}
