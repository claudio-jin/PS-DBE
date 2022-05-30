package br.com.fiap.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visitante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVisitante; //ok
	private String nomeVisitante; //ok
	private LocalDate dtNasc;
	private String cpf;
	private String rg;
	private String digitoRg;
	private LocalDate dtCadastro;
	private String imagePath;

	
	public Long getIdVisitante() {
		return idVisitante;
	}
	public void setIdVisitante(Long idVisitante) {
		this.idVisitante = idVisitante;
	}
	public String getNomeVisitante() {
		return nomeVisitante;
	}
	public void setNomeVisitante(String nomeVisitante) {
		this.nomeVisitante = nomeVisitante;
	}
	public LocalDate getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(LocalDate dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDigitoRg() {
		return digitoRg;
	}
	public void setDigitoRg(String digitoRg) {
		this.digitoRg = digitoRg;
	}
	public LocalDate getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(LocalDate dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	@Override
	public String toString() {
		return "Visitante [idVisitante=" + idVisitante + ", nomeVisitante=" + nomeVisitante + ", dtNasc=" + dtNasc
				+ ", cpf=" + cpf + ", rg=" + rg + ", DigitoRg=" + digitoRg + ", dtCadastro=" + dtCadastro
				+ ", imagePath=" + imagePath + "]";
	}
	
	
	
}
