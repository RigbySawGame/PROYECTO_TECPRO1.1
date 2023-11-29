package Pack_classes;

public class Ubicacion {
   private String cine; 
   private boolean cine1;
   private boolean cine2;
   private boolean cine3;
   private boolean cine4;
   private boolean cine5;
   private boolean cine6;

    public Ubicacion() {
    }

    public Ubicacion(String cine, boolean cine1, boolean cine2, boolean cine3, boolean cine4, boolean cine5, boolean cine6) {
        this.cine = cine;
        this.cine1 = cine1;
        this.cine2 = cine2;
        this.cine3 = cine3;
        this.cine4 = cine4;
        this.cine5 = cine5;
        this.cine6 = cine6;
    }
   
     public String getCine() {
        return cine;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }

    public boolean isCine1() {
        return cine1;
    }

    public void setCine1(boolean cine1) {
        this.cine1 = cine1;
    }

    public boolean isCine2() {
        return cine2;
    }

    public void setCine2(boolean cine2) {
        this.cine2 = cine2;
    }

    public boolean isCine3() {
        return cine3;
    }

    public void setCine3(boolean cine3) {
        this.cine3 = cine3;
    }

    public boolean isCine4() {
        return cine4;
    }

    public void setCine4(boolean cine4) {
        this.cine4 = cine4;
    }

    public boolean isCine5() {
        return cine5;
    }

    public void setCine5(boolean cine5) {
        this.cine5 = cine5;
    }

    public boolean isCine6() {
        return cine6;
    }

    public void setCine6(boolean cine6) {
        this.cine6 = cine6;
    }  
    
   public String UbicacionDelCine(){
       if(cine1==true)return "CINEMARK PLAZA LIMA SUR";
       else if(cine1==true)return "CINEMARK ANGAMOS";
       else if(cine1==true)return "CINEMARK BELLAVISTA";
       else if(cine1==true)return "CINEMARK JOCKEY PLAZA";
       else if(cine1==true)return "CINEMARK MEGA PLAZA";
       else if(cine1==true)return "CINEMARK SAN MIGUEL";
       else return "";
   }


}
