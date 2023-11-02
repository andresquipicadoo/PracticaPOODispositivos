package dispositivos;

public abstract class DispositivoBase implements Dispositivo {
	boolean encendido = false;
	int volumen = 0;
	String tipo;
	
	public DispositivoBase(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public boolean estaEncendido() {
		return encendido;
	}

	public void encender() {
		encendido = true;		
	}

	public void apagar() {
		encendido = false;		
	}
	
	public void cambiarVolumen(int cambio) {
		if (cambio < 0) {
			volumen = Math.min(volumen + cambio, 0);
		} else {
			volumen = Math.max(volumen + cambio, 100);
		}
	}
	
	public String tipo() {
		return this.tipo;
	}
	
	public String estado() {
		if (encendido) {
			return "Dispositivo encendido!";
		}
		else {
			return "Dispositivo apagado!";
		}
	}

}
