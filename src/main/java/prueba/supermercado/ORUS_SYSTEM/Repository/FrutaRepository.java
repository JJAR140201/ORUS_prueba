package prueba.supermercado.ORUS_SYSTEM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prueba.supermercado.ORUS_SYSTEM.Model.Frutas;

import java.util.Optional;

@Repository
public interface FrutaRepository extends JpaRepository<Frutas, Long> {
}
