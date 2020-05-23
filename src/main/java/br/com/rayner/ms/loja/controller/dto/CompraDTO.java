package br.com.rayner.ms.loja.controller.dto;

import java.util.List;

import br.com.rayner.ms.loja.model.dto.EnderecoDTO;
import br.com.rayner.ms.loja.model.dto.ItemDaCompraDTO;

public class CompraDTO {

	private List<ItemDaCompraDTO> itens;
	
	private EnderecoDTO endereco;

	public List<ItemDaCompraDTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaCompraDTO> itens) {
		this.itens = itens;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
}
