package application.entities;

import application.entities.enums.Color;

/*
 * Classe e Métodos Abstratos.
 */

public abstract class Shape {

	private Color color;
	
	public Shape() {
		
	}
	
	
	
	public Shape(Color color) {
	
		this.color = color;
	}

	
	


	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}


	/*
	 *  Método Abstrato, por isso não tem retorno, pois ela será
	 *  personalizada no uso devido em outras classes extendidas.
	 */
	public abstract Double area();
}
