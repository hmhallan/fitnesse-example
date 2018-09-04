package fixtures;

import fit.ActionFixture;
import interfaces.IMercadoLeilao;
import modelo.MercadoLeilao;

public class MercadoActionFixtureTest extends ActionFixture {

	private IMercadoLeilao mercado = new MercadoLeilao();
	private String nomeUsuario;
	private String enderecoUsuario;;
	private String emailUsuario;
	private String cpfUsuario;
	
	
	public void nome(String nome) {
		this.nomeUsuario = nome;
	}
	public void email(String email) {
		this.emailUsuario = email;
	}
	public void endereco(String endereco) {
		this.enderecoUsuario = endereco;
	}
	public void cpf(String cpf) {
		this.cpfUsuario = cpf;
	}
	
	public  void cadastrarUsuario() throws Exception {
		mercado.cadastrarUsuario(this.nomeUsuario, this.enderecoUsuario, this.emailUsuario, this.cpfUsuario);
	}
	
	public boolean possuiUsuario() {
		return mercado.isPossuiUsuario();
	}
	
}
