package service;

import injecaodependencia.Cliente;
import notificacao.NotificadorEmail;

public class AtivacaoClienteService {
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		NotificadorEmail notificador = new NotificadorEmail();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
	

}
