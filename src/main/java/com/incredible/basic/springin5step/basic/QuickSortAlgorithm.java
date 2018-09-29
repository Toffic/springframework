/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incredible.basic.springin5step.basic;

import org.springframework.stereotype.Component;

/**
 *
 * @author Pro
 */
@Component
public class QuickSortAlgorithm implements SortingAlgo {
 
    public int[] sort(int[] numbers){
               System.out.println("quick sort");
      
        return new int []{1,2,3,4,5,6};
        
    }
    
}
