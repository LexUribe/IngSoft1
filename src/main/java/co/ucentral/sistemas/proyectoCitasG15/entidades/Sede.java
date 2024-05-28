package co.ucentral.sistemas.proyectoCitasG15.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Sede")
@Table(name = "SEDES")
@ToString
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SEDES")
    @SequenceGenerator(name = "SEQ_SEDES", allocationSize = 1)
    @Column(name = "sed_idsede", nullable = false)
    private long idSede;

    @Column(name = "sed_nombre")
    private String nombre;

    @Column(name = "sed_numempleado")
    private int numEmpleado;

    @Column(name = "sed_horaapertura")
    private LocalTime horaApertura;

    @Column(name = "sed_horacierre")
    private LocalTime horaCierre;

    @Column(name = "sed_direccion")
    private String direccion;
}
