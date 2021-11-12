package herencia_herramientas;

import interfaces.Funcionamiento;
import interfaces.Usos;
import superclase_herramientas.Herramientas;

public class Ordenador extends Herramientas implements Funcionamiento, Usos{
	
	private String marca_procesador;
	private int memoria_ram;
	private String marca_comercial; 
	
	
	public Ordenador() {
		super();
	
	}

	public Ordenador(int peso, int precio, String material, String marca_procesador, int memoria_ram, String marca_comercial) {
		super(peso, precio, material);
		
		this.marca_procesador = marca_procesador;
		this.memoria_ram = memoria_ram;
		this.marca_comercial = marca_comercial;
	}
	
	

	public String getMarca_procesador() {
		return marca_procesador;
	}

	public void setMarca_procesador(String marca_procesador) {
		this.marca_procesador = marca_procesador;
	}

	public int getMemoria_ram() {
		return memoria_ram;
	}

	public void setMemoria_ram(int memoria_ram) {
		this.memoria_ram = memoria_ram;
	}

	public String getMarca_comercial() {
		return marca_comercial;
	}

	public void setMarca_comercial(String marca_comercial) {
		this.marca_comercial = marca_comercial;
	}

	@Override
	public void uso() {
		System.out.println("Estoy usando el ordenador");
		
	}

	@Override
	public void desuso() {
		System.out.println("No estoy usando el ordenador");
		
	}

	@Override
	public void encender() {
		System.out.println("Enciendo el ordenador");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apago el ordenador");
		
	}

}
