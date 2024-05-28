package co.ucentral.sistemas.proyectoCitasG15.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes")
@ToString
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_clientes")
    @SequenceGenerator(name = "seq_clientes", allocationSize = 1)
    @Column(name = "cli_idcliente", nullable = false)
    private long idCliente;

    @Column(name = "cli_nombre")
    private String nombre;

    @Column(name = "cli_edad")
    private int edad;

    @Column(name = "cli_cedula")
    private String cedula;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @Column(name = "cli_fechacreacioncuenta")
    private LocalDate fechaCreacionCuenta;

    @Column(name = "cli_estado")
    private String estado;

    @Column(name = "cli_correo")
    private String correo;

    @Column(name = "cli_contrasenia")
    private String contrasenia;
}
