package br.com.rayner.ms.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.rayner.ms.loja.controller.dto.CompraDTO;
import br.com.rayner.ms.loja.model.dto.InfoFornecedorDTO;

@Service
public class CompraService {
	
	@Autowired
	private RestTemplate restTemplate;

	public void realizarCompra(CompraDTO compra) {

		ResponseEntity<InfoFornecedorDTO> exchange = restTemplate.exchange(
				"http://fornecedor/fornecedor/info/" + compra.getEndereco().getEstado(), HttpMethod.GET, null,
				InfoFornecedorDTO.class);

		System.out.println(exchange.getBody().getEndereco());
		
	}

}
