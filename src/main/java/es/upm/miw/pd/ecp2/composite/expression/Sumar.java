package es.upm.miw.pd.ecp2.composite.expression;

public class Sumar extends Expresion{
	Expresion expresion1, expresion2;
	public Sumar(final Expresion expresion1,final Expresion expresion2 ){
		this.expresion1=expresion1;
		this.expresion2=expresion2;
		
	}

	@Override
	public String toString() {
		return "[ " + this.expresion1.toString() + "+" + this.expresion2.toString()+ " ]";
	}

	@Override
	public int operar() {
		return this.expresion1.operar() + this.expresion2.operar();
	}
}
