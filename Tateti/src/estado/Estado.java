package estado;

import juego.Celda;

public abstract class Estado {

	public abstract Boolean estaOcupada();
	public abstract void pasarAOcupada(Celda celda) throws Exception;
}
