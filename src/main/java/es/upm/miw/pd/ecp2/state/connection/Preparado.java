package es.upm.miw.pd.ecp2.state.connection;

public class Preparado extends Estado{

	@Override
	public void abrir(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setState(new Cerrado());
		//this.estado = Estado.CERRADO;
		
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setState(new Parada());
		//this.estado = Estado.PARADO;
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		//this.link.enviar(msg);
		conexion.setState(new Esperando());
     //  this.estado = Estado.ESPERANDO;
		
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

}
