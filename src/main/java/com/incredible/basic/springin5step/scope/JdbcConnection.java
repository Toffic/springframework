/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incredible.basic.springin5step.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author Pro
 */
@Component

//this scope will allow this class to be singleton but the class autowired to it to be prototype
//the objective is to have less instantiation of object especially the main persondao class

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode= ScopedProxyMode.TARGET_CLASS)

class JdbcConnection {

    public JdbcConnection() {
        System.out.println("jdbc connection");
    }
    
}
