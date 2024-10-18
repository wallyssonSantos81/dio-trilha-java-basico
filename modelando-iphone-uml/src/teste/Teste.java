package teste;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Teste {

    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;

        // Soma todas as velocidades
        for (String velocidade : velocidades) {
            try {
                total += Integer.parseInt(velocidade.trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido encontrado: " + velocidade);
                return -1; // Retorna valor inválido
            }
        }

        // Calcula a média
        return (double) total / velocidades.length;
    }

    public static boolean validarEntrada(String input) {
        // Verifica se a entrada contém apenas números, vírgulas e espaços
        return input.matches("[0-9, ]+");
    }

    // Função para formatar a velocidade média e retornar a string formatada
    public static String formatarVelocidadeMedia(double velocidadeMedia) {
        if (velocidadeMedia == -1) {
            return "Erro no calculo da velocidade media.";
        }

        // Configura o formato para usar vírgula como separador decimal
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator(',');

        // Define o formato com duas casas decimais
        DecimalFormat df = new DecimalFormat("0.00", symbols);

        // Verifica se a média é um número inteiro
        if (velocidadeMedia == (int) velocidadeMedia) {
            // Se for um número inteiro, retorna sem casas decimais
            return (int) velocidadeMedia + " Mbps";
        } else {
            // Caso contrário, retorna com duas casas decimais
            return df.format(velocidadeMedia) + " Mbps";
        }
    }

    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String input;

        while (true) {
            System.out.println("Insira as velocidades de conexao separadas por virgula:");
            input = br.readLine();

            if (validarEntrada(input)) {
                break;
            } else {
                System.out.println("Entrada inválida! Insira somente números separados por vírgula.");
            }
        }

        String[] velocidades = input.split(",");
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Formata e imprime a velocidade média
        
        System.out.println("Insira as velocidades de conexao separadas por virgula: ", + formatarVelocidadeMedia(velocidadeMedia));

  
    }
}
