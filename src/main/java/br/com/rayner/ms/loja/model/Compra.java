package br.com.rayner.ms.loja.model;

public class Compra {

	private Long pedidoId;

	private Integer tempoDePreparo;

	private String enderecoDeDestino;
	
	private String status;
	
	private Integer quantidadeDeItens;

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public void setQuantidadeDeItens(int quantidadeDeItens) {
		this.quantidadeDeItens = quantidadeDeItens;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public String getEnderecoDeDestino() {
		return enderecoDeDestino;
	}

	public void setEnderecoDeDestino(String enderecoDeDestino) {
		this.enderecoDeDestino = enderecoDeDestino;
	}

}
