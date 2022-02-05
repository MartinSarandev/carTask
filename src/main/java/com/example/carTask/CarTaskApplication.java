package com.example.carTask;

import com.example.carTask.controller.OwnerController;
import com.example.carTask.model.Owner;
import com.example.carTask.model.Engine;
import com.example.carTask.model.Car;
import com.example.carTask.repository.OwnerRepository;
import com.example.carTask.repository.EngineRepository;
import com.example.carTask.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CarTaskApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CarTaskApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(OwnerRepository carOwnerRepository,
//										EngineRepository engineRepository,
//										CarRepository vehicleRepository){
//		return  args -> {
//
//
//			Owner owner1 = new Owner("Martin","1987/July/14");
//			Owner owner2 = new Owner("Dimityr","1983/May/10");
//			Owner owner3 = new Owner("Radina","1990/January/31");
//
//			carOwnerRepository.save(owner1);
//			carOwnerRepository.save(owner2);
//			carOwnerRepository.save(owner3);
//
//
//			Engine engine1 = new Engine(1234,"3000cc",239);
//			Engine engine2 = new Engine(5678,"3500cc",313);
//			Engine engine3 = new Engine(9900,"1800cc",122);
//			engineRepository.save(engine1);
//			engineRepository.save(engine2);
//			engineRepository.save(engine3);
//
//
//			Car vh1 = new Car(engine1,owner1,"Audi","A6",2010,"ZZZ4F2Awwwww6");
//			Car vh2 = new Car(engine2,owner2,"Audi","A6",2012,"ZZZ4GWWaXXXXXU5");
//			Car vh3 = new Car(engine3,owner3,"Toyota","CHR",2019,"XX4B19HIBRID");
//			vehicleRepository.save(vh1);
//			vehicleRepository.save(vh2);
//			vehicleRepository.save(vh3);
//
//		};
//	}

}
