package fixtures;

import fit.ColumnFixture;
import interfaces.IMercadoLeilao;
import interfaces.IUsuario;
import modelo.MercadoLeilao;

public class UsuarioColumnFixtureTest extends ColumnFixture {
	
	private String nome, endereco, email, cpf;
	
	public boolean cadastrarUsuario(){
		try {
			UsuarioFixtureSetupTest.getMercado().cadastrarUsuario(nome, endereco, email, cpf);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean verificarUsuarioExiste()  {
		try {
			IUsuario user = UsuarioFixtureSetupTest.getMercado().getUsuarioPor(cpf);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
