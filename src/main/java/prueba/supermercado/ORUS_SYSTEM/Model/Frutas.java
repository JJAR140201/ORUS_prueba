package prueba.supermercado.ORUS_SYSTEM.Model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table (name = "frutas")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Frutas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precio")
    private BigDecimal precio;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion;
}
