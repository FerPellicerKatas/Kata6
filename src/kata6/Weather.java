package kata6;

import com.google.gson.annotations.SerializedName;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Weather {
    @SerializedName("weather")
    public String weather;
    public Double latitude;
    public Double longitude;
    public Double generationtime_ms;
    public Double utc_offset_seconds;
    public String timezone;
    public String timezone_abbreviation;
    public Double elevation;
    public Current_weather current_weather;
    public Hourly_units hourly_units;
    public Hourly hourly;
    
    
    @XmlRootElement
    public static class Current_weather {
        @SerializedName("current_weather")
        public String current_weather;
        public Double temperature;
        public Double windspeed;
        public Double winddirection;
        public Double weathercode;
        public String time;
   }
    @XmlRootElement
    public static class Hourly_units {
        @SerializedName("hourly_units")
        public String hourly_units;
        public String time;
        public String temperature_2m;
        public String relativehumidity_2m;
        public String windspeed_10m;
   }
    @XmlRootElement
    public static class Hourly {
        @SerializedName("hourly")
        public String hourly;
        
        @XmlElementWrapper(name = "times")
        @XmlElement(name = "time")
        public String[] time;
        
        @XmlElementWrapper(name = "temperatures")
        @XmlElement(name = "temperature")
        public Double[] temperature_2m;
        
        @XmlElementWrapper(name = "relativehumidities_2m")
        @XmlElement(name = "relativehumidity_2m")
        public Double[] relativehumidity_2m;
        
        @XmlElementWrapper(name = "windspeeds_10m")
        @XmlElement(name = "windspeed_10m")
        public Double[] windspeed_10m;
   }    
}

