package co.ucentral.sistemas.proyectoCitasG15.entidadesDto;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "sedes")
@ToString
public class SedeDto implements Serializable {
    private int idSede;

    private String nombre;

    private int numEmpleado;

    private Time horaApertura;

    private Time horaCierre;

    private String direccion;
}
