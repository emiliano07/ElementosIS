package ficha;

public abstract class Ficha {

	//public abstract Boolean esIgual(FichaO ficha);
	//public abstract Boolean esIgual(FichaX ficha);

	public Boolean esIgual(Ficha ficha){
		return ficha.getClass().equals(this.getClass());
	}
}
