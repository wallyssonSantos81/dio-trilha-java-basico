package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Impressora;
import equipamentos.impressora.Digitalizadora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {
	public void copiar() {
		System.out.println("COPIANDO VIA MULTIFUNCIONAL");
	}
	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA MULTIFUNCIONAL");
	}
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");
	}
}
