import com.google.gson.Gson;
import java.io.FileReader;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Gson json = new Gson();
		Agenda agenda = new Agenda();
		
		//  Pegando informações Json
		try {
			FileReader leitor = new FileReader("src/contatos/contatos.json");
			agenda = json.fromJson(leitor, Agenda.class);
			leitor.close();
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		// Buscando
		System.out.print("Buscar: ");
		String nome = scanner.next();
		Pessoa pessoa = agenda.buscar(nome);
		
		if (pessoa != null) {
			System.out.println("Nome: " + pessoa.getNome());
			System.out.print("Contato: " + pessoa.getContato());
		}else {
			System.out.print("O nome informado não está na agenda");
		}

		
	}		
}