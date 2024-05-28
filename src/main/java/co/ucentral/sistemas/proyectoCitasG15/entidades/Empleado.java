package co.ucentral.sistemas.proyectoCitasG15.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empleados")
@ToString
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_empleados")
    @SequenceGenerator(name = "seq_empleados", allocationSize = 1)
    @Column(name = "emp_idempleado", nullable = false)
    private long idEmpleado;

    @Column(name = "emp_nombre")
    private String nombre;

    @Column(name = "emp_edad")
    private int edad;

    @Column(name = "emp_estado")
    private String estado;

    @Column(name = "emp_cedula")
    private String cedula;

    @Column(name = "emp_contrasenia")
    private String contrasenia;

    @ManyToOne
    @JoinColumn(name = "sed_idsede")
    private Sede idSede;

    @ManyToOne
    @JoinColumn(name = "ser_idservicio")
    private Servicio idServicio;
}
