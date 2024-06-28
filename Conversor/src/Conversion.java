public class Conversion {

private int elegido;
private String cambio;

//elegido=0;




    public Conversion() {
        this.elegido = elegido;
        this.cambio = cambio;



    }



    public String getCambio() {
        return cambio;
    }




    public void setCambio(String cambio) {
        this.cambio = cambio;
    }



    public int getElegido() {
        return elegido;
    }

    public void setElegido(int elegido) {
        this.elegido = elegido;
    }

    public void Cambio (){
      if (elegido==1) {
            this.cambio = "https://v6.exchangerate-api.com/v6/4d48f732fb0f0cad780210ce/pair/USD/CLP";
        }

        if (elegido==2) {
            this.cambio = "https://v6.exchangerate-api.com/v6/4d48f732fb0f0cad780210ce/pair/CLP/USD";
        }

        if (elegido==3) {
            this.cambio = "https://v6.exchangerate-api.com/v6/4d48f732fb0f0cad780210ce/pair/USD/PYG";
        }

        if (elegido==4) {
            this.cambio = "https://v6.exchangerate-api.com/v6/4d48f732fb0f0cad780210ce/pair/PYG/USD";
        }

        if (elegido==5) {
            this.cambio = "https://v6.exchangerate-api.com/v6/4d48f732fb0f0cad780210ce/pair/USD/ARS";
        }

        if (elegido==6) {
            this.cambio = "https://v6.exchangerate-api.com/v6/4d48f732fb0f0cad780210ce/pair/ARS/USD";
        }

    }




}
