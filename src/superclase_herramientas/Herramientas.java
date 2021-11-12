package superclase_herramientas;

public class Herramientas {
	
	private int peso;
	private int precio;
	private String material;
	
	
	
	/**
	 * 
	 */
	public Herramientas() {}

	//Constructor con parámetros

	public Herramientas(int peso, int precio, String material) {
		this.peso = peso;
		this.precio = precio;
		this.material = material;
		
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
	
	
	
	

}
