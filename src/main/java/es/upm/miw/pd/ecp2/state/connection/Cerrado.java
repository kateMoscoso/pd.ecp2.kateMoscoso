package es.upm.miw.pd.ecp2.state.connection;

public class Cerrado extends Estado {

	@Override
	public void abrir(Conexion conexion) {
		 conexion.setState(new Preparado());
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

}
