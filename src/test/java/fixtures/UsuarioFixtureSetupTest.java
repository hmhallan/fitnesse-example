package fixtures;

import fitlibrary.SetUpFixture;
import interfaces.IMercadoLeilao;
import modelo.MercadoLeilao;

public class UsuarioFixtureSetupTest extends SetUpFixture {

	private static IMercadoLeilao mercado;
	
	public UsuarioFixtureSetupTest() throws Exception {
		super();
	}
	
	public void nomeEnderecoEmailCpf(String nome, String endereco, String email, String cpf) {
		mercado = new MercadoLeilao();
		try {
			mercado.cadastrarUsuario(nome, endereco, email, cpf);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public static IMercadoLeilao getMercado() {
		return mercado;
	}
	
}
