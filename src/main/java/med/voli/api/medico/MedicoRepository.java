package med.voli.api.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//JpaRepository do Spring que já possui vários métodos prontos, como: save(), findById(), findAll(), deleteById(), entre outros.
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
//Também é possível implementar outras funcionalidade caso necessário.
