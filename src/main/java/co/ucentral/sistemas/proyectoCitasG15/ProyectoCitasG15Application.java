package co.ucentral.sistemas.proyectoCitasG15;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class ProyectoCitasG15Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoCitasG15Application.class, args);
		System.out.println("Aplicación citas iniciada");
	}

	@Override
	public void run(String... args) throws Exception {	}
}
