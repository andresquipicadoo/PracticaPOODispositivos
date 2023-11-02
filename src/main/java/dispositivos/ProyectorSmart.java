package dispositivos;

public class ProyectorSmart extends DispositivoBase {
	
	public ProyectorSmart() {
		super("Proyector Smart");
	}

	@Override
	public void mostrarFotografia(String foto) {
		System.out.println(String.format("Proyector Smart mostrando fotografía '%s' a resolución %sx%s...", foto, this.resolucionHorizontal(),
				this.resolucionVertical()));
	}

	@Override
	public int resolucionHorizontal() {
		// TODO Auto-generated method stub
		return 3800;
	}

	@Override
	public int resolucionVertical() {
		// TODO Auto-generated method stub
		return 1800;
	}

}
