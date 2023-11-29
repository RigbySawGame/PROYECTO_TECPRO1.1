
package Pack_classes;

public class RegistroDePelicula {
    
    private String Sala;
    private String Horario;
    private String Niño;
    private String Adulto;
    private String AdultoMayor;
    private String Pelicula;
    private String dia;
    private int cantidadNiño;
    private int cantidadAdulto;
    private int cantidadAdultoMayor;
    
    


    public RegistroDePelicula() {
    }

    public RegistroDePelicula(String Sala, String Horario, String Niño, String Adulto, String AdultoMayor, String Pelicula, String dia, int cantidadNiño, int cantidadAdulto, int cantidadAdultoMayor) {
        this.Sala = Sala;
        this.Horario = Horario;
        this.Niño = Niño;
        this.Adulto = Adulto;
        this.AdultoMayor = AdultoMayor;
        this.Pelicula = Pelicula;
        this.dia = dia;
        this.cantidadNiño = cantidadNiño;
        this.cantidadAdulto = cantidadAdulto;
        this.cantidadAdultoMayor = cantidadAdultoMayor;
    }

    

    public String getSala() {
        return Sala;
    }

    public void setSala(String Sala) {
        this.Sala = Sala;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getNiño() {
        return Niño;
    }

    public void setNiño(String Niño) {
        this.Niño = Niño;
    }

    public String getAdulto() {
        return Adulto;
    }

    public void setAdulto(String Adulto) {
        this.Adulto = Adulto;
    }

    public String getAdultoMayor() {
        return AdultoMayor;
    }

    public void setAdultoMayor(String AdultoMayor) {
        this.AdultoMayor = AdultoMayor;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }


    public int getCantidadNiño() {
        return cantidadNiño;
    }

    public void setCantidadNiño(int cantidadNiño) {
        this.cantidadNiño = cantidadNiño;
    }

    public int getCantidadAdulto() {
        return cantidadAdulto;
    }

    public void setCantidadAdulto(int cantidadAdulto) {
        this.cantidadAdulto = cantidadAdulto;
    }

    public int getCantidadAdultoMayor() {
        return cantidadAdultoMayor;
    }

    public void setCantidadAdultoMayor(int cantidadAdultoMayor) {
        this.cantidadAdultoMayor = cantidadAdultoMayor;
    }

    public double PrecioDeEntradaAdulto(){
        //Adulto
        if(Sala.equalsIgnoreCase("2D")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 14*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("2D")  && dia.equalsIgnoreCase("Martes"))return 12.5*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("2D")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 17.5*cantidadAdulto;
        
        else if(Sala.equalsIgnoreCase("3D")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 19.5*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("3D")  && dia.equalsIgnoreCase("Martes"))return 14.5*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("3D")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 20*cantidadAdulto;
        
        else if(Sala.equalsIgnoreCase("2D XD")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 22.5*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("2D XD")  && dia.equalsIgnoreCase("Martes"))return 18.5*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("2D XD")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 22.5*cantidadAdulto;
        
        else if(Sala.equalsIgnoreCase("3D XD")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 23.5*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("3D XD")  && dia.equalsIgnoreCase("Martes"))return 19.5*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("3D XD")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 23.5*cantidadAdulto;
        
        else if(Sala.equalsIgnoreCase("DBOX 2D")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 32.5*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("DBOX 2D")  && dia.equalsIgnoreCase("Martes"))return 30.5*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("DBOX 2D")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 32.5*cantidadAdulto;
        
        else if(Sala.equalsIgnoreCase("DBOX 3D")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 35*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("DBOX 3D")  && dia.equalsIgnoreCase("Martes"))return 33*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("DBOX 3D")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 35*cantidadAdulto;
        
        else if(Sala.equalsIgnoreCase("DBOX 2D XD")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 37*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("DBOX 2D XD")  && dia.equalsIgnoreCase("Martes"))return 34*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("DBOX 2D XD")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 37*cantidadAdulto;
        
        else if(Sala.equalsIgnoreCase("DBOX 3D XD")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 38*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("DBOX 3D XD")  && dia.equalsIgnoreCase("Martes"))return 36*cantidadAdulto;
        else if(Sala.equalsIgnoreCase("DBOX 3D XD")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 38*cantidadAdulto;
        else return 0;
    }
        public double PrecioDeEntradaNiños(){
        //Niños
        
         if(Sala.equalsIgnoreCase("2D")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 13*cantidadNiño;
        else if(Sala.equalsIgnoreCase("2D")  && dia.equalsIgnoreCase("Martes"))return 12.5*cantidadNiño;
        else if(Sala.equalsIgnoreCase("2D")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 15.5*cantidadNiño;
        
        else if(Sala.equalsIgnoreCase("3D")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 18.5*cantidadNiño;
        else if(Sala.equalsIgnoreCase("3D")  && dia.equalsIgnoreCase("Martes"))return 14.5*cantidadNiño;
        else if(Sala.equalsIgnoreCase("3D")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 19*cantidadNiño;
        
        else if(Sala.equalsIgnoreCase("2D XD")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 20.5*cantidadNiño;
        else if(Sala.equalsIgnoreCase("2D XD")  && dia.equalsIgnoreCase("Martes"))return 18.5*cantidadNiño;
        else if(Sala.equalsIgnoreCase("2D XD")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 20.5*cantidadNiño;
        
        else if(Sala.equalsIgnoreCase("3D XD")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 21.5*cantidadNiño;
        else if(Sala.equalsIgnoreCase("3D XD")  && dia.equalsIgnoreCase("Martes"))return 19.5*cantidadNiño;
        else if(Sala.equalsIgnoreCase("3D XD")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 21.5*cantidadNiño;
        
        else if(Sala.equalsIgnoreCase("DBOX 2D")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 30.5*cantidadNiño;
        else if(Sala.equalsIgnoreCase("DBOX 2D")  && dia.equalsIgnoreCase("Martes"))return 30.5*cantidadNiño;
        else if(Sala.equalsIgnoreCase("DBOX 2D")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 30.5*cantidadNiño;
        
        else if(Sala.equalsIgnoreCase("DBOX 3D")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 33*cantidadNiño;
        else if(Sala.equalsIgnoreCase("DBOX 3D")  && dia.equalsIgnoreCase("Martes"))return 33*cantidadNiño;
        else if(Sala.equalsIgnoreCase("DBOX 3D")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 33*cantidadNiño;
        
        else if(Sala.equalsIgnoreCase("DBOX 2D XD")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 34*cantidadNiño;
        else if(Sala.equalsIgnoreCase("DBOX 2D XD")  && dia.equalsIgnoreCase("Martes"))return 34*cantidadNiño;
        else if(Sala.equalsIgnoreCase("DBOX 2D XD")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 34*cantidadNiño;
        
        else if(Sala.equalsIgnoreCase("DBOX 3D XD")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 36*cantidadNiño;
        else if(Sala.equalsIgnoreCase("DBOX 3D XD")  && dia.equalsIgnoreCase("Martes"))return 36*cantidadNiño;
        else if(Sala.equalsIgnoreCase("DBOX 3D XD")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 36*cantidadNiño;
        else return 0;
        }
        public double PrecioDeEntradaAdultoMayor(){
        //Adulto Mayor
        
        if(Sala.equalsIgnoreCase("2D")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 13*cantidadAdultoMayor;
        else if(Sala.equalsIgnoreCase("2D")  && dia.equalsIgnoreCase("Martes"))return 12.5*cantidadAdultoMayor;
        else if(Sala.equalsIgnoreCase("2D")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 15.5*cantidadAdultoMayor;
        
        else if(Sala.equalsIgnoreCase("3D")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 18.5*cantidadAdultoMayor;
        else if(Sala.equalsIgnoreCase("3D")  && dia.equalsIgnoreCase("Martes"))return 14.5*cantidadAdultoMayor;
        else if(Sala.equalsIgnoreCase("3D")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 19*cantidadAdultoMayor;
        
        else if(Sala.equalsIgnoreCase("2D XD")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 20.5*cantidadAdultoMayor;
        else if(Sala.equalsIgnoreCase("2D XD")  && dia.equalsIgnoreCase("Martes"))return 18.5*cantidadAdultoMayor;
        else if(Sala.equalsIgnoreCase("2D XD")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 20.5*cantidadAdultoMayor;
        
        else if(Sala.equalsIgnoreCase("3D XD")  && dia.equalsIgnoreCase("Lunes y Miercoles"))return 21.5*cantidadAdultoMayor;
        else if(Sala.equalsIgnoreCase("3D XD")  && dia.equalsIgnoreCase("Martes"))return 19.5*cantidadAdultoMayor;
        else if(Sala.equalsIgnoreCase("3D XD")  && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 21.5*cantidadAdultoMayor;
        
//        else if(Sala.equalsIgnoreCase("DBOX 2D") && AdultoMayorR==true && dia.equalsIgnoreCase("Lunes y Miercoles"))return 32.5;
//        else if(Sala.equalsIgnoreCase("DBOX 2D") && AdultoMayorR==true && dia.equalsIgnoreCase("Martes"))return 30.5;
//        else if(Sala.equalsIgnoreCase("DBOX 2D") && AdultoMayorR==true && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 32.5;
//        
//        else if(Sala.equalsIgnoreCase("DBOX 3D") && AdultoMayorR==true && dia.equalsIgnoreCase("Lunes y Miercoles"))return 35;
//        else if(Sala.equalsIgnoreCase("DBOX 3D") && AdultoMayorR==true && dia.equalsIgnoreCase("Martes"))return 33;
//        else if(Sala.equalsIgnoreCase("DBOX 3D") && AdultoMayorR==true && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 35;
//        
//        else if(Sala.equalsIgnoreCase("DBOX 2D XD") && AdultoMayorR==true && dia.equalsIgnoreCase("Lunes y Miercoles"))return 37;
//        else if(Sala.equalsIgnoreCase("DBOX 2D XD") && AdultoMayorR==true && dia.equalsIgnoreCase("Martes"))return 34;
//        else if(Sala.equalsIgnoreCase("DBOX 2D XD") && AdultoMayorR==true && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 37;
//        
//        else if(Sala.equalsIgnoreCase("DBOX 3D XD") && AdultoMayorR==true && dia.equalsIgnoreCase("Lunes y Miercoles"))return 38;
//        else if(Sala.equalsIgnoreCase("DBOX 3D XD") && AdultoMayorR==true && dia.equalsIgnoreCase("Martes"))return 36;
//        else if(Sala.equalsIgnoreCase("DBOX 3D XD") && AdultoMayorR==true && dia.equalsIgnoreCase("Jueves a Domingo y Feriados"))return 38;
        
        
        else return 0.0;
}

    
    public double Igv(){
        return (PrecioDeEntradaAdulto()*0.18)+(PrecioDeEntradaNiños()*0.18)+(PrecioDeEntradaAdultoMayor()*0.18) ;
    }

    public double TotalApagar(){
        return PrecioDeEntradaAdulto()+PrecioDeEntradaNiños()+PrecioDeEntradaAdultoMayor()+Igv(); 
    }

    
}