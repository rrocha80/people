package br.com.peopleregisted.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import br.com.peopleregisted.model.Pessoa;
import br.com.peopleregisted.repository.PessoaRepository;

@Named
@ViewScoped
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;

	private List<Pessoa> pessoaList;
	private Pessoa pessoa = new Pessoa();
	private boolean modoEdicao = false;

	@PostConstruct
	public void init() {
		setPessoaList(pessoaRepository.findAll());
	}

	public void salvar() {
		if (pessoa.getDataAtualizacao() != null) {
			pessoa.setDataCadastro(new Date());
		}
		pessoaRepository.save(pessoa);

		if (!isModoEdicao()) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Registro salvo com sucesso!"));
			pessoaList.add(pessoa);
		}
		pessoa = new Pessoa();
		setModoEdicao(false);
	}

	public void buscar() {
		if (pessoa.getCpf().replace(".", "").replace("-", "") == "") {
			init();
		} else {
			Example<Pessoa> pessoaBuscarList = Example.of(pessoa);
			setPessoaList(pessoaRepository.findAll(pessoaBuscarList));
		}
	}

	public void excluir(Pessoa pessoa) {
		pessoaRepository.delete((long) pessoa.getId());
		pessoaList.remove(pessoa);
	}

	public void editar(Pessoa pessoa) throws IOException {
		pessoa.setDataAtualizacao(new Date());
		setPessoa(pessoa);
		setModoEdicao(true);

	}

	public void cancelar() {
		pessoa = new Pessoa();
		setModoEdicao(false);
	}

	public List<Pessoa> getPessoaList() {
		return pessoaList;
	}

	public void setPessoaList(List<Pessoa> pessoaList) {
		this.pessoaList = pessoaList;
	}

	public boolean isModoEdicao() {
		return modoEdicao;
	}

	public void setModoEdicao(boolean modoEdicao) {
		this.modoEdicao = modoEdicao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
