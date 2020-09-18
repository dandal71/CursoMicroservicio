package ar.com.dsv.micro.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CursoMicroserviciosCursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoMicroserviciosCursosApplication.class, args);
	}

}
