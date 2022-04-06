public class Articulo 
{
    
	private int index;
	private String nombre;
    private double precio;


    public Articulo(int index, String nombre, double precio) 
	{
		this.index = index;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getIndex() 
	{
		return index;
	}


	public void setIndex(int index) 
	{
		this.index = index;
	}


	public String getNombre() 
	{
		return nombre;
	}


	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}


	public double getPrecio() 
	{
		return precio;
	}


	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}

}