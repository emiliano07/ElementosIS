package juego;

import estado.Estado;
import estado.Vacia;
import exception.CeldaOcupadaException;
import ficha.Ficha;
import ficha.NoFicha;

public class Celda {
	
	public Estado estado;
	public Ficha ficha;
	
	public Celda(){
		this.estado = new Vacia();
		this.ficha = new NoFicha();
	}
	
	public Boolean estaOcupada(){
		return this.estado.estaOcupada();
	}

	public void poner(Ficha ficha) throws Exception{
		if(this.estado.estaOcupada()){
			throw new CeldaOcupadaException();
		}
		this.ficha = ficha;
	}
}