package caja;

import java.sql.Date;
import java.util.ArrayList;

import tiposProductos.Productos;

public class Ticket {

	private int id;
	private ArrayList<Productos> listaProductosTicket = new ArrayList<Productos>();
	private boolean pagoTarjeta;
	private boolean pagado;
	private Date fecha;
	public static final double IVA = 1.21;

	/**
	 * Metodo para cambiar el booleano "pagado" a true
	 * 
	 * @param ticket, ticket que queremos pagar
	 * @return true si se cambia pagado a true
	 */
	public boolean ticketPagado(Ticket ticket) {

		ticket.setPagado(true);

		return ticket.isPagado();
	}

	/**
	 * Cambia el booleano pagado con tarjeta a true
	 * 
	 * @param ticket, ticekt que se quiere indicar el pago con tarjeta
	 * @return true si se cambia el atributo a true, false si no
	 */
	public boolean pagarConTarjeta(Ticket ticket) {

		ticket.setPagoTarjeta(true);

		return ticket.isPagoTarjeta();

	}

	/**
	 * Calcula el iva total del ticket
	 * 
	 * @param precio total del precio sin iva del conjunto de productos del ticket
	 * @return precio total con iva del conjunto de productos del ticket
	 * 
	 *         public double calcularIVA(double precio) {
	 * 
	 *         return precio * IVA;
	 *         }
	 */
	/**
	 * Este metodo sirve para calcular el total del coste de los productos de un
	 * ticket
	 * 
	 * @param listaProductos1 contiene la lsita de productos de un ticket
	 * @return devuelve la suma de todos los prodcutos como double
	 */

	public double totalTicket(Ticket ticket) {

		double precioSinIva = 0;

		for (Productos productos : ticket.getListaProductos()) {
			precioSinIva = precioSinIva + productos.getPrecio();
		}

		return precioSinIva; // calcularIVA(precioSinIva);metodo que se llamara en un futuro

	}

	/**
	 * Metodo para añadir producto a un ticket
	 * 
	 * @param producto
	 */

	public void añadirProducto(Ticket ticket, Productos producto) {

		ticket.listaProductosTicket.add(producto);
	}

	/**
	 * Metodo para borrar producto de un ticket
	 * 
	 * @param producto
	 */

	public void borrarProducto(Ticket ticket, Productos producto) {

		ticket.listaProductosTicket.remove(producto);
	}

	/**
	 * Metodo para borrar todos los productos de un ticket
	 */

	public void borrarTicketEntero(Ticket ticket) {

		ticket.listaProductosTicket.clear();

	}

	// metodo para mostrar los productos de un ticket
	public String mostrarProductosTicket(Ticket ticket) {

		String productos = "";

		for (Productos producto : ticket.getListaProductos()) {

			productos = productos + producto.getNombre() + "\n";

		}

		return productos;

	}

	// CONSTRUCTOR GETTERS Y SETTERS
	public Ticket(int id) {
		super();
		this.id = id;
		this.pagoTarjeta = false;
		this.pagado = false;
		this.fecha = new Date(System.currentTimeMillis());
	}

	public ArrayList<Productos> getListaProductos() {
		return listaProductosTicket;
	}

	public void setListaProductos(ArrayList<Productos> listaProductos) {
		this.listaProductosTicket = new ArrayList<>(listaProductos);
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isPagoTarjeta() {
		return pagoTarjeta;
	}

	public void setPagoTarjeta(boolean pagoTarjeta) {
		this.pagoTarjeta = pagoTarjeta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
