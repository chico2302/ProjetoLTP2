package classes;

import java.util.ArrayList;

public abstract class PacoteViagem {
	//variaveis 
	String nome;
	String destino;
	int duracao;
	double preco;
	String tipo;
	ArrayList<ServicoAdicional> servicos = new ArrayList<ServicoAdicional>();
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
		for (PacoteViagem p : pacotes) {
		    System.out.println("Nome: " + p.nome + 
		                       " | Destino: " + p.destino + 
		                       " | Duração: " + p.duracao + 
		                       " | Preço: " + p.preco + 
		                       " | Tipo: " + p.tipo +
		                       "----------------------------");
		}
		
	}
	
	public void pesquisarPacotes(String nomeProcura) {
		for (PacoteViagem p : pacotes) {
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
class PacoteAventura extends PacoteViagem {
	public PacoteAventura(String nome, String destino, int duracao, double preco, String tipo) {
		super(nome, destino, duracao, preco, tipo);
		String detalhes = "Inclui trilhas e passeios de jipe";
		pacotes.add(this);
	}
}

class PacoteLuxuoso extends PacoteViagem {
	public PacoteLuxuoso(String nome, String destino, int duracao, double preco, String tipo) {
		super(nome, destino, duracao, preco, tipo);
		String detalhes = "Mais comodidade, viagem de primeira classe e motoristas inclusos";
		pacotes.add(this);
	}
}

class PacoteCultural extends PacoteViagem {
	public PacoteCultural(String nome, String destino, int duracao, double preco, String tipo) {
		super(nome, destino, duracao, preco, tipo);
		String detalhes = "Inclui visitas a museus, centros históricos e experiências gastronômicas";
		pacotes.add(this);
	}
}
