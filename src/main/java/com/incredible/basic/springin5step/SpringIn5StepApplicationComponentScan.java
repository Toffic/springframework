package com.incredible.basic.springin5step;

import ComponentScan.PersonDAOComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ComponentScan")
public class SpringIn5StepApplicationComponentScan {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepApplicationComponentScan.class);
    
    public static void main(String[] args) {

        //  BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
    

        ApplicationContext acx = SpringApplication.run(SpringIn5StepApplicationComponentScan.class, args);
       PersonDAOComponent personDAO = acx.getBean(PersonDAOComponent.class);
       PersonDAOComponent personDAO1 = acx.getBean(PersonDAOComponent.class);

       
       LOGGER.info("{}",personDAO);
       LOGGER.info("{}",personDAO.getJdbcConnection());
       
       
       LOGGER.info("{}",personDAO1);
       LOGGER.info("{}",personDAO1.getJdbcConnection()  );
       
    }
}
