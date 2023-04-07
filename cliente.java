package trabalhoAssociacaoObjetos;

public class cliente {

	private int nascimento;
	private double cpf;
	private String nome;
	private String email;
	private Conta conta;
	private endereco end;
	
	public cliente(double cpf, int nascimento, String nome, String email, int numero, double saldo) {
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.conta = new Conta (numero, saldo);
	}
	
	public cliente(double cpf, int nascimento, String nome, String email) {
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public cliente() {
		super();
	}

	public endereco getEnd() {
		return end;
	}

	public void setEnd(endereco end) {
		this.end = end;
	}

	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "cliente [nascimento=" + nascimento + ", cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", conta="
				+ conta + ", end=" + end + "]";
	}
	
	//public Conta setConta(Conta[] conta){
		//this.conta = conta;
	//}
	
}
