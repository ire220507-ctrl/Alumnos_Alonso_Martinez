package clases;

public class OpcionMostrarAlumnos implements IOpcionMenu {
    @Override
    public void ejecutar(GestoAlumnos gestoAlumnos) {
        // Mostrar la lista de alumnos utilizando GestorAlumnos
        gestoAlumnos.listarAlumnos();
    }

	@Override
	public void ejecutar(GestoAlumnos gestoAlumnos) {
		// TODO Auto-generated method stub
		
	}
}
