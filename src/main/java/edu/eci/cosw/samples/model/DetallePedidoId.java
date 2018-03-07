package edu.eci.cosw.samples.model;

// Generated Feb 5, 2013 5:52:11 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AlmDetallesPedidoId generated by hbm2java
 */
@Embeddable
public class DetallePedidoId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3237914100408508473L;
	private int productosIdproducto;
	private int pedidosIdpedido;

	public DetallePedidoId() {
	}

	public DetallePedidoId(int productosIdproducto, int pedidosIdpedido) {
		this.productosIdproducto = productosIdproducto;
		this.pedidosIdpedido = pedidosIdpedido;
	}

	@Column(name = "PRODUCTOS_idproducto", nullable = false)
	public int getProductosIdproducto() {
		return this.productosIdproducto;
	}

	public void setProductosIdproducto(int productosIdproducto) {
		this.productosIdproducto = productosIdproducto;
	}

	@Column(name = "PEDIDOS_idpedido", nullable = false)
	public int getPedidosIdpedido() {
		return this.pedidosIdpedido;
	}

	public void setPedidosIdpedido(int pedidosIdpedido) {
		this.pedidosIdpedido = pedidosIdpedido;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DetallePedidoId))
			return false;
		DetallePedidoId castOther = (DetallePedidoId) other;

		return (this.getProductosIdproducto() == castOther
				.getProductosIdproducto())
				&& (this.getPedidosIdpedido() == castOther.getPedidosIdpedido());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getProductosIdproducto();
		result = 37 * result + this.getPedidosIdpedido();
		return result;
	}

}
