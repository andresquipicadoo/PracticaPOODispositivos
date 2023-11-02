package dispositivos;

public interface Dispositivo {
	boolean estaEncendido();
	void encender();
	void apagar();	
	void mostrarFotografia(String foto);
	int resolucionHorizontal();
	int resolucionVertical();
	void cambiarVolumen(int cambio);
	String tipo();
	String estado();
}
