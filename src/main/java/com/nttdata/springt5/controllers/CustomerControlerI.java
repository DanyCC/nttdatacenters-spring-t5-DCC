package com.nttdata.springt5.controllers;

import com.nttdata.springt5.repositories.Customer;

import java.util.List;

/**
 * Taller 5 - Spring
 *
 * Interfaz del controlador de clientes
 *
 * @author Daniel Alberto Cosa Cosias
 */

public interface CustomerControlerI {

    /**
     * Recibe la peticion y muestra los clientes
     *
     * @return String
     * @param
     */
    public List<Customer> showCustomers();

    /**
     * Recibe la peticion e inserta un nuevo cliente
     *
     * @return String
     */
    public void addNewClient(Customer insertCustomer);

    /**
     * Recibe la peticion y muestra los clientes por nombre
     *
     * @return String
     * @param
     */
    public List<Customer> getCustomersByName(String name);
}
