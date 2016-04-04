package estado;

import juego.Celda;

public class Vacia extends Estado {

	public Boolean estaOcupada(){
		return false;
	}

	public void pasarAOcupada(Celda celda) throws Exception{
		celda.estado = new Ocupada();
	}
}
