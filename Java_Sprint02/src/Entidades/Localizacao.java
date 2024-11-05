package Entidades;

public class Localizacao {
    private double longitude;
    private double latitude;

    //Métodos
    public String getCoordenadas() {
        return "Latitude: " + latitude + ", Longitude: " + longitude;
    }

    //Construtor vazio
    public Localizacao() {
    }

    //Construtor completo
    public Localizacao(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    // Getters e Setters
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
