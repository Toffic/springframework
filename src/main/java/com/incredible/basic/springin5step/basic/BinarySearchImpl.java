/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incredible.basic.springin5step.basic;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author Pro
 */
@Component
public class BinarySearchImpl {
private  Logger LOGGER= LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("bubble")
    private SortingAlgo sortingAlgo;

    public int binarySearch(int[] theArray, int theNumber) {

        int[] afterSort = Arrays.copyOf(sortingAlgo.sort(theArray), theArray.length);

        int indexOfNumber = 0;

        for (int i = 0; i < afterSort.length; i++) {
            if (theNumber == theArray[i]) {
                indexOfNumber = i;
                break;

            }
        }

        return indexOfNumber;
    }

@PostConstruct
public void postConstruct(){
    LOGGER.info("postConstruct");
}

@PreDestroy
public void preDestroy(){
    LOGGER.info("preDestroy");
}
}
