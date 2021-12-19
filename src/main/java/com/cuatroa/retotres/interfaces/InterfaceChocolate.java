/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cuatroa.retotres.interfaces;


import com.cuatroa.retotres.model.Chocolate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author JUAN JIMENEZ
 */
public interface InterfaceChocolate extends MongoRepository<Chocolate, String> {
    
}
