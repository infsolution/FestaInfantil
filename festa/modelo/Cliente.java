package br.com.infsolution.festa.modelo;

public class Cliente {
private String nome;
private String fone;
private Endereco endereco = new Endereco();

public Cliente(String nome, String fone){
	this.nome=nome;
	this.fone=fone;
}

public void setEndereco(String rua,String numero,String bairro ){
	this.endereco.setRua(rua);
	this.endereco.setNumero(numero);
		this.endereco.setBairro(bairro);
} 


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getFone() {
	return fone;
}

public void setFone(String fone) {
	this.fone = fone;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: "+this.nome+"\nEndereco: "+this.endereco.getRua()
		+"\n"+this.endereco.getNumero()+"\n"+this.endereco.getBairro();
	}


public Endereco getEndereco() {
	return endereco;
}

}


