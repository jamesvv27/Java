package domain.model;

import domain.enums.LineaProduccion;

public class Television extends Producto
{

    private final String pulgadas;
    private final String fabricante;

    public Television(double precioBase, String pulgadas, String fabricante,
            String numeroSerie, String sku, String modelo,
            LineaProduccion lineaProduccion)
    {
        super(precioBase, numeroSerie, sku, modelo, lineaProduccion);
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
        System.out.println("Realizando prueba de calidad de TV");
    }

    @Override
    public int calcularGarantia()
    {
        if(getPrecioBase() > 1000){
            return 32;
        }
        return 12;
    }
    
}
