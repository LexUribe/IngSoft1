package co.ucentral.sistemas.proyectoCitasG15.entidadesDto;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clientes")
@ToString
public class ClienteDto {
    private long idCliente;

    private String nombre;

    private int edad;

    private String cedula;

    private LocalDate fechaCreacionCuenta;

    private String estado;

    private String correo;

    private String contrasenia;
}
