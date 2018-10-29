package br.com.padroes.adapter.classAdapter.main;

import br.com.padroes.adapter.classAdapter.interfaces.Alvo;
import br.com.padroes.adapter.classAdapter.models.Adaptador;

public class Main {
	public static void main(String[] args) {
		Alvo alvo = new Adaptador();
		alvo.operacao();
	}
}
