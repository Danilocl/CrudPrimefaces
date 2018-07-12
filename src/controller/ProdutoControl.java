package controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.ProdutoDao;
import model.Produto;

@ManagedBean
@SessionScoped
public class ProdutoControl implements Serializable {

	/**
	 * This is a default serial version.
	 */
	private static final long serialVersionUID = 1L;

	private Produto produto;
	private ProdutoDao pDAO = new ProdutoDao();
	
	public void salvarProduto() {
		pDAO.insertProduto(this.produto);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
