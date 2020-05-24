package br.com.rayner.ms.loja.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rayner.ms.loja.model.dto.InfoFornecedorDTO;

@FeignClient("fornecedor")
public interface FornecedorClient {

	@RequestMapping("/info/{estado}")
	InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);
	
}
