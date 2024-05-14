package co.ucentral.sistemas.proyectoCitasG15.controladores;

import co.ucentral.sistemas.proyectoCitasG15.entidadesDto.CitaDto;
import co.ucentral.sistemas.proyectoCitasG15.servicios.ServiciosCita;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j2
@Controller
public class ControladorCita {
    @Autowired
    ServiciosCita serviciosCita;

    @GetMapping({"/citas"})
    public String inicio(Model model) {
        return "index";
    }

    @GetMapping("/citas/nuevo")
    public String mostrarFormulario(Model model) {
        CitaDto citaDto = new CitaDto();
        model.addAttribute("cita", citaDto);
        return "agendar_cita";
    }

    @PostMapping("/citas")
    public String agendarCita(@ModelAttribute("cita") CitaDto citaDto) {
        serviciosCita.agendarCita(citaDto);
        return "redirect:/citas";
    }
}
