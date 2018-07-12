package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.ProdutoDao;
import model.Produto;

@ManagedBean
@ViewScoped
public class ListProdutoControl implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Produto> produtos = new ArrayList<Produto>();
	private ProdutoDao pDAO = new ProdutoDao();
	private Produto produto = new Produto();
	
	@PostConstruct
	public void init() {
		produtos = pDAO.selectProduto();
	}
	
	public void removerProd() {
		pDAO.deletProduto(produto);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
