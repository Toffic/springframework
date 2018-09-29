/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incredible.basic.springin5step.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author Pro
 */
@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm  implements SortingAlgo{
 
    public int[] sort(int[] numbers){
        System.out.println("bubble search");
        
        return numbers;
        
    }
    
}
