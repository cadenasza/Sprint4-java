package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Endereco;
import br.com.fiap.service.ViaCepService;

public class TesteApi {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	public static void main(String[] args) throws ClientProtocolException, IOException {

		ViaCepService viaCepService = new ViaCepService(); 

		String cep = texto("Digite um cep: ");

		Endereco endereco = viaCepService.getEndereco(cep); 

		if (endereco != null) {
			System.out.println(endereco.toString());
		} else {
			System.out.println("O cep solicitado não pode ser encontrado!!");;
		}
	}

}

