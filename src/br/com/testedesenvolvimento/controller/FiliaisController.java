/**
 * 
 */
package br.com.testedesenvolvimento.controller;

import br.com.testedesenvolvimento.dao.*;
import br.com.testedesenvolvimento.dao.FiliaisDao;
import br.com.testedesenvolvimento.dao.FiliaisDaoImp;
import br.com.testedesenvolvimento.model.*;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
/**
 * @author VictorSampaio
 *
 */

@ManagedBean
@SessionScoped
public class FiliaisController {

	private Filiais filiais;
	private DataModel listaFiliais;
	 
	public DataModel getListarFiliais() {
	List<filiais> lista = new FiliaisDaoImp().list();
	listaFiliais = new ListDataModel(lista);
	return listaFiliais;
	}
	public Filiais getFiliais() {
	return filiais;
	}
	public void setFiliais(Filiais filiais) {
	this.filiais = filiais;
	}
	public String prepararAdicionarFiliais(){
	filiais = new Filiais();
	return "gerenciarFiliais";
	}
	public String prepararAlterarFiliais(){
	filiais = (Filiais)(listaFiliais.getRowData());
	return "gerenciarLivro";
	}
	public String excluirFiliais(){
	Filiais filiaisTemp = (Filiais)(listaFiliais.getRowData());
	FiliaisDao dao = new FiliaisDaoImp();
	dao.remove(filiaisTemp);
	return "index";
	}
	public String adicionarFiliais(){
	FiliaisDao dao = new FiliaisDaoImp();
	dao.save(filiais);
	return "index";
	}
	public String alterarFiliais(){
	FiliaisDao dao = new FiliaisDaoImp();
	dao.update(filiais);
	return "index";
	}
	

}
