import com.google.gson.Gson;
import java.io.FileReader;

public class Programa {
	public static void main(String[] args) {
		
		Gson json = new Gson();
		Agenda agenda = new Agenda();
		
		try {
			FileReader leitor = new FileReader("src/contatos.json");
			agenda = json.fromJson(leitor, Agenda.class);
			leitor.close();
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		for(Pessoa pessoa : agenda.getContatos()) {
			System.out.println(pessoa.getNome()+ " " + pessoa.getContato());
		}

	}
}