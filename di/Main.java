package di;

import injecaodependencia.Cliente;
import service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		Cliente badas = new Cliente("Badas", "badas@gmail.com", "99999-9999");
		Cliente gabriel = new Cliente("Gabriel", "gabriel@gmail.com", "99999-9998");
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService();
		ativacaoCliente.ativar(badas);
		ativacaoCliente.ativar(gabriel);
	}
	
	

}
