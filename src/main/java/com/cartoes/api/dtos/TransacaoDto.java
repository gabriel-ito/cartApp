package com.cartoes.api.dtos;

import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

public class TransacaoDto {

	private String id;

	@NotEmpty(message = "CNPJ não pode ser vazio.")
	@CNPJ(message = "CNPJ inválido.")
	@Length(min = 14, max = 14, message = "CNPJ deve conter 14 caracteres.")
	private String cnpj;

	@NotEmpty(message = "Valor não pode ser vazio.")
	@Length(min = 1, max = 10, message = "Valor deve conter até 10 caracteres numéricos.")
	private String valor;

	@NotEmpty(message = "Quantidade de parcelas não pode ser vazio.")
	@Length(min = 1, max = 2, message = "Parcelas deve conter até 2 caracteres numéricos.")
	private String qdtParcelas;

	@NotEmpty(message = "Juros não pode ser vazio.")
	@Length(min = 1, max = 4, message = "Juros deve conter até 4 caracteres numéricos.")
	private String juros;
	
	@NotEmpty(message = "O numero do cartão não pode ser vazio.")
	private String cartaoNumero;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getQdtParcelas() {
		return qdtParcelas;
	}

	public void setQdtParcelas(String qdtParcelas) {
		this.qdtParcelas = qdtParcelas;
	}

	public String getJuros() {
		return juros;
	}

	public void setJuros(String juros) {
		this.juros = juros;
	}
	
	public String getCartaoNumero() {
		return cartaoNumero;
	}

	public void setCartaoNumero(String cartaoNumero) {
		this.cartaoNumero = cartaoNumero;
	}

	@Override
	public String toString() {
		return "TransacaoDto [id=" + id + "," + "cnpj=" + cnpj + "," + "valor=" + valor
		+ "," + "qdtParcelas=" + qdtParcelas + "," + "juros=" + juros + "," + "cartaoNumero=" + cartaoNumero + "]";
	}

}
