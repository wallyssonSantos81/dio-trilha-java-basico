import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    // Função para verificar se houve queda de conexão
    public static String verificarQuedaDeConexao(String[] velocidades) {
        // Percorre todas as velocidades registradas
        for (String velocidade : velocidades) {
            // Se encontrar uma velocidade igual a 0, retorna "Queda de Conexao"
            if (Integer.parseInt(velocidade.trim()) == 0) {
                return "Queda de Conexao";
            }
        }
        // Se nenhuma velocidade for 0, retorna "Sem Quedas"
        return "Sem Quedas";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Lê a linha de entrada
        String input = br.readLine();

        // Divide a entrada em uma lista de strings separadas por vírgula
        String[] velocidades = input.split(",");

        // Verifica se houve queda de conexão
        String resultado = verificarQuedaDeConexao(velocidades);

        // Exibe o resultado
        System.out.println(resultado);
    }
}
