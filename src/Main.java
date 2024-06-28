import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

   // private int opcion;
    public static void main(String[] args) throws IOException, InterruptedException {
       Eleccion miEleccion= new Eleccion();
        miEleccion.setEleccion(0);

        while (miEleccion.getEleccion()!=7) {

            Scanner lectura = new Scanner(System.in);
            System.out.println("\n***************************************\n" +
                    "Bienvenido/a al Conversor de Monedas\n" +
                    "1) Dólar ==>> Peso Chileno\n" +
                    "2) Peso Chileno ==>> Dólar\n" +
                    "3) Dólar ==>> Guaraní\n" +
                    "4) Guaraní ==>> Dólar\n" +
                    "5) Dólar ==>> Peso Argentino\n" +
                    "6) Peso Argentino ==>> Dólar\n" +
                    "7) Salir\n" +
                    "Elija una opción valida\n" +
                    "***************************************\n");

            try {
                miEleccion.setEleccion(lectura.nextInt());

                if (miEleccion.getEleccion()==7){

                    System.out.println("Gracias por usar nuestro conversor de moneda");
                    break;
                }

                else {

                    Conversion miConversion = new Conversion();
                    miConversion.setElegido(miEleccion.getEleccion());
                    miConversion.Cambio();

                  //  String base = "USD";
                    //String destino = "CLP";
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
//                  .uri(URI.create("https://v6.exchangerate-api.com/v6/4d48f732fb0f0cad780210ce/pair/" + base + "/" + destino))
                            .uri(URI.create(miConversion.getCambio()))
                            .build();

                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());

                    String json = response.body();
                    //System.out.println(json);

                    Gson gson = new Gson();

                    Respuesta respuesta = gson.fromJson(json, Respuesta.class);

                    System.out.println("El tipo de Cambio escogido es:" + respuesta.getTipoDeCambio() + "\n");

                }



            }
            catch(InputMismatchException e)
            {
                System.out.println("Ocurrio un error en la elección de la opción");
            }




            //  PrincipalBusqueda nueva= new PrincipalBusqueda();
           // nueva.main();
        }






    }


}