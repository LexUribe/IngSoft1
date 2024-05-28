package co.ucentral.sistemas.proyectoCitasG15.servicios;

import co.ucentral.sistemas.proyectoCitasG15.entidades.Empleado;
import co.ucentral.sistemas.proyectoCitasG15.entidadesDto.EmpleadoDto;
import co.ucentral.sistemas.proyectoCitasG15.repositorios.RepositorioEmpleado;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@AllArgsConstructor
@Service
public class SeviciosEmpleado implements Serializable {
    private ModelMapper modelMapper;

    @Autowired
    private RepositorioEmpleado repositorioEmpleado;

    public EmpleadoDto registrarEmpleado(EmpleadoDto empleadoDto) {
        Empleado empleado = repositorioEmpleado.save(modelMapper.map(empleadoDto, Empleado.class));
        return modelMapper.map(empleado, EmpleadoDto.class);
    }
}
