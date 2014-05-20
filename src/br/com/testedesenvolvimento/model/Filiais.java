/**
 * 
 */
package br.com.testedesenvolvimento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;

/**
 * @author VictorSampaio
 * 
 */
@Entity
public class Filiais {
	// Filiais (Id, Razão Social, Nome Fantasia, CNPJ e Telefone)
	// Identification filial
	@SequenceGenerator(name = "seq", allocationSize = 1, sequenceName = "seq_filiais")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(name = "id_filiais")
	@Id
	private Integer id;

	@GeneratedValue
	private String razaoSocial;
	private String nomeFantasia;
	private int cnpj;
	private String telefone;

	public Filiais() {

	}

	public Filiais(int id, String razaoSocial, String nomeFantasia, int cnpj,
			String telefone) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.telefone = telefone;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
