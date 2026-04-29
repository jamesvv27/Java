package poo;

import domain.model.Producto;
import domain.model.Telefono;
import java.util.ArrayList;

public class Poo
{
    public static void main(String[] args)
    {
        Telefono t = new Telefono(
                "SN-90001", 
                "SKU-A10",
                "Galaxy Demo",
                "359111111111111",
                8,
                256
        );
        
        ArrayList<Producto> telesfonos = new ArrayList<Producto>();
        telesfonos.add(t);
        
        System.out.println(t);
        
        t.iniciarPrueba();
        t.aprobar();
        t.empaquetar();
        
        System.out.println(t);
        
        t.conectarWifi();
    }
}
