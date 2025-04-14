package classes;

import java.util.ArrayList;

public abstract class PacoteViagem {
	//variaveis 
	String nome;
	String destino;
	int duracao;
	double preco;
	String tipo;
	ArrayList<String> servicos = new ArrayList<String>();
	static 	ArrayList<PacoteViagem> pacotes = new ArrayList<PacoteViagem>();
	
	// construtor
	public PacoteViagem(String nome, String destino, int duracao, double preco, String tipo) {
		this.nome = nome;
		this.destino = destino;
		this.duracao = duracao;
		this.preco = preco;
		this.tipo = tipo;
		pacotes.add(this);

	}
	
	// funcoes relacionadas aos pacotes
	public void listarPacotes() {
		for (pacoteViagem p : pacotes) {
		    System.out.println("Nome: " + p.nome + 
		                       " | Destino: " + p.destino + 
		                       " | Duração: " + p.duracao + 
		                       " | Preço: " + p.preco + 
		                       " | Tipo: " + p.tipo +
		                       "----------------------------");
		}
		
	}
	
	public void pesquisarPacotes(String nomeProcura) {
		for (pacoteViagem p : pacotes) {
			if (p.nome.equals(nomeProcura)) {
				System.out.println(p.nome + "encontrado!");
			}
		}
	}
	
	public void excluirPacote(String nomeExcluir) {
		for (int i = 0; i < pacotes.size(); i++) {
	        if (pacotes.get(i).nome.equals(nomeExcluir)) {
	            System.out.println(pacotes.get(i).nome + " excluído!");
	            pacotes.remove(i);
	            return;
	        }
		}
	}
}
