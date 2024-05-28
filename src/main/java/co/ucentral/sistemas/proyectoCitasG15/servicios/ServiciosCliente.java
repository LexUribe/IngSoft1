package co.ucentral.sistemas.proyectoCitasG15.servicios;

import co.ucentral.sistemas.proyectoCitasG15.entidades.Cliente;
import co.ucentral.sistemas.proyectoCitasG15.entidadesDto.ClienteDto;
import co.ucentral.sistemas.proyectoCitasG15.entidadesDto.EmpleadoDto;
import co.ucentral.sistemas.proyectoCitasG15.repositorios.RepositorioCliente;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@AllArgsConstructor
@Service
public class ServiciosCliente {
    private ModelMapper modelMapper;

    @Autowired
    private RepositorioCliente repositorioCliente;

    public ClienteDto registrarCliente(ClienteDto clienteDto) {
        Cliente cliente = repositorioCliente.save(modelMapper.map(clienteDto, Cliente.class));
        return modelMapper.map(cliente, ClienteDto.class);
    }
}
