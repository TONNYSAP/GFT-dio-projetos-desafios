package main;

//import classes.Banco;
import classes.Cliente;
import classes.Conta;
import classes.ContaCorrente;
import classes.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		//Banco b = new Banco();
		//b.setNome("Santander");	

		Cliente antonio = new Cliente();
		antonio.setNome("Antonio Veras");
		antonio.setCpf("889.912.322-12");
		
		Conta cc = new ContaCorrente(antonio);
		Conta cp = new ContaPoupanca(antonio);
		
		cc.setBanco("Santander");
		cp.setBanco("Santander");
		
		cc.depositar(3000);
		cc.transferir(1000, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		
		
	}

}
