package Pack_classes;

public class Movie {
 
    private int day;
    private int month;
    private int year;
    private String hall;
    private String synopsis;
    private String duration;
    private String name;
    private String genre;
     

    public Movie() {
    }

    public Movie(int day, int month, int year, String hall, String synopsis, String duration, String name, String genre) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hall = hall;
        this.synopsis = synopsis;
        this.duration = duration;
        this.name = name;
        this.genre=genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   
    
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
   public String ShowDetails(){
       return "Titulo:\t"+getName()+
               "\nDuracion:\t"+getDuration()+
               "\nGenero:\t"+getGenre()+
               "\n\n"+getSynopsis();
               
   } 
    
}
