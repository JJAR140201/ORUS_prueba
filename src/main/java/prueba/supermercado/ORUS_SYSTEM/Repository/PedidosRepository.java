package prueba.supermercado.ORUS_SYSTEM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prueba.supermercado.ORUS_SYSTEM.Model.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
}
