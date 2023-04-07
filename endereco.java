package trabalhoAssociacaoObjetos;

public class endereco {

	private String rua;
	private int numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
	public endereco(String rua, int numero, String bairro, String cep, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	public endereco() {

	}
				public String getRua() {
					return rua;
				}
				public void setRua(String rua) {
					this.rua = rua;
				}
				public int getNumero() {
					return numero;
				}
				public void setNumero(int numero) {
					this.numero = numero;
				}
				public String getBairro() {
					return bairro;
				}
				public void setBairro(String bairro) {
					this.bairro = bairro;
				}
				public String getCep() {
					return cep;
				}
				public void setCep(String cep) {
					this.cep = cep;
				}
				public String getCidade() {
					return cidade; 
				}
				public void setCidade(String cidade) {
					this.cidade = cidade;
				}
				public String getEstado() {
					return estado;
				}
				public void setEstado(String estado) {
					this.estado = estado;
				}
				
	public String toString() {
		return "cliente [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + "]";
	}
	
	
	
	
}
