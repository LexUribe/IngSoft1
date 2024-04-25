package co.ucentral.sistemas.proyectoCitasG15.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CitaDto implements Serializable {
    private int idCita;

    @NotBlank(message = "El numero de turno es obligatorio")
    private String numTurno;

    @NotBlank(message = "El estado es obligatorio")
    private String estado;

    /*@NotBlank(message = "La fecha es obligatoria")
    private date fecha;

    @NotBlank(message = "La hora de inicio es obligatoria")
    private time horaInicio;

    private Empleado idEmpleado;

    private Sede idSede;

    private Servicio idServicio;

    private Cliente idCliente;*/
}
