package juego;

import ficha.Ficha;
import ficha.FichaO;
import ficha.FichaX;

public class Tateti {

	public Tablero tablero;
	public Ficha turno;
	
	public Tateti(){
		this.tablero = new Tablero();
		this.turno = new FichaO();		//Siempre inicia el O
	}
	
	public void poner(int posicion) throws Exception{
		this.tablero.poner(posicion,this.turno);
		this.cambiarTurno();
	}

	private void cambiarTurno(){
		if(this.turno.esIgual(new FichaO())){
			this.turno = new FichaX();
		}else{
			this.turno = new FichaO();
		}
	}
	
	public Boolean gano(){
		return	this.ganaEn(0,1,2) || this.ganaEn(3,4,5) || this.ganaEn(6,7,8) || this.ganaEn(0,3,6) || 
				this.ganaEn(1,4,7) || this.ganaEn(2,5,8) || this.ganaEn(0,4,8) || this.ganaEn(2,4,6) ;
	}
	
	private boolean ganaEn(int posicion1,int posicion2,int posicion3) {
		return 	this.tablero.fichaEnPosicion(posicion1).esIgual(this.tablero.fichaEnPosicion(posicion2)) &&
				this.tablero.fichaEnPosicion(posicion1).esIgual(this.tablero.fichaEnPosicion(posicion3)) ;
	}
}