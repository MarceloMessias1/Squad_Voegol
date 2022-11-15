package steps;

import java.io.IOException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Login;

public class LoginTeste {

	Login login = new Login();

	@Dado("que esteja na home e clicar em login")
	public void que_esteja_na_home_e_clicar_em_login() {

		login.clicarLogin();

	}

	@Quando("colocar dados validos")
	public void colocar_dados_validos() {
		login.email();
		login.senha();

	}

	@Entao("valido login")
	public void valido_login() throws IOException {

		login.validarLogin();
		login.screenShot();
		
	}
}
