package poo;

import domain.model.Telefono;

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
        
        System.out.println(t);
        
        t.iniciarPrueba();
        t.aprobar();
        t.empaquetar();
        
        System.out.println(t);
    }
}
