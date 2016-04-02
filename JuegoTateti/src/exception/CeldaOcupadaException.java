package exception;

public class CeldaOcupadaException extends Exception{
	
	public CeldaOcupadaException(){
		super("Esa celda ya se encuentra ocupada");
	}
}