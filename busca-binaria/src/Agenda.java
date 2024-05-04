import java.util.ArrayList;

public class Agenda {
	private ArrayList<Pessoa> contatos = new ArrayList<Pessoa>();
	
	public ArrayList<Pessoa> getContatos() {
		return contatos;
	}
	
	public void setContatos(String nome, String contato){
		Pessoa pessoa = new Pessoa(nome, contato);
		contatos.add(pessoa);
	}
	
}
