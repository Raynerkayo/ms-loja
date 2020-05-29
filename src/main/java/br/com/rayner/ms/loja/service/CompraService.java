package br.com.rayner.ms.loja.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rayner.ms.loja.client.FornecedorClient;
import br.com.rayner.ms.loja.controller.dto.CompraDTO;
import br.com.rayner.ms.loja.model.Compra;
import br.com.rayner.ms.loja.model.dto.InfoFornecedorDTO;
import br.com.rayner.ms.loja.model.dto.InfoPedidoDTO;

@Service
public class CompraService {

	private static final Logger LOG = LoggerFactory.getLogger(CompraService.class);
	
	@Autowired
	private FornecedorClient client;

	public Compra realizarCompra(CompraDTO compra) {

		final String estado = compra.getEndereco().getEstado();
		
		LOG.info("Buscando informações de fornecedores do estado do: {}", estado);
		InfoFornecedorDTO infoPorEstado = client.getInfoPorEstado(estado);

		LOG.info("Realizando um pedido." + infoPorEstado);
		InfoPedidoDTO pedido = client.realizaPedido(compra.getItens());

		Compra compraSalva = new Compra();
		compraSalva.setPedidoId(pedido.getId());
		compraSalva.setTempoDePreparo(pedido.getTempoDePreparo());
		compraSalva.setEnderecoDeDestino(compra.getEndereco().toString());
		compraSalva.setStatus(pedido.getStatus());

		return compraSalva;
	}

}
