package com.drools.sample.model;

public class Fornecedor {
	
	private String nome;
    private double preco;
    private int qualidade;
    private int prazoEntrega;
    private double reputacao;
    private int capacidadeAtendimento;
    private int pontuacao = 0;
    
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

	public int getPrazoEntrega() {
		return prazoEntrega;
	}

	public void setPrazoEntrega(int prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}

	public double getReputacao() {
		return reputacao;
	}

	public void setReputacao(double reputacao) {
		this.reputacao = reputacao;
	}

	public int getCapacidadeAtendimento() {
		return capacidadeAtendimento;
	}

	public void setCapacidadeAtendimento(int capacidadeAtendimento) {
		this.capacidadeAtendimento = capacidadeAtendimento;
	}
	
	public int getPontuacao() {
		return pontuacao;
	}

    public void setPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }
}
