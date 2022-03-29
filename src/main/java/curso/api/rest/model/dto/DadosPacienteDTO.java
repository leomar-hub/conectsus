package curso.api.rest.model.dto;

import curso.api.rest.model.Endereco;
import curso.api.rest.model.Telefone;

import java.util.ArrayList;
import java.util.List;

public class DadosPacienteDTO {
    private Long id;
    private String nome;
    private String rg;
    private String cpf;
    private String numNacSus;
    private List<Telefone> telefones = new ArrayList<Telefone>();
    private List<Endereco> enderecos = new ArrayList<Endereco>();

    public DadosPacienteDTO(Long id, String nome, String rg, String cpf, String numNacSus, List<Telefone> telefones, List<Endereco> enderecos) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.numNacSus = numNacSus;
        this.telefones = telefones;
        this.enderecos = enderecos;
    }

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumNacSus() {
        return numNacSus;
    }

    public void setNumNacSus(String numNacSus) {
        this.numNacSus = numNacSus;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
