package juego_test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exception.CeldaOcupadaException;
import ficha.FichaO;
import ficha.FichaX;
import juego.Tateti;

public class JuegoTatetiTest {

public Tateti tateti;
	
	@Before
	public void setUp(){
		this.tateti = new Tateti();
	}
	
	@Test
	public void ponerUnaFicha() throws Exception{
		try {
			this.tateti.poner(0);
		}catch(CeldaOcupadaException e){
			e.printStackTrace();
		}
		Assert.assertEquals(true, this.tateti.tablero.celdas[0].ficha.esIgual(new FichaO()));
	}
	
	@Test
	public void ponerUnaFichaEnUnaCeldaOcupada() throws Exception{
		try {
			this.tateti.poner(0);
			this.tateti.poner(0);
		}catch(CeldaOcupadaException e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void cambiarElTurno() throws Exception{
		try {
			this.tateti.poner(0);
		}catch(CeldaOcupadaException e){
			e.printStackTrace();
		}
		Assert.assertEquals(true, this.tateti.turno.esIgual(new FichaX()));
	}
	
	@Test
	public void gano() throws Exception{
		try {
			this.tateti.tablero.poner(0, new FichaO());
			this.tateti.tablero.poner(1, new FichaO());
			this.tateti.tablero.poner(2, new FichaO());
		}catch(CeldaOcupadaException e){
			e.printStackTrace();
		}
		Assert.assertTrue(this.tateti.gano());
	}
	
	@Test
	public void empato() throws Exception{
		try {
			this.tateti.tablero.poner(0, new FichaO());
			this.tateti.tablero.poner(1, new FichaX());
			this.tateti.tablero.poner(2, new FichaO());
			this.tateti.tablero.poner(3, new FichaX());
			this.tateti.tablero.poner(4, new FichaO());
			this.tateti.tablero.poner(5, new FichaX());
			this.tateti.tablero.poner(6, new FichaX());
			this.tateti.tablero.poner(7, new FichaO());
			this.tateti.tablero.poner(8, new FichaX());
		}catch(CeldaOcupadaException e){
			e.printStackTrace();
		}
		Assert.assertFalse(this.tateti.gano());
	}
}