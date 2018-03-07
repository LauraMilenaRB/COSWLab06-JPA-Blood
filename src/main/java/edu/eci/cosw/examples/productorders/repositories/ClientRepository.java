/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.examples.productorders.repositories;

import edu.eci.cosw.samples.model.Cliente;
import edu.eci.cosw.samples.model.Producto;
import edu.eci.cosw.samples.model.Vehiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Laura RB
 */

public interface ClientRepository extends JpaRepository<Cliente, Integer>{

    @Query("select distinct clientes from Pedido as pedido "
            + "inner join pedido.cliente as clientes "
            + "inner join pedido.detallesPedidos as detalle "
            + "inner join detalle.producto as producto "
            + "where producto.precio > ?1")
    public List<Cliente> findClientByPPrice(long price);
    
}
