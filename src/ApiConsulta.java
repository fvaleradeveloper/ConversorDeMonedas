//importar lo necesario
import java.io.BufferedReader;
import java.io.InputStreamReader;  
import java.net.HttpURLConnection;  
import java.net.URL;  
//función ApiConsulta: Motor principal de consulta
public class ApiConsulta {  
    //Ojo: Existen librerías para esconder la API Key..
    // ejercicio interesante, buscar luego. Buscar algo como: dotenv-java
    //mencionado en el Discord
    private final String API_KEY = "3c78b27fb6bf1a971a4bc129";  
    private final String URL_BASE = "https://v6.exchangerate-api.com/v6/";  

    public Moneda[] obtenerMonedas() {  
        Moneda[] monedas = new Moneda[5];  

        try {  
            String urlString = URL_BASE + API_KEY + "/latest/USD"; // USD es la divisa base  
            URL url = new URL(urlString);  
            HttpURLConnection con = (HttpURLConnection) url.openConnection();  
            con.setRequestMethod("GET");  

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));  
            String inputLine;  
            StringBuilder response = new StringBuilder();  

            while ((inputLine = in.readLine()) != null) {  
                response.append(inputLine);  
            }  
            in.close();  

            // Procesar la respuesta JSON  
            String jsonResponse = response.toString();  
            String[] monedasCodigos = {"PEN", "ARS", "BRL", "COP", "VES"};  
            for (int i = 0; i < monedasCodigos.length; i++) {  
                double tasaDeCambio = parseTasaDeCambio(jsonResponse, monedasCodigos[i]);
                //Se utiliza el método de Monedas.java y se llena el array
                monedas[i] = new Moneda(monedasCodigos[i], tasaDeCambio);  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return monedas;  
    }  

    private double parseTasaDeCambio(String jsonResponse, String moneda)
    {
        // Aquí se puede usar una librería JSON como Gson para procesar la respuesta.
        // Una solución es buscar la tasa de cambio en el string.
        String key = "\"" + moneda + "\":";  
        int index = jsonResponse.indexOf(key);
        //Si index no es vacio
        if (index != -1) {

            int startIndex = index + key.length();  
            int endIndex = jsonResponse.indexOf(",", startIndex);  
            String tasaString = jsonResponse.substring(startIndex, endIndex);
            //Lo convierte en double
            return Double.parseDouble(tasaString);  
        }  
        return 0;  
    }  
}  
