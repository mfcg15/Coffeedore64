public class TestPedidos 
{
    public static void main(String[] args) 
    {
        Articulo articulo1 = new Articulo(0,"banana",1.600);
        Articulo articulo2 = new Articulo(1,"café", 1.200);
        Articulo articulo3 = new Articulo(2,"latte", 3.600);
        Articulo articulo4 = new Articulo(3,"capuchino", 2.400);
        Articulo articulo5 = new Articulo(4,"muffin", 3.200);
        
        PedidoKiosko kiosko = new PedidoKiosko();

        kiosko.addMenuItem(articulo1);
        kiosko.addMenuItem(articulo2);
        kiosko.addMenuItem(articulo3);
        kiosko.addMenuItem(articulo4);
        kiosko.addMenuItem(articulo5);

        kiosko.newOrder();

    }
}
