package co.ucentral.sistemas.proyectoCitasG15.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Cita")
@Table(name = "CITAS")
@ToString
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CITAS")
    @SequenceGenerator(name = "SEQ_CITAS", allocationSize = 1)
    @Column(name = "CIT_ID", nullable = false)
    private long idCita;

    @Column(name = "CIT_TURNO", length = 4)
    private String turno;

    @Column(name = "CIT_ESTADO")
    private String estado;

    //@DateTimeFormat(pattern = "yyyy/MM/dd hh:mm:ss")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @Column(name = "CIT_FECHA")
    private LocalDate fecha;

    @Column(name = "CIT_HORAINICIO")
    private LocalTime horaInicio;

    @ManyToOne
    @JoinColumn(name = "EMP_IDEMPLEADO")
    private Empleado idEmpleado;

    @ManyToOne
    @JoinColumn(name = "SED_IDSEDE")
    private Sede idSede;

    @ManyToOne
    @JoinColumn(name = "SER_IDSERVICIO")
    private Servicio idServicio;

    @ManyToOne
    @JoinColumn(name = "CLI_IDCLIENTE")
    private Cliente idCliente;
}
