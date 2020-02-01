package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringBootJpaDatabaseInitializationApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaDatabaseInitializationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = getEmployee();
		System.out.println(employee);
		employeeRepository.save(employee);
	}

	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEname("maheh");
		employee.setEmail("mahesh@gmail.com");
		employee.setSalary(383838.45);
		return employee;
	}

}
