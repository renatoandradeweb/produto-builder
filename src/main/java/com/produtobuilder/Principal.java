package com.produtobuilder;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
    	Produto produto = new Produto.Builder("Smartphone", 1450.99, LocalDate.now(), LocalDate.now(), "Eletrônicos")
    			.id(123)
    			.descricao("O mais recente modelo da Samsung")
		        .modelo("Galaxy S22")
		        .marca("Samsung")
		        .profundidade(14)
		        .largura(14)
		        .altura(14)
		        .peso(16)
		        .estoque(100)
		        .preco(3999.99)
		        .dataCadastro(LocalDate.now())
		        .dataUltimaAtualizacao(LocalDate.now())
		        .urlFoto("https://www.example.com/produto123.jpg")
		        .build();
    	
        System.out.println(produto.toString());
    }
}
