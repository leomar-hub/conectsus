package curso.api.rest.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String rg;
    private String cpf;
    private String numNacSus;

    @OneToMany(mappedBy = "paciente", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Telefone> telefones = new ArrayList<Telefone>();

    @OneToMany(mappedBy = "paciente", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Endereco> enderecos = new ArrayList<Endereco>();

    @OneToMany(mappedBy = "paciente", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Vacina> vacinas = new ArrayList<Vacina>();

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

    public List<Vacina> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<Vacina> vacinas) {
        this.vacinas = vacinas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return id.equals(paciente.id) && rg.equals(paciente.rg) && cpf.equals(paciente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rg, cpf);
    }
}
