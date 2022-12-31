package kata6;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import static java.util.stream.Collectors.joining;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Kata6 {    
    
    public static void main(String[] args) throws IOException, JAXBException {

        String json = read("https://api.open-meteo.com/v1/forecast?latitude=52."
                + "52&longitude=13.41&current_weather=true&hourly=temperature"
                + "_2m,relativehumidity_2m,windspeed_10m");
        
        System.out.println("===================================");
        System.out.println("Json recogido por url:");
        System.out.println(json);
        System.out.println("===================================");
        
        Gson gson = new Gson();
        Weather weather = gson.fromJson(json, Weather.class);
        
        
        JAXBContext context = JAXBContext.newInstance(Weather.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        System.out.println("Json convertido a xml");
        System.out.println("===================================");
        marshaller.marshal(weather, System.out);     
        
    }
    
    private static String read(String url) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()))) {
            return reader.lines().collect(joining(" "));
        }
    }    
}
