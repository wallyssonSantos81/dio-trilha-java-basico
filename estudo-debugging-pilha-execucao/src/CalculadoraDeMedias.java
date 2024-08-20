
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String [] args){
        Scanner imput = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruno", "Pedro"};

        double media = calculoMediaDaTurma(alunos,imput);

        System.out.printf("Média da Turma %.1f", media);
    }
    public static double calculoMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s",aluno);
            double nota = scanner.nextDouble();
            soma+=nota;
        }
        return soma / alunos.length;
    }

}