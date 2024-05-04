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
		
		int menorIndex = 0;
		int maiorIndex = contatos.size() - 1;
		
		while(menorIndex <= maiorIndex) {
			
			int indexDoMeio = (menorIndex+maiorIndex)/2;
			
			Pessoa pessoa = contatos.get(indexDoMeio);
			String nomeChute = pessoa.getNome();
			int posicao = contatos.indexOf(pessoa);
			
			int  verificador = nome.compareToIgnoreCase(nomeChute);

			if (verificador == 0){
				return pessoa;
			}
			else if(verificador < 0) {
				maiorIndex = indexDoMeio - 1;
			}
			else if(verificador > 0){
				menorIndex = indexDoMeio + 1;
			}
		
		}
		return null;
	}
	
}
