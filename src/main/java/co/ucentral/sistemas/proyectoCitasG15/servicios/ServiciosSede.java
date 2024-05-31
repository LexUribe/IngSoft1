package co.ucentral.sistemas.proyectoCitasG15.servicios;

import co.ucentral.sistemas.proyectoCitasG15.entidades.Sede;
import co.ucentral.sistemas.proyectoCitasG15.entidadesDto.SedeDto;
import co.ucentral.sistemas.proyectoCitasG15.repositorios.RepositorioSede;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Service
public class ServiciosSede implements Serializable {
    private ModelMapper modelMapper;

    @Autowired
    private final RepositorioSede repositorioSede;

    public SedeDto registrarSede(SedeDto sedeDto) {
        Sede sede = repositorioSede.save(modelMapper.map(sedeDto, Sede.class));
        return modelMapper.map(sede, SedeDto.class);
    }

    public List<SedeDto> obtenerSedes() {
        TypeToken<List<SedeDto>> typeToken = new TypeToken<>() {};
        return modelMapper.map(repositorioSede.findAll(), typeToken.getType());
    }
}
