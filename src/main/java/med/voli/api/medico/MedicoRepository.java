package med.voli.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository do Spring que já possui vários métodos prontos, como: save(), findById(), findAll(), deleteById(), entre outros.
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
//Também é possível implementar outras funcionalidade caso necessário.
