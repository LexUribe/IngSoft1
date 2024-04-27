package co.ucentral.sistemas.proyectoCitasG15.servicios;

import co.ucentral.sistemas.proyectoCitasG15.entidades.Cita;
import co.ucentral.sistemas.proyectoCitasG15.entidadesDto.CitaDto;
import co.ucentral.sistemas.proyectoCitasG15.repositorios.RepositorioCita;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Service
public class ServiciosCita implements Serializable {
    private ModelMapper modelMapper;
    private final RepositorioCita repositorioCita;

    public CitaDto agendarCita(CitaDto citaDto) {
        if (citaDto != null){
            Cita cita = repositorioCita.save(modelMapper.map(citaDto, Cita.class));
            return modelMapper.map(cita, CitaDto.class);
        }
        else
            return null;
    }

    public List<CitaDto> obtenerCitas() {
        TypeToken<List<CitaDto>> typeToken = new TypeToken<>() {};
        return modelMapper.map(repositorioCita.findAll(), typeToken.getType());
    }
}
