package br.pro.trajano.drogaria.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(length = 50, nullable = false, unique = true)
	private String nome;
	
	@Column(nullable = false)
	private int quantidade;
	
	@Column(nullable = false)
	private double preco;
	
	@Column
	private LocalDate dataDeValidade;

	public Produto(int i, String nome, int j, double d, LocalDate dataDeValidade) {
		super();
		this.codigo = i;
		this.nome = nome;
		this.quantidade = j;
		this.preco = d;
		this.dataDeValidade = dataDeValidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(Short codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public LocalDate getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(LocalDate dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((dataDeValidade == null) ? 0 : dataDeValidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantidade;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo != other.codigo)
			return false;
		if (dataDeValidade == null) {
			if (other.dataDeValidade != null)
				return false;
		} else if (!dataDeValidade.equals(other.dataDeValidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		if (quantidade != other.quantidade)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco
				+ ", dataDeValidade=" + dataDeValidade + "]";
	}

	
	

	
}
