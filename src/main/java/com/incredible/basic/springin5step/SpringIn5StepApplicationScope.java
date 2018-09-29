package com.incredible.basic.springin5step;

import com.incredible.basic.springin5step.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepApplicationScope {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepApplicationScope.class);
    
    public static void main(String[] args) {

        //  BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
        int data[] = {3, 45, 34, 63, 6};

        ApplicationContext acx = SpringApplication.run(SpringIn5StepApplicationScope.class, args);
       PersonDAO personDAO = acx.getBean(PersonDAO.class);
       PersonDAO personDAO1 = acx.getBean(PersonDAO.class);

       
       LOGGER.info("{}",personDAO);
       LOGGER.info("{}",personDAO.getJdbcConnection());
       
       
       LOGGER.info("{}",personDAO1);
       LOGGER.info("{}",personDAO1.getJdbcConnection()  );
       
    }
}
