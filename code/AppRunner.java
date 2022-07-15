package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private final EmployeeRespository employeeRepository;

    public AppRunner(EmployeeRespository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        logger.info(".... Fetching employee");
        logger.info("isbn-1234 -->" + employeeRepository.getEmployeeByName("isbn-1234"));
        logger.info("isbn-4567 -->" + employeeRepository.getEmployeeByName("isbn-4567"));
        logger.info("isbn-1234 -->" + employeeRepository.getEmployeeByName("isbn-1234"));
        logger.info("isbn-4567 -->" + employeeRepository.getEmployeeByName("isbn-4567"));
        logger.info("isbn-1234 -->" + employeeRepository.getEmployeeByName("isbn-1234"));
        logger.info("isbn-1234 -->" + employeeRepository.getEmployeeByName("isbn-1234"));
    }

}