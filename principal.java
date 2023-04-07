package trabalhoAssociacaoObjetos;
import java.util.Scanner;
public class principal {

	public static void main (String [] args) {
		Scanner read = new Scanner(System.in);
		
		cliente cliente1 = new cliente(2312302, 1985, "Ana Maria Marques", "aninha@gmail.com", 151, 1423.12);
		endereco end1 = new endereco("huberto", 133, "capao raso", "1523532-1", "curitiba", "parana");
		cliente1.setEnd(end1);
		System.out.println(cliente1.toString());
		
		cliente cliente2 = new cliente(2312, 185, "Marques", "ndsad@gmail.com", 151, 1423.12);
		endereco end2 = new endereco("huberto", 133, "Bacasacheri", "1523532-1", "curitiba", "parana");
		cliente2.setEnd(end2);
		System.out.println(cliente2.toString());
		
		cliente cliente3 = new cliente(2312, 185, "Marques", "ndsad@gmail.com");
		Conta conta3 = new Conta(1321, 3213.2);
		cliente3.setConta(conta3);
		endereco end3 = new endereco("huberto", 133, "Bacasacheri", "1523532-1", "curitiba", "parana");
		cliente3.setEnd(end3);
		System.out.println(cliente3.toString());
		
		//Conta conta4[2] = new Conta(3213, 3214);
		
		read.close();
	}
}
