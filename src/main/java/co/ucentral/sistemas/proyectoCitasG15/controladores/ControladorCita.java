package co.ucentral.sistemas.proyectoCitasG15.controladores;

import co.ucentral.sistemas.proyectoCitasG15.entidadesDto.CitaDto;
import co.ucentral.sistemas.proyectoCitasG15.servicios.ServiciosCita;
import co.ucentral.sistemas.proyectoCitasG15.servicios.ServiciosSede;
import co.ucentral.sistemas.proyectoCitasG15.servicios.ServiciosServicio;
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

    @Autowired
    ServiciosSede serviciosSede;

    @Autowired
    ServiciosServicio serviciosServicio;

    @GetMapping({"/opciones"})
    public String opciones() { return "opciones"; }

    @GetMapping({"/"})
    public String inicio() {
        return "index";
    }

    @GetMapping("/citas/nuevo")
    public String mostrarFormulario(Model model) {
        CitaDto citaDto = new CitaDto();
        model.addAttribute("cita", citaDto);
        model.addAttribute("sede", serviciosSede.obtenerSede());
        model.addAttribute("servicio", serviciosServicio.obtenerServicio());
        return "agendar_cita";
    }

    @PostMapping("/citas")
    public String agendarCita(@ModelAttribute("cita") CitaDto citaDto) {
        serviciosCita.agendarCita(citaDto);
        return "redirect:/opciones";
    }
}
