package br.com.vainaweb.backend.classeabstrata;

public class App {

	public static void main(String[] args) {
		
		DevBackEnd devJunior = new DevBackEnd("Hamom", "9876", "8547", "11/03/2000", 20, 5000, "Lógica", "Pleno");
		DevFrontEnd devFrontJunior = new DevFrontEnd("Thalia", "1234", "6589", "11/02/2000", 23, 2000, "UX/UI", "Junior");
		Designer designer = new Designer("Vanessa", "4567", "6516", "11/01/2000", 19, 3000, "Criatividade");
		Gerente gerente = new Gerente("João Pedro Belo", "6543", "6468", "11/12/2001", 12, 7000, "Liderança");
	
	}
}
