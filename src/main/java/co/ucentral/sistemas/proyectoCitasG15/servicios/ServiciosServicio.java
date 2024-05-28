package co.ucentral.sistemas.proyectoCitasG15.servicios;

import co.ucentral.sistemas.proyectoCitasG15.entidades.Servicio;
import co.ucentral.sistemas.proyectoCitasG15.entidadesDto.ServicioDto;
import co.ucentral.sistemas.proyectoCitasG15.repositorios.RepositorioServicio;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@AllArgsConstructor
@Service
public class ServiciosServicio implements Serializable {
    private ModelMapper modelMapper;

    @Autowired
    private RepositorioServicio repositorioServicio;

    public ServicioDto registrarServicio(ServicioDto servicioDto) {
        Servicio servicio = repositorioServicio.save(modelMapper.map(servicioDto, Servicio.class));
        return modelMapper.map(servicio, ServicioDto.class);
    }
}
