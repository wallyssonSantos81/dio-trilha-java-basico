package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Deskjet;
import equipamentos.digitalizadora.Impressora;
import equipamentos.digitalizadora.Laserjet;
import equipamentos.impressora.Digitalizadora;
import equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}

}
