import java.util.Scanner;

public class atv2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        float saldo=0, deposito=0,saque=0;
        int menu = 0;

        saldo = definirSaldoInicial(saldo);

        do {
            System.out.println("------Conta Corrente------\n" +
                    "Saldo da sua conta: "+saldo+"\n"+
                    "--------------------------\n"+
                    "1- Depositar\n" +
                    "2- Sacar\n" +
                    "3- Sair\n" +
                    "--------------------------\n");
                    menu = sc.nextInt();

                    switch (menu){
                        case 1:
                            saldo=deposito(saldo,deposito);
                            break;
                        case 2:
                            saldo=saque(saldo,saque);
                            break;
                    }
        }while (menu!=3);



    }
    public static float definirSaldoInicial(float saldo){

        System.out.println("Defina o saldo inicial desta conta: ");
        saldo = sc.nextFloat();

        return saldo;
    }
    public static float deposito(float saldo,float deposito){

        System.out.println("Defina o quanto você deseja depositar: ");
        deposito = sc.nextFloat();

        saldo = saldo+ deposito;

        return saldo;
    }
    public static float saque(float saldo, float saque){

        System.out.println("Defina o quanto você deseja sacar: ");
        saque = sc.nextFloat();

        if (saque>saldo){
            System.out.println("Operação inválida");
        }
        else{
            saldo=saldo-saque;
        }
        return saldo;
    }


}
