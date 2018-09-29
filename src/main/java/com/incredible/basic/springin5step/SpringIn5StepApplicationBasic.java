
package com.incredible.basic.springin5step;

import com.incredible.basic.springin5step.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepApplicationBasic {
    public static void main(String[] args) {

        //  BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
        int data[] = {3, 45, 34, 63, 6};

        ApplicationContext acx = SpringApplication.run(SpringIn5StepApplicationBasic.class, args);
         BinarySearchImpl binarySearchImpl = acx.getBean(BinarySearchImpl.class);
        System.out.println(binarySearchImpl.binarySearch(data, 34));

        
    }
}
