package es.upm.miw.pd.ecp2.composite.expression;

public class Dividir extends Expresion{
	public Expresion expresion1,expresion2;
	public Dividir(Expresion expresion1, Expresion expresion2){
		this.expresion1=expresion1;
		this.expresion2=expresion2;
	}

	@Override
	public String toString() {
		return "[ " + this.expresion1.toString() + "/" + this.expresion2.toString()+ " ]";
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return this.expresion1.operar() / this.expresion2.operar();
	}

}
