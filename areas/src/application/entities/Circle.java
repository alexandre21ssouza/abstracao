package application.entities;

import application.entities.enums.Color;

public class Circle extends Shape{
	
	private Double radius;
	
	public Circle() {
		
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	
	/*
	 * Sobreposição(Override) do método obrigatório por extender uma classe
	 * ou método abstrato.
	 * 
	 * Área do circulo: PI * raio ao (2)quadrado.
	 */
	@Override
	public Double area() {
		
		return Math.PI * radius * radius;
	}
	
	
	
}
