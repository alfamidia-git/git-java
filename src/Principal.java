import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Olá mundo");
		
		List<String> lista = new ArrayList<>();
		
		lista.add("bla bla bla");
		lista.add("bla bla bla2");
		
		for(String item : lista) {
			System.out.println(item);
		}
	}

}
