package Pack_classes;

public class CLIENTE {

    private String CliNombre;
    private String CliApellido;
    private String CliNumCelular;
    private String CliCorreo;
    private String CliUsuario;
    private String CliPassword;
    private int CliEdad;


    public CLIENTE() {
    }

    public CLIENTE(String CliNombre, String CliApellido, String CliNumCelular, String CliCorreo, String CliUsuario, String CliPassword, int CliEdad) {
        this.CliNombre = CliNombre;
        this.CliApellido = CliApellido;
        this.CliNumCelular = CliNumCelular;
        this.CliCorreo = CliCorreo;
        this.CliUsuario = CliUsuario;
        this.CliPassword = CliPassword;
        this.CliEdad = CliEdad;
    }



    public String getCliNombre() {
        return CliNombre;
    }

    public void setCliNombre(String CliNombre) {
        this.CliNombre = CliNombre;
    }

    public String getCliApellido() {
        return CliApellido;
    }

    public void setCliApellido(String CliApellido) {
        this.CliApellido = CliApellido;
    }

    public String getCliUsuario() {
        return CliUsuario;
    }

    public void setCliUsuario(String CliUsuario) {
        this.CliUsuario = CliUsuario;
    }

    public String getCliPassword() {
        return CliPassword;
    }

    public void setCliPassword(String CliPassword) {
        this.CliPassword = CliPassword;
    }

    public int getCliEdad() {
        return CliEdad;
    }

    public void setCliEdad(int CliEdad) {
        this.CliEdad = CliEdad;
    }

    public String getCliNumCelular() {
        return CliNumCelular;
    }

    public void setCliNumCelular(String CliNumCelular) {
        this.CliNumCelular = CliNumCelular;
    }

    public String getCliCorreo() {
        return CliCorreo;
    }

    public void setCliCorreo(String CliCorreo) {
        this.CliCorreo = CliCorreo;
    }
    
    
    
}
