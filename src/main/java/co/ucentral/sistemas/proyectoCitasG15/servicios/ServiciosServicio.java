package co.ucentral.sistemas.proyectoCitasG15.servicios;

import co.ucentral.sistemas.proyectoCitasG15.entidades.Servicio;
import co.ucentral.sistemas.proyectoCitasG15.entidadesDto.ServicioDto;
import co.ucentral.sistemas.proyectoCitasG15.repositorios.RepositorioServicio;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Service
public class ServiciosServicio implements Serializable {
    private ModelMapper modelMapper;

    @Autowired
    private final RepositorioServicio repositorioServicio;

    public ServicioDto registrarServicio(ServicioDto servicioDto) {
        Servicio servicio = repositorioServicio.save(modelMapper.map(servicioDto, Servicio.class));
        return modelMapper.map(servicio, ServicioDto.class);
    }

    public List<ServicioDto> obtenerServicio() {
        TypeToken<List<ServicioDto>> typeToken = new TypeToken<>() {};
        return modelMapper.map(repositorioServicio.findAll(), typeToken.getType());
    }
}
