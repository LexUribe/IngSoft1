package co.ucentral.sistemas.proyectoCitasG15.entidadesDto;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "servicios")
@ToString
public class ServicioDto implements Serializable {
    private long idServicio;

    private String nombre;

    private String descripcion;
}
