package br.com.rayner.ms.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rayner.ms.loja.client.FornecedorClient;
import br.com.rayner.ms.loja.controller.dto.CompraDTO;
import br.com.rayner.ms.loja.model.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	@Autowired
	private FornecedorClient client;

	public void realizarCompra(CompraDTO compra) {

		InfoFornecedorDTO infoPorEstado = client.getInfoPorEstado(compra.getEndereco().getEstado());

		System.out.println(infoPorEstado.getEndereco());
	}

}
