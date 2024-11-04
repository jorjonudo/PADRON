package aplicacion;
import presentacion.InterfazUsuario;
public class principal {
	public static void main(String[] args) {
		String[] instr;
		InterfazUsuario iu = new InterfazUsuario();
		do {
			
			instr = iu.leerInstrucion();
		} while (iu.ejecutar(instr));  
	}
}