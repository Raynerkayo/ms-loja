package br.com.rayner.ms.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.rayner.ms.loja.controller.dto.CompraDTO;
import br.com.rayner.ms.loja.model.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	public void realizarCompra(CompraDTO compra) {

		RestTemplate client = new RestTemplate();
		ResponseEntity<InfoFornecedorDTO> exchange = client.exchange(
				"http://localhost:8081/info/" + compra.getEndereco().getEstado(), HttpMethod.GET, null,
				InfoFornecedorDTO.class);

		System.out.println(exchange.getBody().getEndereco());
		
	}

}
