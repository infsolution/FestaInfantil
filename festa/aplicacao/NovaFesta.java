package br.com.infsolution.festa.aplicacao;
import br.com.infsolution.festa.modelo.*;
public class NovaFesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []itens = {"Mesas","Cadeiras","Toalhas","Enfeites","Buffet"};
		Cliente newCliente = new Cliente("Cicero","8869-8580");
		Aluguel festa = new Aluguel(123.90);
		newCliente.setEndereco("Rua 103","489","PQ uniao");
		festa.setTema("Be10",itens);
		festa.setTema("Branca de neve", itens);
		festa.setEndereco("Rua 90", "1234", "Flores","Timon","MA");
		festa.setData("25/12/2016");
		festa.setHoraInicio("19:00hrs");
		festa.setHoraTermino("05:00hrs");		
		festa.setComDesconto(1);
		System.out.println(newCliente.toString());
		System.out.println(festa.toString());
		System.out.println(festa.getTema());

	}

}
