import com.google.gson.annotations.SerializedName;

public class Respuesta {

    @SerializedName("conversion_rate")
    private double tipoDeCambio;

    public Respuesta(double tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    public double getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(double tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }
}
