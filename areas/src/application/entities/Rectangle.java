package application.entities;

import application.entities.enums.Color;

public class Rectangle extends Shape {
	
	private Double width;
	private Double heigth;

	
	public Rectangle() {
		
	}


	public Rectangle(Color color, Double width, Double heigth) {
		super(color);
		this.width = width;
		this.heigth = heigth;
	}


	public Double getWidth() {
		return width;
	}


	public void setWidth(Double width) {
		this.width = width;
	}


	public Double getHeigth() {
		return heigth;
	}


	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}


	/*
	 * Sobreposição(Override) do método obrigatório por extender uma classe
	 * ou método abstrato.
	 * 
	 * Área do retângulo: PI * raio ao (2)quadrado.
	 */
	@Override
	public Double area() {
		
		return width * heigth;
	}
	
	
	
}
