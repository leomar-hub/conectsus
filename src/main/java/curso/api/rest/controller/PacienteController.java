package curso.api.rest.controller;

import curso.api.rest.model.Endereco;
import curso.api.rest.model.Paciente;
import curso.api.rest.model.dto.DadosPacienteDTO;
import curso.api.rest.model.dto.PacientDTO;
import curso.api.rest.repository.PacienteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;


@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;
    private Endereco endereco;

    @GetMapping(value = "/id/{id}", produces = "application/json")
    public ResponseEntity init(@PathVariable(value = "id") Long id) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        return new ResponseEntity(Map.of("dadosPaciente", paciente.get()), HttpStatus.OK);
    }

    /*@GetMapping(value = "/listatodos", produces = "application/json")
    public ResponseEntity<List<Paciente>> paciente (){
        List<Paciente> list = (List<Paciente>) pacienteRepository.findAll();
        return new ResponseEntity(Map.of("vacinasCovid", Map.of("dadosPaciente", list)), HttpStatus.OK);
    }*/

    @GetMapping(value = "/listatodos", produces = "application/json")
    public ResponseEntity<List<Paciente>> paciente() {
        var lista = new ArrayList<PacientDTO>();
        var list = (List<Paciente>) pacienteRepository.findAll();

        list.forEach(element -> {
            var dadosPaciente = new DadosPacienteDTO(element.getId(), element.getNome(), element.getRg(), element.getCpf(),
                    element.getNumNacSus(), element.getTelefones(), element.getEnderecos());

            var pacientDTO = new PacientDTO();
            BeanUtils.copyProperties(element, pacientDTO);
            pacientDTO.setDadosPaciente(dadosPaciente);
            lista.add(pacientDTO);
        });

        return new ResponseEntity(Map.of("pacientes", lista), HttpStatus.OK);
    }

}
