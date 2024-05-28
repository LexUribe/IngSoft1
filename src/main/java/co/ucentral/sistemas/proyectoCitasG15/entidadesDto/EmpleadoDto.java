package co.ucentral.sistemas.proyectoCitasG15.entidadesDto;

import co.ucentral.sistemas.proyectoCitasG15.entidades.Sede;
import co.ucentral.sistemas.proyectoCitasG15.entidades.Servicio;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "empleados")
@ToString
public class EmpleadoDto {
    private long idEmpleado;

    private String nombre;

    private int edad;

    private String estado;

    private String cedula;

    private String contrasenia;

    private Sede idSede;

    private Servicio idServicio;
}
