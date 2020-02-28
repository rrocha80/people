package br.com.peopleregisted.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "nome", nullable = false)
	@NotNull(message = "O campo NOME não pode ser vazio")
	private String nome;

	@Column(name = "sexo")
	private String sexo;

	@Column(name = "email")
	private String email;

	@Column(name = "data_nascimento", nullable = false)
	@NotNull(message = "O campo DATA DE NASCIMENTO não pode ser vazia")
	@JsonFormat(pattern = "YYYY-MM-dd")
	private Date dataNascimento;

	@Column(name = "naturalidade")
	private String naturalidade;

	@Column(name = "nacionalidade")
	private String nacionalidade;

	@Column(name = "cpf")
	@NotNull(message = "O campo CPF não pode ser vazia")
	private String cpf;

	@Column(name = "data_cadastro")
	@JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
	private Date dataCadastro;

	@Column(name = "data_atualizacao")
	@JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
	private Date dataAtualizacao;

	// Get and Set

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}


}
