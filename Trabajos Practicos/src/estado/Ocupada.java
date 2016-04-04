package estado;

import juego.Celda;

public class Ocupada extends Estado {

	public Boolean estaOcupada(){
		return true;
	}

	public void pasarAOcupada(Celda celda) throws Exception{
		throw new Exception("No se puede pasar a vacia");
	}
}