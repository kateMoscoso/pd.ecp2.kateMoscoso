package es.upm.miw.pd.ecp2.composite.expression;

public class Numero extends Expresion{
	public int numero;
	public Numero(int numero){
		this.numero=numero;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+numero;
	}
	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return this.numero;
	}

}
