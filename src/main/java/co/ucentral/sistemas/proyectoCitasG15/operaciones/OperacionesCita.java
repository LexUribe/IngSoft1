package co.ucentral.sistemas.proyectoCitasG15.operaciones;

import co.ucentral.sistemas.proyectoCitasG15.entidadesDto.CitaDto;

import java.util.List;

public interface OperacionesCita {
    public CitaDto agendarCita(CitaDto citaDto);

    public List<CitaDto> obtenerCitas();
}
