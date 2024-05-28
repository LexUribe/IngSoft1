package co.ucentral.sistemas.proyectoCitasG15.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "servicios")
@ToString
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_servicios")
    @SequenceGenerator(name = "seq_servicios", allocationSize = 1)
    @Column(name = "ser_idservicio", nullable = false)
    private long idServicio;

    @Column(name = "ser_nombre")
    private String nombre;

    @Column(name = "ser_descripcion")
    private String descripcion;
}
