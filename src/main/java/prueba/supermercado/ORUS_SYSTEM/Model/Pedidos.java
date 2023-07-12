package prueba.supermercado.ORUS_SYSTEM.Model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Pedidos")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "lista_frutas")
    private String listaFrutas;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion;
}
