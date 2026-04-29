package domain.model;

import domain.enums.LineaProduccion;

public class Television extends Producto
{

    private final String pulgadas;
    private final String fabricante;

    public Television(String pulgadas, String fabricante, String numeroSerie, String sku, String modelo, LineaProduccion lineaProduccion)
    {
        super(numeroSerie, sku, modelo, lineaProduccion);
        this.pulgadas = pulgadas;
        this.fabricante = fabricante;
    }

    public String getPulgadas()
    {
        return pulgadas;
    }

    public String getFabricante()
    {
        return fabricante;
    }
    
    

    @Override
    public void realizarPruebaCalidad()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
