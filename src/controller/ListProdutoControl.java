package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

	List<Produto> produtos = new ArrayList<Produto>();
	ProdutoDao pDAO = new ProdutoDao();
	Produto produto = new Produto();
	
}
