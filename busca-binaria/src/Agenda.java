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
	
	
	public Pessoa buscar(String nome) {
		
		
		int baixo = 0;
		int alto = contatos.size() - 1;
		
		while(baixo <= alto) {
			
			int meio = (baixo+alto)/2;
			
			Pessoa pessoa = contatos.get(meio);
			String nomeChute = pessoa.getNome();
			int posicao = contatos.indexOf(pessoa);
			
			int  verificador = nome.compareToIgnoreCase(nomeChute);

			if (verificador == 0){
				return pessoa;
			}
			else if(verificador < 0) {
				alto = meio - 1;
			}
			else if(verificador > 0){
				baixo = meio + 1;
			}
		
		}
		return null;
	}
	
}
