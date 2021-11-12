package principal;

import herencia_herramientas.Ordenador;
import herencia_herramientas.Radio;

public class MisHerramientas {

	public static void main(String[] args) {
		
		Ordenador ordenador1 = new Ordenador(200, 1000, "Plastico", "Intel", 16, "HP2"); 
		ordenador1.encender();
		ordenador1.uso(); 
		ordenador1.apagar(); 
		ordenador1.desuso(); 	
		
		Radio radio1 = new Radio(100, 500, "Metal", "Sony", "Negra");
		radio1.encender();
		radio1.apagar();
		radio1.uso();
		radio1.desuso(); 
	}

	
}
