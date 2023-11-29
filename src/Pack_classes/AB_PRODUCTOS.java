package Pack_classes;

public class AB_PRODUCTOS {
    
    private String ProdNombre;
    private String ProDetalles;
    private double ProPrecio;

    public AB_PRODUCTOS() {
    }

    public AB_PRODUCTOS(String ProdNombre, String ProDetalles, double ProPrecio) {
        this.ProdNombre = ProdNombre;
        this.ProDetalles = ProDetalles;
        this.ProPrecio = ProPrecio;
    }


    
    public double getProPrecio() {
        return ProPrecio;
    }

    public void setProPrecio(double ProPrecio) {
        this.ProPrecio = ProPrecio;
    }

    public String getProDetalles() {
        return ProDetalles;
    }

    public void setProDetalles(String ProDetalles) {
        this.ProDetalles = ProDetalles;
    }
    
    public String getProdNombre() {
        return ProdNombre;
    }

    public void setProdNombre(String ProdNombre) {
        this.ProdNombre = ProdNombre;
    }

    
}
