
import java.util.Scanner;

public class VerificacaoServico {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Inicialização das variáveis para verificar os serviços
        boolean temMovel = false;
        boolean temBandaLarga = false;
        boolean temTv = false;

        // Verificação dos serviços contratados
        for (String servico : servicosContratados) {
            switch (servico.trim().toLowerCase()) {
                case "movel":
                    temMovel = true;
                    break;
                case "banda larga":
                    temBandaLarga = true;
                    break;
                case "tv":
                    temTv = true;
                    break;
            }
        }

        // Verifica se o combo completo foi contratado
        if (temMovel && temBandaLarga && temTv) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da entrada
        String entradaServicos = scanner.nextLine();
        String[] servicosContratados = entradaServicos.split(",");

        // Verifica e exibe o resultado
        String resultado = verificarComboCompleto(servicosContratados);
        System.out.println(resultado);

        scanner.close();
    }
}

  

