package dispositivos;

public class SmartTV extends DispositivoBase {
	
	public SmartTV() {
		super("Smart TV");
	}

	@Override
	public void mostrarFotografia(String foto) {
		System.out.println(String.format("Smart TV mostrando fotografía '%s' a resolución %sx%s...", foto, this.resolucionHorizontal(),
				this.resolucionVertical()));
	}

	@Override
	public int resolucionHorizontal() {
		// TODO Auto-generated method stub
		return 4080;
	}

	@Override
	public int resolucionVertical() {
		// TODO Auto-generated method stub
		return 2048;
	}

}
