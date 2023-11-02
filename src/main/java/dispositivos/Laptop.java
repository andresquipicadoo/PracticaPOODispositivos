package dispositivos;

public class Laptop extends DispositivoBase {

	public Laptop() {
		super("Laptop");
	}

	@Override
	public void mostrarFotografia(String foto) {
		System.out.println(String.format("Laptop mostrando fotografía '%s' a resolución %sx%s...", foto, this.resolucionHorizontal(),
				this.resolucionVertical()));
	}

	@Override
	public int resolucionHorizontal() {
		// TODO Auto-generated method stub
		return 2480;
	}

	@Override
	public int resolucionVertical() {
		// TODO Auto-generated method stub
		return 1260;
	}
}
