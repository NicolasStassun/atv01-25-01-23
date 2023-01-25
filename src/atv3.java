import java.util.Scanner;

public class atv3 {

    static Scanner sc = new Scanner(System.in);
    static Integer[] QuantidadeProdutos = new Integer[5];

    public static void main(String[] args) {

        String[] NumeroProduto = new String[5];
        String[] DescricaoProduto = new String[5];
        Double[] PreçoProduto = new Double[5];

        NumeroProduto[0] = "01";
        DescricaoProduto[0] = "HD 1Tb";
        PreçoProduto[0] = 500.0;

        NumeroProduto[1] = "02";
        DescricaoProduto[1] = "SSD 128gb";
        PreçoProduto[1] = 360.0;

        NumeroProduto[2] = "03";
        DescricaoProduto[2] = "Placa Mãe Ag563";
        PreçoProduto[2] = 867.50;

        NumeroProduto[3] = "04";
        DescricaoProduto[3] = "Processador i5 9900K";
        PreçoProduto[3] = 1230.75;

        NumeroProduto[4] = "05";
        DescricaoProduto[4] = "Placa de Vídeo RTX 2060";
        PreçoProduto[4] = 2154.0;

        menu(NumeroProduto,DescricaoProduto,PreçoProduto);


    }
    public static void menu(String[] NumeroProduto, String[] DescricaoProduto, Double[] PreçoProduto){

        for (int i =0; i!=3;i=i) {
            System.out.println("---------Loja CTW---------\n" +
                    "1- Mostrar produtos\n" +
                    "2- Adicionar Item\n" +
                    "3- Finalizar Compra\n"+
                    "----------------------------\n");




            i = sc.nextInt();

            switch (i){
                case 1:

                    MostraProdutos(NumeroProduto,DescricaoProduto,PreçoProduto);

                    break;

                case 2:

                    AdicionarItem(NumeroProduto,DescricaoProduto,PreçoProduto);

                    break;

                case 3:

                    FinalizarCompra(NumeroProduto,DescricaoProduto,PreçoProduto);
                        i=3;
                    break;

            }
        }
    }

    public static void MostraProdutos(String[] NumeroProduto, String[] DescricaoProduto, Double[] PreçoProduto){

        for(int i=0;i<=4;i++){

            System.out.println(NumeroProduto[i]+" - "+DescricaoProduto[i]+" R$"+PreçoProduto[i]);

        }
        menu(NumeroProduto,DescricaoProduto,PreçoProduto);
    }

    public static void AdicionarItem(String[] NumeroProduto, String[] DescricaoProduto, Double[] PreçoProduto){
        String AdcNum ="";
        int quantidade = 0;
        System.out.println("Informe o código do item que você deseja adicionar ao seu carrinho:");
        AdcNum = sc.next();
        sc.nextLine();
        for (int i=0;i<=4;i++) {

            if (NumeroProduto[i].equals(AdcNum)) {

                System.out.println("Informe a quantidade que você deseja adicionar ao seu carrinho: ");
                quantidade = sc.nextInt();
                QuantidadeProdutos[i] = quantidade;

            }
        }
        menu(NumeroProduto,DescricaoProduto,PreçoProduto);

    }
    public static void FinalizarCompra(String[] NumeroProduto, String[] DescricaoProduto, Double[] PreçoProduto){

        double totalCompra[] = new double[5];
        double total=0.0;

                if(QuantidadeProdutos[0]!=null){
                    totalCompra[0] = QuantidadeProdutos[0]*500.0;
                    System.out.println(QuantidadeProdutos[0]+" | "+NumeroProduto[0]+" - "+DescricaoProduto[0]+" R$"+PreçoProduto[0]);
                }
                if(QuantidadeProdutos[1]!=null){
                    totalCompra[1] = QuantidadeProdutos[1]*360.0;
                    System.out.println(QuantidadeProdutos[1]+" | "+NumeroProduto[1]+" - "+DescricaoProduto[1]+" R$"+PreçoProduto[1]);
                }
                if((QuantidadeProdutos[2]!=null)){
                    totalCompra[2] = QuantidadeProdutos[2]*867.50;
                    System.out.println(QuantidadeProdutos[2]+" | "+NumeroProduto[2]+" - "+DescricaoProduto[2]+" R$"+PreçoProduto[2]);
                }
                if(QuantidadeProdutos[3]!=null){
                    totalCompra[3] = QuantidadeProdutos[3]*1230.75;
                    System.out.println(QuantidadeProdutos[3]+" | "+NumeroProduto[3]+" - "+DescricaoProduto[3]+" R$"+PreçoProduto[3]);
                }
                if(QuantidadeProdutos[4]!=null){
                    totalCompra[4] = QuantidadeProdutos[4]*2154.0;
                    System.out.println(QuantidadeProdutos[4]+" | "+NumeroProduto[4]+" - "+DescricaoProduto[4]+" R$"+PreçoProduto[4]);
                }
                for(int j=0;j<4;j++){
                    total += totalCompra[j];
                }
                 System.out.println("Seu total foi de R$"+total);
            }



}
