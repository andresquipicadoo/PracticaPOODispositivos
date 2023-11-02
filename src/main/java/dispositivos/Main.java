package dispositivos;

public class Main {
	public static void main(String args[]) {
		Dispositivo laptop = new Laptop();
		Dispositivo smarttv = new SmartTV();
		Dispositivo proyectorSmart = new ProyectorSmart();
		
		DispositivoControl alexa = new DispositivoControl(laptop);
		System.out.println(String.format("Alexa controlando %s ... ", laptop.tipo()));
		System.out.println("Encendiendo ... ");
		alexa.botonEncendido();
		System.out.println(String.format("Estado: %s", laptop.estado()));
		System.out.println("Apagando ... ");
		alexa.botonEncendido();
		System.out.println(String.format("Estado: %s", laptop.estado()));
	}
}
