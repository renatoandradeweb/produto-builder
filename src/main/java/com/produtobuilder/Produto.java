package com.produtobuilder;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Produto {
	private long id;
	private String titulo;
	private String descricao;
	private String marca;
	private String modelo;
	private int estoque;
	private double preco;
	private LocalDate dataCadastro;
	private LocalDate dataUltimaAtualizacao;
	private String urlFoto;
	private String categoria;
	private double peso;
	private double altura;
	private double largura;
	private double profundidade;

	private Produto(Builder builder) {
		id = builder.id;
		titulo = builder.titulo;
		descricao = builder.descricao;
		marca = builder.marca;
		modelo = builder.modelo;
		estoque = builder.estoque;
		preco = builder.preco;
		dataCadastro = builder.dataCadastro;
		dataUltimaAtualizacao = builder.dataUltimaAtualizacao;
		urlFoto = builder.urlFoto;
		categoria = builder.categoria;
		peso = builder.peso;
		altura = builder.altura;
		largura = builder.largura;
		profundidade = builder.profundidade;
	}

	public static class Builder {
		private long id;
		private String titulo;
		private String descricao;
		private String marca;
		private String modelo;
		private int estoque;
		private double preco;
		private LocalDate dataCadastro;
		private LocalDate dataUltimaAtualizacao;
		private String urlFoto;
		private String categoria;
		private double peso;
		private double altura;
		private double largura;
		private double profundidade;

		public Builder(String titulo, double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, String categoria) {
			this.titulo = titulo;
			this.preco = preco;
			this.dataCadastro = dataCadastro;
			this.dataUltimaAtualizacao = dataUltimaAtualizacao;
			this.categoria = categoria;
		}
		
		public Builder id(long id) {
			this.id = id;
			return this;
		}
		
		public Builder descricao(String descricao) {
			this.descricao = descricao;
			return this;
		}

		public Builder modelo(String modelo) {
			this.modelo = modelo;
			return this;
		}
		
		public Builder marca(String marca) {
			this.marca = marca;
			return this;
		}
		
		public Builder estoque(int estoque) {
			this.estoque = estoque;
			return this;
		}

		public Builder preco(double preco) {
			this.preco = preco;
			return this;
		}

		public Builder dataCadastro(LocalDate dataCadastro) {
			this.dataCadastro = dataCadastro;
			return this;
		}

		public Builder dataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
			this.dataUltimaAtualizacao = dataUltimaAtualizacao;
			return this;
		}

		public Builder urlFoto(String urlFoto) {
			this.urlFoto = urlFoto;
			return this;
		}

		public Builder categoria(String categoria) {
			this.categoria = categoria;
			return this;
		}

		public Builder peso(double peso) {
			this.peso = peso;
			return this;
		}

		public Builder altura(double altura) {
			this.altura = altura;
			return this;
		}

		public Builder largura(double largura) {
			this.largura = largura;
			return this;
		}

		public Builder profundidade(double profundidade) {
			this.profundidade = profundidade;
			return this;
		}

		public Produto build() {
			return new Produto(this);
		}
	}

}
