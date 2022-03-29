package curso.api.rest.repository;

import curso.api.rest.model.Paciente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Long> {

    @Query("select u from Usuario u where u.login = ?1")
    Paciente findUserByLogin(String login);

}
