package Pack_classes;

public class TRABAJADORES {
    private String codigo;
    private String TrabNombre;
    private String TrabApellido;
    private int TrabEstadoCivil;
    private int TrabGenero;
    private int TrabEdad;
    private int TrabCantidadHijos;
    private String TrabPassword;
    private String TrabUsuario;
    private int CargNombre;  //Puesto de trabajo: Administrador, BoleteriaCine, BoleteriaConfiteria
                                //Sueldo x Cargo:        1500            950                980             

    public TRABAJADORES() {
    }

    public TRABAJADORES(String codigo, String TrabNombre, String TrabApellido, int TrabEstadoCivil, int TrabGenero, int TrabEdad, int TrabCantidadHijos, String TrabPassword, String TrabUsuario, int CargNombre) {
        this.codigo = codigo;
        this.TrabNombre = TrabNombre;
        this.TrabApellido = TrabApellido;
        this.TrabEstadoCivil = TrabEstadoCivil;
        this.TrabGenero = TrabGenero;
        this.TrabEdad = TrabEdad;
        this.TrabCantidadHijos = TrabCantidadHijos;
        this.TrabPassword = TrabPassword;
        this.TrabUsuario = TrabUsuario;
        this.CargNombre = CargNombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTrabNombre() {
        return TrabNombre;
    }

    public void setTrabNombre(String TrabNombre) {
        this.TrabNombre = TrabNombre;
    }

    public String getTrabApellido() {
        return TrabApellido;
    }

    public void setTrabApellido(String TrabApellido) {
        this.TrabApellido = TrabApellido;
    }

    public int getTrabEstadoCivil() {
        return TrabEstadoCivil;
    }

    public void setTrabEstadoCivil(int TrabEstadoCivil) {
        this.TrabEstadoCivil = TrabEstadoCivil;
    }

    public int getTrabGenero() {
        return TrabGenero;
    }

    public void setTrabGenero(int TrabGenero) {
        this.TrabGenero = TrabGenero;
    }

    public int getTrabEdad() {
        return TrabEdad;
    }

    public void setTrabEdad(int TrabEdad) {
        this.TrabEdad = TrabEdad;
    }

    public int getTrabCantidadHijos() {
        return TrabCantidadHijos;
    }

    public void setTrabCantidadHijos(int TrabCantidadHijos) {
        this.TrabCantidadHijos = TrabCantidadHijos;
    }

    public String getTrabPassword() {
        return TrabPassword;
    }

    public void setTrabPassword(String TrabPassword) {
        this.TrabPassword = TrabPassword;
    }

    public String getTrabUsuario() {
        return TrabUsuario;
    }

    public void setTrabUsuario(String TrabUsuario) {
        this.TrabUsuario = TrabUsuario;
    }

    public int getCargNombre() {
        return CargNombre;
    }

    public void setCargNombre(int CargNombre) {
        this.CargNombre = CargNombre;
    }
    
    public String cargo(){     
        if(CargNombre==1)
            return "Administrativa";
        else if(CargNombre==2)
            return "Boleteria";
        else if(CargNombre==3)
            return "Confiteria";
        else
            return ""; 
    }
    public String generos(){     
        if(TrabGenero==1)
            return "MASCULINO";
        else if(TrabGenero==2)
            return "FEMENINO";
        else
            return ""; 
    }
    
    public String EstadoCivil(){     
        if(CargNombre==1)
            return "SOLTERO";
        else if(CargNombre==2)
            return "CASADO";
        else if(CargNombre==3)
            return "VIUDO";
        else if(CargNombre==4)
            return "DIVORSIADO";
        else
            return ""; 
    }
    
    //GENERACION DEL CODIGO DE USUARIO
    public String GeneracionCodigo(){
        return TrabNombre.substring(0, 3) + TrabApellido.substring(0, 3) + TrabEdad + TrabCantidadHijos;
    } 
    
    //SISTEMA DE PAGO
    public double SueldoBasico(){
    
        if(CargNombre==0)
            return 1500.00;
        else if(CargNombre==1)
            return 950.00;
        else if(CargNombre==2)
            return 980.00;
        else 
            return 0.0;
    }

 
    

    
    
}
