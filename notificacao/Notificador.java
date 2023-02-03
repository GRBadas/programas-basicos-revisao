package notificacao;

import injecaodependencia.Cliente;

public interface Notificador {
	
	void notificar(Cliente cliente, String mensagem);

}
