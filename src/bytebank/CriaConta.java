package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		//Instanciando objeto 
		Conta primeiraConta = new Conta();
	
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		//Instanciando novo objeto
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);
		
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.titular);
	}
}
