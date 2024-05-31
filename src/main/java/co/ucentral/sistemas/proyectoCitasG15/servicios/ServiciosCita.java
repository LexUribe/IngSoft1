package co.ucentral.sistemas.proyectoCitasG15.servicios;

import co.ucentral.sistemas.proyectoCitasG15.entidades.Cita;
import co.ucentral.sistemas.proyectoCitasG15.entidadesDto.CitaDto;
import co.ucentral.sistemas.proyectoCitasG15.repositorios.RepositorioCita;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Service
public class ServiciosCita implements Serializable {
    private ModelMapper modelMapper;

    @Autowired
    private final RepositorioCita repositorioCita;

    public CitaDto agendarCita(CitaDto citaDto) {
        Cita cita = repositorioCita.save(modelMapper.map(citaDto, Cita.class));
        return modelMapper.map(cita, CitaDto.class);
    }

    public List<CitaDto> obtenerCitas(){
        TypeToken<List<CitaDto>> typeToken = new TypeToken<>() {};
        return modelMapper.map(repositorioCita.findAll(), typeToken.getType());
    }
}
