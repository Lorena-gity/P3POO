package entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NotaCompra {
    private Integer numeroNota;
    private LocalDateTime dataHora;
    private Double valorTotal;
    private List<ItemNota> items = new ArrayList<>();

    // Construtores
    public NotaCompra() {}
    
    public NotaCompra(Integer numeroNota, LocalDateTime dataHora, Double valorTotal) {
		super();
		this.numeroNota = numeroNota;
		this.dataHora = dataHora;
		this.valorTotal = valorTotal;
	}


    // Getters e Setters
	public Integer getNumeroNota() {
		return numeroNota;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}
	
	public Double getValorTotal() {
		return valorTotal;
	}
	
	public List<ItemNota> getItems() {
	    return items;
	}
	
    // public void adicionarItem(Produtos produto, double quantidade) {}


    // public boolean cancelarItem(String codigoBarras) {}


    // public boolean trocarItem(String codigoAntigo, Produtos novoProduto, double quantidade) {}


    // public double calcularTotal() {}
   
    public void mostrarNota() {

    }
}