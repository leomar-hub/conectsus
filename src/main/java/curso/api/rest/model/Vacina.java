package curso.api.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Vacina {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String dose;
    private String dataFabricante;
    private String fabricante;
    private String lote;
    private String unidadeSaude;
    private String vacinador;

    @JsonIgnore
    @org.hibernate.annotations.ForeignKey(name = "paciente_id")
    @ManyToOne(optional = false)
    private  Paciente paciente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getDataFabricante() {
        return dataFabricante;
    }

    public void setDataFabricante(String dataFabricante) {
        this.dataFabricante = dataFabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getUnidadeSaude() {
        return unidadeSaude;
    }

    public void setUnidadeSaude(String unidadeSaude) {
        this.unidadeSaude = unidadeSaude;
    }

    public String getVacinador() {
        return vacinador;
    }

    public void setVacinador(String vacinador) {
        this.vacinador = vacinador;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
