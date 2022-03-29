package curso.api.rest.model.dto;

import curso.api.rest.model.Vacina;

import java.util.List;

public class PacientDTO {

    private DadosPacienteDTO dadosPaciente;
    private List<Vacina> vacinas;

    public DadosPacienteDTO getDadosPaciente() {
        return dadosPaciente;
    }

    public void setDadosPaciente(DadosPacienteDTO dadosPaciente) {
        this.dadosPaciente = dadosPaciente;
    }

    public List<Vacina> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<Vacina> vacinas) {
        this.vacinas = vacinas;
    }
}
