package herencia_herramientas;

import interfaces.Funcionamiento;
import interfaces.Usos;
import superclase_herramientas.Herramientas;

public class Radio extends Herramientas implements Usos, Funcionamiento{
	
	private String marca_radio; 
	private String color; 
	
	
	public Radio() {
	super();
	}

	public Radio(int peso, int precio, String material) {
		super(peso, precio, material);
		// TODO Auto-generated constructor stub
	}

	public Radio(int precio, int peso, String material, String marca_radio, String color) {
		this.marca_radio = marca_radio;
		this.color = color;
	}
	
	

	public String getMarca_radio() {
		return marca_radio;
	}

	public void setMarca_radio(String marca_radio) {
		this.marca_radio = marca_radio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void encender() {
		System.out.println("Estoy encenciendo la Radio");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar() {
		System.out.println("Estoy apagando la Radio");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uso() {
		System.out.println("Estoy usando la Radio");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desuso() {
		
	System.out.println("No estoy usando la Radio");
		// TODO Auto-generated method stub
		
	}
	
	

}
