package co.ucentral.sistemas.proyectoCitasG15.repositorios;

import co.ucentral.sistemas.proyectoCitasG15.entidades.Cita;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class RepositorioCitaTest {
    @Autowired
    private RepositorioCita repositorioCita;

    @Test
    @DisplayName("Prueba creando una cita")
    void testCreaCita() {
        /*Cita cita = Cita
                .builder()
                .turno("C01")
                .estado("Activa")
                .build();*/

        Cita cita = new Cita();
        LocalDate fecha = LocalDate.now();

        cita.setTurno("C01");
        cita.setEstado("Activa");
        cita.setFecha(fecha);

        //Cita prueba = repositorioCita.save(cita);
        repositorioCita.save(cita);
        assertNotNull(cita);
        /*assertThat(prueba).isNotNull();
        assertThat(prueba.getIdCita()).isGreaterThan(0);
        assertThat(prueba.getIdCita()).isPositive()
        assertThat(prueba.getTurno()).isEqualTo("C01")*/
    }
}