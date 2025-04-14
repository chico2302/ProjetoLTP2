package classes;

import java.util.List;
import java.util.ArrayList;

public abstract class cliente {
	String nome;
	int telefone;
	String email;
	static ArrayList<cliente> clientes = new ArrayList<cliente>();
	
	public cliente(String nome, int telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public void Procurar(String nome){
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).nome.equals(nome)) {
				System.out.println("Cliente encontrado! Nome: " + clientes.get(i).nome + " Telefone: " + clientes.get(i).telefone + " Email: " + clientes.get(i).email);
			}
			}
		}
	}
	


class clienteNacional extends cliente {
	int cpf;
	
	public clienteNacional(String nome,int telefone, String email, int cpf) {
	super(nome,telefone,email);
	this.cpf = cpf;
	}
}

class clienteInternacional extends cliente {
	int passaporte;
	
	public clienteInternacional(String nome,int telefone, String email, int passaporte) {
	super(nome,telefone,email);
	this.passaporte = passaporte;
	}
}
