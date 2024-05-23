package co.ucentral.sistemas.proyectoCitasG15.entidadesDto;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "citas")
@ToString
public class CitaDto implements Serializable {
    private int idCita;

    @NotBlank(message = "El numero de turno es obligatorio")
    private String numTurno;

    @NotBlank(message = "El estado es obligatorio")
    private String estado;

    @NotBlank(message = "La fecha es obligatoria")
    private Date fecha;

    private Time horaInicio;

    /*private Empleado idEmpleado;

    @NotBlank(message = "La sede es obligatoria")
    private Sede idSede;

    @NotBlank(message = "El servicio es obligatorio")
    private Servicio idServicio;

    @NotBlank(message = "El cliente es obligatorio")
    private Cliente idCliente;*/
}
