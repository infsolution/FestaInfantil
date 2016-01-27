package br.com.infsolution.festa.modelo;

public class Aluguel {
	private Endereco endereco = new Endereco();
	private String data;
	private String horaInicio;
	private String horaTermino;
	private Tema tema;
	private String []itens = new String[5];
	private boolean comDesconto= false;
	private double valor;

public void setTema(String nomeTema,String []itens){
	this.tema=new Tema(nomeTema,itens);
}	
public String getTema(){
	return "Tema:\n"+this.tema.getNome()+"\n"+this.tema.getItens();
}
public void setEndereco(String rua,String numero,String bairro,String cidade,String estado ){
	this.endereco.setRua(rua);
	this.endereco.setNumero(numero);
	this.endereco.setBairro(bairro);
	this.endereco.setCidade(cidade);
	this.endereco.setEstado(estado);
} 

public void setComDesconto(int sim){
	if(sim==1)
		this.comDesconto=true;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public String getHoraInicio() {
	return horaInicio;
}
public void setHoraInicio(String horaInicio) {
	this.horaInicio = horaInicio;
}
public String getHoraTermino() {
	return horaTermino;
}
public void setHoraTermino(String horaTermino) {
	this.horaTermino = horaTermino;
}
public double getValor() {
	if(this.comDesconto==true)
		this.valor-=this.valor*0.01;
	return this.valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
public Aluguel(double valor){
	this.valor=valor;
}


@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Dados da festa:\n"+this.endereco.toString()+"\nData: "+getData()+" Hora de inicio: "
			+ ""+getHoraInicio()+" Hora do Encerramento: "+getHoraTermino()
			+"\nValor do aluguel: "+getValor();
}


}
