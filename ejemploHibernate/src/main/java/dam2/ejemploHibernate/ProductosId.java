package dam2.ejemploHibernate;
// Generated 15 ene 2024 21:04:16 by Hibernate Tools 6.3.1.Final

/**
 * ProductosId generated by hbm2java
 */
public class ProductosId implements java.io.Serializable {

	private int id;
	private String nombre;
	private double precio;

	public ProductosId() {
	}

	public ProductosId(int id, String nombre, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProductosId))
			return false;
		ProductosId castOther = (ProductosId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getNombre() == castOther.getNombre()) || (this.getNombre() != null
						&& castOther.getNombre() != null && this.getNombre().equals(castOther.getNombre())))
				&& (this.getPrecio() == castOther.getPrecio());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result + (int) this.getPrecio();
		return result;
	}

}