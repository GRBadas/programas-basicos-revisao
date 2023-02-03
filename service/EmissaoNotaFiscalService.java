package service;

import injecaodependencia.Cliente;
import injecaodependencia.Produto;
import notificacao.Notificador;

public class EmissaoNotaFiscalService {
	
	private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}



	public void emitir(Cliente cliente, Produto produto) {
		//emite nota fiscal aqui...
		
		notificador.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + "foi emitida!");
	}

}
