package main;

import java.util.ArrayList;
import java.util.List;

public class Corredor  {
	private List<Vaga> vagas ;	
	private int quantidadeVagas;
	private int quantidadeVagasOcupada;
	private int quantidadeVagasDesocupada;
	private int idCorredor;
	
	
	
	public Corredor( int quantidadeVagas, int idCorredor) {
		super();
		this.vagas =  new ArrayList<Vaga>();
		if (quantidadeVagas< 1) {
			throw new IllegalArgumentException("Error: value is negative.");
		}this.quantidadeVagas = quantidadeVagas;
		this.quantidadeVagasOcupada = 0;
		this.quantidadeVagasDesocupada = quantidadeVagas;
		this.idCorredor = idCorredor;
		this.criarVagas();
	}

	public List<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(List<Vaga> vagas) {
		this.vagas = vagas;
	}

	public int getQuantidadeVagas() {
		return this.quantidadeVagas;
	}

	public void setQuantidadeVagas(int quantidadeVagas) {
		this.quantidadeVagas = quantidadeVagas;
	}

	public int getQuantidadeVagasOcupada() {
		return this.quantidadeVagasOcupada;
	}

	public void setQuantidadeVagasOcupada(int quantidadeVagasOcupada) {
		this.quantidadeVagasOcupada = quantidadeVagasOcupada;
	}

	public int getQuantidadeVagasDesocupada() {
		return this.quantidadeVagasDesocupada;
	}

	public void setQuantidadeVagasDesocupada(int quantidadeVagasDesocupada) {
		this.quantidadeVagasDesocupada = quantidadeVagasDesocupada;
	}

	public int getIdCorredor() {
		return idCorredor;
	}

	public void setIdCorredor(int idCorredor) {
		this.idCorredor = idCorredor;
	}
	
	public void criarVagas() {
		for (int i = 0; i < this.getQuantidadeVagas() ; i++) {
			vagas.add(new Vaga(0));
			//get(i).setOcupada(0);
		}
	}
	
	public int contaOcupadas() {
		int ocupada=0;
		for(Vaga vaga: vagas) {
			if (vaga.getOcupada()== 1) {
				ocupada++;
			}
		}
		return ocupada;	
	}
	
	public int contaDesocupadas() {
		int desocupada=0;
		for(Vaga vaga: vagas) {
			if (vaga.getOcupada() == 0) {
				desocupada++;
			}
		}
		return desocupada;	
	}


	
	
	
}
