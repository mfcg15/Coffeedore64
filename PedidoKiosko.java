import java.util.ArrayList;

public class PedidoKiosko 
{
    private ArrayList<Articulo> menu = new ArrayList<Articulo>();

    public PedidoKiosko() 
	{
		this.menu = new ArrayList<Articulo>();
	}

    public void addMenuItem (Articulo articulo)
    {
        this.menu.add(articulo);
    }

    public void displayMenu()
    {
        for(int i = 0; i < this.menu.size() ; i++)
        {
            System.out.println(this.menu.get(i).getIndex()+" "+this.menu.get(i).getNombre()+" -- $"+this.menu.get(i).getPrecio());
        }
    }

    public void newOrder() 
    {
        
        System.out.println("Ingrese el nombre del cliente para el nuevo pedido:");
        String name = System.console().readLine();

        Pedido pedido = new Pedido(name);

        displayMenu();

        String itemNumber = "";
        
        do
        {
            System.out.println("Ingrese un índice de artículo del menú o q para salir:");
            itemNumber = System.console().readLine();

            if(!itemNumber.equals("q"))
            {
                for(int i= 0; i < this.menu.size();i++)
                {
                    if(Integer.parseInt(itemNumber)==this.menu.get(i).getIndex())
                    {
                        pedido.addArticulo(this.menu.get(i));
                    }
                }
            }
            
        }while(!itemNumber.equals("q"));

        System.out.println("Gracias, "+pedido.getNombre()+". Aqui esta el detalle de tu orden:");
        pedido.display();
        
    }

}
