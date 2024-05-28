package co.ucentral.sistemas.proyectoCitasG15;

import co.ucentral.sistemas.proyectoCitasG15.entidades.Cliente;
import co.ucentral.sistemas.proyectoCitasG15.entidades.Empleado;
import co.ucentral.sistemas.proyectoCitasG15.entidades.Sede;
import co.ucentral.sistemas.proyectoCitasG15.entidades.Servicio;
import co.ucentral.sistemas.proyectoCitasG15.repositorios.RepositorioCliente;
import co.ucentral.sistemas.proyectoCitasG15.repositorios.RepositorioEmpleado;
import co.ucentral.sistemas.proyectoCitasG15.repositorios.RepositorioSede;
import co.ucentral.sistemas.proyectoCitasG15.repositorios.RepositorioServicio;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
@Log4j2
public class ProyectoCitasG15Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoCitasG15Application.class, args);
		System.out.println("Inicio aplicación citas - Banco DINER");
	}

	RepositorioSede repositorioSede;

	RepositorioCliente repositorioCliente;

	RepositorioEmpleado repositorioEmpleado;

	RepositorioServicio repositorioServicio;

	public ProyectoCitasG15Application(RepositorioSede repositorioSede, RepositorioCliente repositorioCliente, RepositorioEmpleado repositorioEmpleado, RepositorioServicio repositorioServicio) {
		this.repositorioSede = repositorioSede;
		this.repositorioCliente = repositorioCliente;
		this.repositorioEmpleado = repositorioEmpleado;
		this.repositorioServicio = repositorioServicio;
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		* REGISTRO 4 SEDES
		* 1. "Zona centro"
		* 2. "Zona norte"
		* 3. "Zona sur"
		* 4. "Aeropuerto"
		* */
		String apertura = "08:00:00";
		String cierre = "16:00:00";
		int numEmpleados = 6;

		//1. "Zona centro"
		Sede centro = new Sede();
		centro.setNombre("Zona centro");
		centro.setNumEmpleado(numEmpleados);
		centro.setHoraApertura(LocalTime.parse(apertura));
		centro.setHoraCierre(LocalTime.parse(cierre));
		centro.setDireccion("Cra 13 # 29-45");
		repositorioSede.save(centro);

		//2. "Zona norte"
		Sede norte = new Sede();
		norte.setNombre("Zona norte");
		norte.setNumEmpleado(numEmpleados);
		norte.setHoraApertura(LocalTime.parse(apertura));
		norte.setHoraCierre(LocalTime.parse(cierre));
		norte.setDireccion("Cra 19 #120-64");
		repositorioSede.save(norte);

		//3. "Zona sur"
		Sede sur = new Sede();
		sur.setNombre("Zona sur");
		sur.setNumEmpleado(numEmpleados);
		sur.setHoraApertura(LocalTime.parse(apertura));
		sur.setHoraCierre(LocalTime.parse(cierre));
		sur.setDireccion("Cll 137b Sur # 2a-64");
		repositorioSede.save(sur);

		//4. "Aeropuerto"
		Sede aeropuerto = new Sede();
		aeropuerto.setNombre("Aeropuerto");
		aeropuerto.setNumEmpleado(numEmpleados);
		aeropuerto.setHoraApertura(LocalTime.parse(apertura));
		aeropuerto.setHoraCierre(LocalTime.parse(cierre));
		aeropuerto.setDireccion("Ac 26 # 103-9");
		repositorioSede.save(aeropuerto);

		/*
		 * Registro 3 Servicios
		 * */
		Servicio caja = new Servicio();
		caja.setNombre("Servicio de caja");
		repositorioServicio.save(caja);

		Servicio asesoria = new Servicio();
		asesoria.setNombre("Asesoría");
		repositorioServicio.save(asesoria);

		Servicio nuevo = new Servicio();
		nuevo.setNombre("Obtener nuevos productos");
		repositorioServicio.save(nuevo);

		/*
		* Registro 10 clientes
		* */
		String estadoCli = "Activo";
		int id = 0;

		repositorioCliente.save(new Cliente(id, "Ramiro Meneses", 53, "54864581", LocalDate.parse("2024-05-21"), estadoCli, "ramen@diner.com","rmeneses5481"));
		repositorioCliente.save(new Cliente(id, "Lorenzo Carvajal", 31, "1018561284", LocalDate.parse("2024-04-12"), estadoCli, "locarvajal@diner.com","lcarvajal1084"));
		repositorioCliente.save(new Cliente(id, "Arturo Calderon", 25, "1015618247", LocalDate.parse("2023-04-01"), estadoCli, "arturon@diner.com","acalderon1047"));
		repositorioCliente.save(new Cliente(id, "Ginna Morales", 29, "1018284789", LocalDate.parse("2023-02-14"), estadoCli, "ginnasamorales@diner.com","gmorales1089"));
		repositorioCliente.save(new Cliente(id, "Alejandro Castro", 35, "1012821895", LocalDate.parse("2022-01-21"), estadoCli, "alejodejo@diner.com","acastro1095"));
		repositorioCliente.save(new Cliente(id, "Carlos Duarte", 27, "1011486969", LocalDate.parse("2024-01-10"), estadoCli, "carlduarte@diner.com","cduarte1069"));
		repositorioCliente.save(new Cliente(id, "Patricia Escobar", 62, "23822497", LocalDate.parse("2000-04-05"), estadoCli, "paescobar@diner.com","pescobar2397"));
		repositorioCliente.save(new Cliente(id, "Alex Oquendo", 37, "1010245577", LocalDate.parse("2013-10-15"), estadoCli, "oquendoalex@diner.com","aoquendo1077"));
		repositorioCliente.save(new Cliente(id, "Alvaro Uribe", 30, "1018789166", LocalDate.parse("2003-02-14"), estadoCli, "alvaricoca6402@diner.com","auribe1066"));
		repositorioCliente.save(new Cliente(id, "Katty Lozano", 27, "1018295566", LocalDate.parse("2019-08-20"), estadoCli, "kittylike@diner.com","klozano1066"));

		/*
		 * Registro 24 empleados.
		 * 6 Funcionarios en total por sucursal.
		 * 3 caja, 2 asesoría y 1 nuevo.
		 * 3 caja, 1 asesoría y 2 nuevo.
		 * */
		String estadoEmp = "Libre";

		//Sede centro
		repositorioEmpleado.save(new Empleado(id, "Laura Arias", 23, estadoEmp, "1015978464", "larias1064", centro, caja));
		repositorioEmpleado.save(new Empleado(id, "Nicolas Guerra", 19, estadoEmp, "1018978777", "nguerra1077", centro, caja));
		repositorioEmpleado.save(new Empleado(id, "Laura Trujillo", 21, estadoEmp, "1019284644", "ltrujillo1044", centro, caja));
		repositorioEmpleado.save(new Empleado(id, "Julio Jaramillo", 30, estadoEmp, "1019284644", "ltrujillo1044", centro, nuevo));
		repositorioEmpleado.save(new Empleado(id, "Vicente Fernandez", 20, estadoEmp, "1018946428", "vfernandez1028", centro, nuevo));
		repositorioEmpleado.save(new Empleado(id, "Kirk Hammett", 28, estadoEmp, "1018424928", "khammett1028", centro, asesoria));
		//Sede norte
		repositorioEmpleado.save(new Empleado(id, "Jonathan Amador", 20, estadoEmp, "1018718444", "jamador1044", norte, caja));
		repositorioEmpleado.save(new Empleado(id, "Fiorella Gamba", 18, estadoEmp, "1019844468", "fgamba1068", norte, caja));
		repositorioEmpleado.save(new Empleado(id, "Julian Gamba", 24, estadoEmp, "1018328415", "jgamba1015", norte, caja));
		repositorioEmpleado.save(new Empleado(id, "Paula Valencia", 27, estadoEmp, "1018984512", "pvalencia1012", norte, nuevo));
		repositorioEmpleado.save(new Empleado(id, "Camilo Sanchez", 30, estadoEmp, "1018259784", "csanchez1084", norte, asesoria));
		repositorioEmpleado.save(new Empleado(id, "Camilo Pardo", 31, estadoEmp, "1018529478", "csanchez1084", norte, asesoria));
		//Sede sur
		repositorioEmpleado.save(new Empleado(id, "Alejandro Escamilla", 35, estadoEmp, "1018162666", "aescamilla1066", sur, caja));
		repositorioEmpleado.save(new Empleado(id, "Antonella Rubiano", 26, estadoEmp, "1019626860", "arubiano1060", sur, caja));
		repositorioEmpleado.save(new Empleado(id, "Steven Cano", 31, estadoEmp, "1018268469", "scano1069", sur, caja));
		repositorioEmpleado.save(new Empleado(id, "Jonathan Uribe", 27, estadoEmp, "1015284691", "juribe1091", sur, nuevo));
		repositorioEmpleado.save(new Empleado(id, "Andrea Patiño", 30, estadoEmp, "1015691122", "apatiño1022", sur, nuevo));
		repositorioEmpleado.save(new Empleado(id, "Maria Alfonzo", 29, estadoEmp, "1018469121", "malfonzo1021", sur, asesoria));
		//Sede aeropuerto
		repositorioEmpleado.save(new Empleado(id, "Freddie Mercury", 40, estadoEmp, "1010714126", "fmercury1026", aeropuerto, caja));
		repositorioEmpleado.save(new Empleado(id, "Steve  Harris", 37, estadoEmp, "1010875498", "sharris1098", aeropuerto, caja));
		repositorioEmpleado.save(new Empleado(id, "Janis  Yoplin", 30, estadoEmp, "1018544986", "jyoplin1098", aeropuerto, caja));
		repositorioEmpleado.save(new Empleado(id, "Kurt Cobein", 35, estadoEmp, "1018469123", "kcobein1023", aeropuerto, nuevo));
		repositorioEmpleado.save(new Empleado(id, "Ozzy Osbourne", 25, estadoEmp, "1018335237", "oosbourne1035", aeropuerto, asesoria));
		repositorioEmpleado.save(new Empleado(id, "Tom Araya", 27, estadoEmp, "1017123543", "taraya1043", aeropuerto, asesoria));
	}
}
