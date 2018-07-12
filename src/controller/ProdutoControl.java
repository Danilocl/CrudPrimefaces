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

	private Produto produto = new Produto();
	private ProdutoDao pDAO = new ProdutoDao();
	
}
