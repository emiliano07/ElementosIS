package juego;

import ficha.Ficha;

public class Tablero {

	public Celda[] celdas;
	public Ficha turno;
	
	public Tablero(){
		this.celdas = new Celda[9];
		for(int i = 0; i < this.celdas.length; i++){
			this.celdas[i] = new Celda();
		}
	}

	public void poner(int posicion, Ficha ficha) throws Exception{
		this.celdas[posicion].poner(ficha);
	}

	public Ficha fichaEnPosicion(int posicion) {
		return this.celdas[posicion].ficha;
	}
}