package dispositivos;

public class DispositivoControl {
	private Dispositivo dispositivo;
	
	public DispositivoControl(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public void botonEncendido() {
		if (dispositivo.estaEncendido()) {
			dispositivo.apagar();
		}
		else {
			dispositivo.encender();
		}
	}
	
	public void subirVolumen() {
		this.dispositivo.cambiarVolumen(5);
	}
	
	public void bajarVolumen() {
		this.dispositivo.cambiarVolumen(-5);
	}
	
	public void silenciar() {
		this.dispositivo.cambiarVolumen(-100);
	}
	
	public void mostrarFoto(String foto) {
		this.dispositivo.mostrarFotografia(foto);
	}
}
