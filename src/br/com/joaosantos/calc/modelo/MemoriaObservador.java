package br.com.joaosantos.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	public void valorAterado(String novoValor);
}
