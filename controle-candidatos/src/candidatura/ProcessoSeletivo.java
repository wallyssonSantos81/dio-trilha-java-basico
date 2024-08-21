package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
	public static void main(String[] args) {
		String[] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
		for(String candidato : candidatos) {
			entrandoEmContato(candidato);
			}
		}
		static void entrandoEmContato(String candidato) {
			int tentativasRealizadas = 1;
			boolean continuarTentando = true;
			boolean atendeu = false;
			do {
				atendeu = atender();
				continuarTentando = !atendeu;
				if(continuarTentando)
					tentativasRealizadas++;
				else
					System.out.println("Contato realizado com sucesso.");
			}while(continuarTentando && tentativasRealizadas<3);
				if(atendeu) 
					System.out.println("Conseguimos contato com " + candidato+ " na " + tentativasRealizadas + "tentativa.");
				else 
					System.out.println("Não conseguimos contato com " + candidato + ", número maximo de tentativas "+ tentativasRealizadas + "realizada ");
		}

		static boolean atender() {
			return new Random().nextInt(3)==1;
		}
		static void imprimirSelecionados() {
			String[] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
			System.out.println("Imprimindo a lista de candidatos, informados no indice do elemento.");
			for(int indece=0;indece<candidatos.length;indece++) {
				System.out.println("O candidato de nº " +(indece+1)+ " é "+candidatos[indece]);
			}
			System.out.println("Forma abreviada de interação for each");
			for(String candidato : candidatos) {
				System.out.println("O candidato selecionado foi " + candidato);
			}
		}
		static void selecaoCandidato() {
			String[] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Mônica","Fabricio","Mirela","Daniela","Jorge"};
			int candidatoSelecionados = 0;
			int candidatoAtual = 0;
			double salarioBase = 2000.0;
			while(candidatoSelecionados <5 && candidatoAtual<candidatos.length){
				String candidato = candidatos[candidatoAtual];
				double salarioPretendido = valorPretendido();
				
				System.out.println("Candidato"+candidato+",solicitou este valor de salario:"+salarioPretendido);
				if(salarioBase>=salarioPretendido){
					System.out.println("O candidato"+ candidato+", foi selecionado para a vaga.");
					candidatoSelecionados++;
				}
				candidatoAtual++;
			}
		}
		static double valorPretendido() {
			return ThreadLocalRandom.current().nextDouble(1800,2200);
		}
		static void analisaCandidato(double salarioPretendido){
			double salarioBase = 2000.0;
			if(salarioBase>salarioPretendido) {
				System.out.println("Ligar para o candidato.");
			}else if(salarioBase ==salarioPretendido) {
				System.out.println("Ligar com uma contra proposta.");	
			}else {
				System.out.println("Aguarda o resultado dos demais candidatos.");	
		}	
	}
}
