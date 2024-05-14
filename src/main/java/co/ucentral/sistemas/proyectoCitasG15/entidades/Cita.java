package co.ucentral.sistemas.proyectoCitasG15.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Cita")
@Table(name = "CITAS")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CITAS")
    @SequenceGenerator(name = "SEQ_CITAS", allocationSize = 1)
    @Column(name = "CIT_ID")
    private int idCita;

    @Column(name = "CIT_NUMTURNO")
    private String numTurno;

    @Column(name = "CIT_ESTADO")
    private String estado;

    @Column(name = "CIT_FECHA")
    private Date fecha;

    @Column(name = "CIT_HORAINICIO")
    private Time horaInicio;

    /*@Column(name = "CIT_IDEMPLEADO")
    private Empleado idEmpleado;

    @Column(name = "CIT_IDSEDE")
    private Sede idSede;

    @Column(name = "CIT_IDSERVICIO")
    private Servicio idServicio;

    @Column(name = "CIT_IDCLIENTE")
    private Cliente idCliente;*/
}
