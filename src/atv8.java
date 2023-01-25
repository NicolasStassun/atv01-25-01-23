import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.Scanner;

public class atv8 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double Horario24 = 0.0;
        String AMPM = null;

        System.out.println("Informe o horario no sistema de 24 horas: ");
        Horario24 = sc.nextDouble();
        trocaHorario(Horario24,AMPM);



    }
    public static void trocaHorario(double Horario24, String AMPM){

        double Horario12 =0.0;
        if(Horario24<=11.59){
            AMPM = "AM";
            System.out.println(Horario24+" "+AMPM);
        }
        if(Horario24>=13.00){
            AMPM = "PM";
            Horario12 = Horario24 - 12.00;
            System.out.println(Horario12+" "+AMPM);
        }
        if(Horario24>=12.00 & Horario24<13.00){
            AMPM = "PM";
            System.out.println(Horario24+" "+AMPM);
        }

    }

}
