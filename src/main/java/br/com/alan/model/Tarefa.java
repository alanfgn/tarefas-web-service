package br.com.alan.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * @author Alan
 */

@XmlRootElement
@Entity(name = "tb_tarefas")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tar_id")
	private Integer id;

	@Column(name = "tar_nome", nullable = false)
	private String nome;
	
	@Lob
	@Column(name = "tar_descricao", nullable = false)
	private String descricao;

	// A partir do java 8 a anotação @Temporal é dispensável Tipos do java.time
	@Column(name = "tar_data_criacao", nullable = false)
	private LocalDateTime dataCriacao;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tar_status", nullable = false)
	private EnumStatusTarefa status;

	public Tarefa() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public EnumStatusTarefa getStatus() {
		return status;
	}

	public void setStatus(EnumStatusTarefa status) {
		this.status = status;
	}

}
