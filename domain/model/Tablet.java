package domain.model;

import domain.enums.LineaProduccion;

public class Tablet extends Producto
{

    private final int megapixeles;
    private final boolean tieneStylus;

    public Tablet(int megapixeles, boolean tieneStylus, String numeroSerie, String sku, String modelo, LineaProduccion lineaProduccion)
    {
        super(numeroSerie, sku, modelo, lineaProduccion);
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
