package com.nttdata.springt5.controllers;

import com.nttdata.springt5.repositories.Customer;
import com.nttdata.springt5.services.CustomerManagementServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Taller 5 - Spring
 *
 * Implementacion REST del controlador de clientes
 *
 * @author Daniel Alberto Cosa Cosias
 */

@RestController
@RequestMapping("/home")
public class CustomerRestControllerImpl implements CustomerControlerI{

    //Servicio que sera consumido
    @Autowired
    CustomerManagementServiceI customerService;

    //Metodo con mapeo get
    @GetMapping
    @Override
    public List<Customer> showCustomers() {
        //Devuelve todos los clientes
        return customerService.findAll();
    }

    //Metodo con mapeo post
    @PostMapping
    @Override
    public void addNewClient(final @RequestBody Customer newCustomer) {
        //Inserta al cliente
        customerService.insertCustomer(newCustomer);
    }

    //Metodo con el mapeo post (A traves de request)
    @RequestMapping(path = "/name" , params = "name")
    @Override
    public List<Customer> getCustomersByName(@RequestParam("name") String name) {
        //Devuelve los clientes con el nombre puesto en el parametro
        return customerService.findByName(name);
    }
}
