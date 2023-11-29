package Pack_classes;

public class PELICULAS {

    private String PeliNombre;
    private String PeliSinopsis;
    private int PeliDuracion;
    private int PeliEdadMinima;
    //UBICACION
    private boolean PlazaLimaSur;
    private boolean JokeyPlaza;
    private boolean Angamos;
    private boolean MegaPlaza;
    private boolean Bellavista;
    private boolean SanMiguel;
    //TIPO SALA
    private boolean Peli2D;
    private boolean Peli3D;
    private boolean Peli2DXD;
    private boolean Peli3DXD;
    private boolean PeliDBOX2D;
    private boolean PeliDBOX3D;
    private boolean PeliDBOX2DXD;
    private boolean PeliDBOX3DXD;

    public PELICULAS() {
    }

    public PELICULAS(String PeliNombre, String PeliSinopsis, int PeliDuracion, int PeliEdadMinima, boolean PlazaLimaSur, boolean JokeyPlaza, boolean Angamos, boolean MegaPlaza, boolean Bellavista, boolean SanMiguel, boolean Peli2D, boolean Peli3D, boolean Peli2DXD, boolean Peli3DXD, boolean PeliDBOX2D, boolean PeliDBOX3D, boolean PeliDBOX2DXD, boolean PeliDBOX3DXD) {
        this.PeliNombre = PeliNombre;
        this.PeliSinopsis = PeliSinopsis;
        this.PeliDuracion = PeliDuracion;
        this.PeliEdadMinima = PeliEdadMinima;
        this.PlazaLimaSur = PlazaLimaSur;
        this.JokeyPlaza = JokeyPlaza;
        this.Angamos = Angamos;
        this.MegaPlaza = MegaPlaza;
        this.Bellavista = Bellavista;
        this.SanMiguel = SanMiguel;
        this.Peli2D = Peli2D;
        this.Peli3D = Peli3D;
        this.Peli2DXD = Peli2DXD;
        this.Peli3DXD = Peli3DXD;
        this.PeliDBOX2D = PeliDBOX2D;
        this.PeliDBOX3D = PeliDBOX3D;
        this.PeliDBOX2DXD = PeliDBOX2DXD;
        this.PeliDBOX3DXD = PeliDBOX3DXD;
    }

    public boolean isPeliDBOX3DXD() {
        return PeliDBOX3DXD;
    }

    public void setPeliDBOX3DXD(boolean PeliDBOX3DXD) {
        this.PeliDBOX3DXD = PeliDBOX3DXD;
    }

    public String getPeliNombre() {
        return PeliNombre;
    }

    public void setPeliNombre(String PeliNombre) {
        this.PeliNombre = PeliNombre;
    }

    public String getPeliSinopsis() {
        return PeliSinopsis;
    }

    public void setPeliSinopsis(String PeliSinopsis) {
        this.PeliSinopsis = PeliSinopsis;
    }

    public int getPeliDuracion() {
        return PeliDuracion;
    }

    public void setPeliDuracion(int PeliDuracion) {
        this.PeliDuracion = PeliDuracion;
    }

    public int getPeliEdadMinima() {
        return PeliEdadMinima;
    }

    public void setPeliEdadMinima(int PeliEdadMinima) {
        this.PeliEdadMinima = PeliEdadMinima;
    }

    public boolean isPlazaLimaSur() {
        return PlazaLimaSur;
    }

    public void setPlazaLimaSur(boolean PlazaLimaSur) {
        this.PlazaLimaSur = PlazaLimaSur;
    }

    public boolean isJokeyPlaza() {
        return JokeyPlaza;
    }

    public void setJokeyPlaza(boolean JokeyPlaza) {
        this.JokeyPlaza = JokeyPlaza;
    }

    public boolean isAngamos() {
        return Angamos;
    }

    public void setAngamos(boolean Angamos) {
        this.Angamos = Angamos;
    }

    public boolean isMegaPlaza() {
        return MegaPlaza;
    }

    public void setMegaPlaza(boolean MegaPlaza) {
        this.MegaPlaza = MegaPlaza;
    }

    public boolean isBellavista() {
        return Bellavista;
    }

    public void setBellavista(boolean Bellavista) {
        this.Bellavista = Bellavista;
    }

    public boolean isSanMiguel() {
        return SanMiguel;
    }

    public void setSanMiguel(boolean SanMiguel) {
        this.SanMiguel = SanMiguel;
    }

    public boolean isPeli2D() {
        return Peli2D;
    }

    public void setPeli2D(boolean Peli2D) {
        this.Peli2D = Peli2D;
    }

    public boolean isPeli3D() {
        return Peli3D;
    }

    public void setPeli3D(boolean Peli3D) {
        this.Peli3D = Peli3D;
    }

    public boolean isPeli2DXD() {
        return Peli2DXD;
    }

    public void setPeli2DXD(boolean Peli2DXD) {
        this.Peli2DXD = Peli2DXD;
    }

    public boolean isPeli3DXD() {
        return Peli3DXD;
    }

    public void setPeli3DXD(boolean Peli3DXD) {
        this.Peli3DXD = Peli3DXD;
    }

    public boolean isPeliDBOX2D() {
        return PeliDBOX2D;
    }

    public void setPeliDBOX2D(boolean PeliDBOX2D) {
        this.PeliDBOX2D = PeliDBOX2D;
    }

    public boolean isPeliDBOX3D() {
        return PeliDBOX3D;
    }

    public void setPeliDBOX3D(boolean PeliDBOX3D) {
        this.PeliDBOX3D = PeliDBOX3D;
    }

    public boolean isPeliDBOX2DXD() {
        return PeliDBOX2DXD;
    }

    public void setPeliDBOX2DXD(boolean PeliDBOX2DXD) {
        this.PeliDBOX2DXD = PeliDBOX2DXD;
    }
    
    
    //GENERACION DEL CODIGO DE USUARIO
    public String GeneracionCodigo(){
    
        return PeliNombre.substring(0, 4) + PeliDuracion;
    }
    
    
}
