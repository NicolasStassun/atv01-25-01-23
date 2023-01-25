import java.util.Scanner;

public class atv4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Double NotaAluno =0.0;
        char NotaAlunoChar = 'a';

        System.out.println("Informe a Nota do Aluno: ");
        NotaAluno = sc.nextDouble();

       NotaAlunoChar= classificarNota(NotaAluno,NotaAlunoChar);

        System.out.println("A Nota do aluno é: "+NotaAlunoChar);
    }

    public static char classificarNota(double NotaAluno, char NotaAlunoChar){

        if (NotaAluno >= 9.0){

            NotaAlunoChar = 'A';


        }
        else if (NotaAluno >= 8.0){

            NotaAlunoChar = 'B';

        }
        else if (NotaAluno >= 7.0){

            NotaAlunoChar = 'C';

        }
        else if (NotaAluno >= 6.0){

            NotaAlunoChar = 'D';

        }
        else if (NotaAluno < 6.0){

            NotaAlunoChar = 'E';

        }
        return NotaAlunoChar;
    }

}
