package br.com.infsolution.festa.modelo;

public class Tema {
	private String nome;
	private String itens[] = new String[5];
	
	public Tema(String nome,String []itens){
		this.nome=nome;
		for(int i = 0;i < itens.length;i++){
			this.itens[i]=itens[i];
		}
	}
	public String getNome() {
		return this.nome;
	}
	public String getItens(){
		String itens="Itens:\n";
		for(int i=0;i<this.itens.length;i++){
			itens+=this.itens[i]+";\n";
		}
		return itens+"\n";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String saida="Tema: "+this.nome+"\nItens do Tema:\n";
		if(this.itens.length>0){
		for(int i=0;i<this.itens.length;i++){
			saida+=this.itens[i]+"\n";
		}};
		return saida;
	}
}
