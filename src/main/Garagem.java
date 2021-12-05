package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Garagem {
	private List<Andar> andares;
	private int quantidadeAndar;
	private int quantidadeCorredor;
	private int quantidadeVaga;
	private int idEdGaragem;
	private double valorVaga = 10;

	public Garagem(int quantidadeAndar,int idEdGaragem, List<Andar> andares) {
		super();
		this.andares = new ArrayList<Andar>();
		this.quantidadeAndar = quantidadeAndar;		
		this.idEdGaragem = idEdGaragem;
		this.criarGaragem(andares);
	}

	public List<Andar> getAndares() {
		return andares;
	}
	public void setAndares(List<Andar> andares) {
		this.andares = andares;
	}
	public int getQuantidadeAndar() {
		return quantidadeAndar;
	}
	public void setQuantidadeAndar(int quantidadeAndar) {
		this.quantidadeAndar = quantidadeAndar;
	}
	public int getQuantidadeCorredor() {
		return quantidadeCorredor;
	}
	public void setQuantidadeCorredor(int quantidadeCorredor) {
		this.quantidadeCorredor = quantidadeCorredor;
	}
	public int getQuantidadeVaga() {
		return quantidadeVaga;
	}
	public void setQuantidadeVaga(int quantidadeVaga) {
		this.quantidadeVaga = quantidadeVaga;
	}

	private void criarGaragem(List<Andar> andares) {
		this.andares = andares;
	}

	public int andarMaisLivre() {
		int maisLivre = 0;
		for (Andar andar : andares) {
			if (andar.vagasDesocupadas() > maisLivre) {
				maisLivre = andar.getIdAndar();
			}
		}
		return maisLivre;
	}
	
	public List<Andar> ordenarAndaresLivres(){	
		List<Andar> andaresOrganizados = new ArrayList<Andar>();
		andares.sort(Comparator.comparing(Andar::vagasDesocupadas));
		for (int i = 0; i < this.getQuantidadeAndar() ; i++) {			
			andaresOrganizados.add(andares.get(i));
		}		
		return andaresOrganizados;
	}
	
	public int totalArrecadado() {
		int contOcupado = 0;
		for (Andar andar : andares) {
			contOcupado += andar.vagasOcupadas();
		}
		return contOcupado;		
		}
	}
	
	
	
	

	

