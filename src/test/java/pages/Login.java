package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.MetodosDeTestes;

public class Login {

	MetodosDeTestes metodos = new MetodosDeTestes();
	Elementos el = new Elementos();

	public void clicarLogin() {
		metodos.pausa(5);
		metodos.clicar(el.login);

	}

	public void email() {
		metodos.pausa(5);
		metodos.escrever(el.email, "cheroxmiller@gmail.com");

	}

	public void senha() {
		metodos.escrever(el.senha, "Ch3rinh@");
	}

	public void entrar() {
		// metodos.esperarElemento(null);
		// metodos.pausa(5);
		// metodos.clicar(el.entrar);

	}

	public void validarLogin() {
		metodos.pausa(5);
		metodos.validarLogin(el.validarLogin, "LOGIN");
	}

	public void screenShot() throws IOException {
		metodos.pausa(5);
		metodos.salvarScreenShot(" Login com sucesso ");
	}

}
