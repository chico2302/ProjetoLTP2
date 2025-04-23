package classes;

import java.util.ArrayList;
import java.util.List;
import classes.PacoteViagem;
import classes.CadastroPacote;

public abstract class Cliente {
	String nome;
	int telefone;
	String email;
	
	ArrayList<PacoteViagem> pacoteRelacionado = new ArrayList<PacoteViagem>();
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public Cliente(String nome, int telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		CadastroPacote.adicionarCliente(this);
	}
	
	public void adicionarPacote(PacoteViagem pacote) {
		pacoteRelacionado.add(pacote);
	}

	public String getNome() {
		return nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}
}
class ClienteNacional extends Cliente {
	protected int cpf;
	
	public ClienteNacional(String nome,int telefone, String email, int cpf) {
		super(nome,telefone,email);
		this.cpf = cpf;
	}
}
class ClienteInternacional extends Cliente {
	protected int passaporte;
	
	public ClienteInternacional(String nome,int telefone, String email, int passaporte) {
		super(nome,telefone,email);
		this.passaporte = passaporte;
	}
	
}
