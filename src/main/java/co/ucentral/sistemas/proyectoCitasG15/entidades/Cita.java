package co.ucentral.sistemas.proyectoCitasG15.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "Cita")
//@Table(name = "CITAS")
public class Cita {
    /*@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_CITAS")
    @SequenceGenerator(name = "SEQ_CITAS", allocationSize = 1)
    @Column(name = "CIT_IDCITA")*/
    private int idCita;

    //@Column(name = "CIT_NUMTURNO")
    private String numTurno;

    //@Column(name = "CIT_ESTADO")
    private String estado;

    /*@Column(name = "CIT_FECHA")
    private date fecha;

    @Column(name = "CIT_HORAINICIO")
    private time horaInicio;

    private Empleado idEmpleado;

    private Sede idSede;

    private Servicio idServicio;

    private Cliente idCliente;*/
}
