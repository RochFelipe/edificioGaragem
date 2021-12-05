package main;

import java.util.ArrayList;
import java.util.List;

public class Andar {
	private List<Corredor> corredores;
	private int quantidadeCorredor;
	private int idAndar;
	private String andarOcupado;

	public Andar(int quantidadeCorredor, int idAndar, List<Corredor> corredores) {

		this.corredores = new ArrayList<Corredor>();
		this.quantidadeCorredor = quantidadeCorredor;
		this.idAndar = idAndar;
		this.criarCorredores(corredores);

	}

	public List<Corredor> getCorredores() {
		return corredores;
	}

	public void setCorredores(List<Corredor> corredores) {
		this.corredores = corredores;
	}

	public int getQuantidadeCorredor() {
		return quantidadeCorredor;
	}

	public void setQuantidadeCorredor(int quantidadeCorredor) {
		this.quantidadeCorredor = quantidadeCorredor;
	}

	public int getIdAndar() {
		return idAndar;
	}

	public void setIdAndar(int idAndar) {
		this.idAndar = idAndar;
	}	

	private void criarCorredores(List<Corredor> corredores) {
		this.corredores = corredores;
	}

	public int vagasDesocupadas() {
		int desocupada = 0;
		for (Corredor corredor : corredores) {
			desocupada += corredor.contaDesocupadas();
		}
		return desocupada;
	}
	
	public int vagasOcupadas() {
		int ocupadas = 0;
		for (Corredor corredor : corredores) {
			ocupadas += corredor.contaOcupadas();
		}
		return ocupadas;
	}
	

}
