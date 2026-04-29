package domain.model;

import domain.enums.LineaProduccion;
import domain.util.interfaces.Conectable;

public class Tablet extends Producto implements Conectable
{

    private final int megapixeles;
    private final boolean tieneStylus;

    public Tablet(double precioBase, int megapixeles, boolean tieneStylus,
            String numeroSerie, String sku, String modelo,
            LineaProduccion lineaProduccion)
    {
        super(precioBase, numeroSerie, sku, modelo, lineaProduccion);
        this.megapixeles = megapixeles;
        this.tieneStylus = tieneStylus;
    }

    public int getMegapixeles()
    {
        return megapixeles;
    }

    public boolean isTieneStylus()
    {
        return tieneStylus;
    }
    
    @Override
    public void realizarPruebaCalidad()
    {
        System.out.println("Realizando prueba de calidad de Tablet");
    }

    @Override
    public int calcularGarantia()
    {
        if(getPrecioBase() > 800){
            return 32;
        }
        return 24;
    }

    @Override
    public void conectarWifi()
    {
        System.out.println("Conectando a wi-fi");
    }

    @Override
    public void desconectarWifi()
    {
        System.out.println("Desconectando de wi-fi");
    }

}
