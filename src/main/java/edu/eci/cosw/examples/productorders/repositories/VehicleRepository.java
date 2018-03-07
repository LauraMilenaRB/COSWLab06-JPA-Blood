/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.examples.productorders.repositories;

import edu.eci.cosw.samples.model.Producto;
import edu.eci.cosw.samples.model.Vehiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Laura RB
 */

public interface VehicleRepository extends JpaRepository<Vehiculo, String>{
    @Query("select distinct vehiculo from Despacho as despacho inner join despacho.pedidos as pedidos "
            + "inner join pedidos.detallesPedidos as detalle "
            + "inner join detalle.producto as producto "
            + "inner join despacho.vehiculo as vehiculo "
            + "where producto.idproducto = ?1")
    public List<Vehiculo> findVehiclesByProducto(int idProducto);
    
}
