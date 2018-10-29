package br.com.padroes.adapter.classAdapter.models;

import br.com.padroes.adapter.classAdapter.interfaces.Alvo;

public class Adaptador extends ClasseExistente  implements Alvo {

	public Adaptador() {
		super();
	}
	
	@Override
	public void operacao() {
		metodoUtil();		
	}

}
