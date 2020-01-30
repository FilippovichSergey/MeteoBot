package bot.telegram.meteo;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Weather {

    public static String getWeather(String message, Model model) throws IOException {
        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + message + "&units=metric&appid=6ddcb503d301d486291fe5fdaaab80a9");

        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while (in.hasNext()) {
            result += in.nextLine();
        }
        
        JSONObject object = new JSONObject(result);
        model.setName(object.getString("name"));

        JSONObject main = object.getJSONObject("main");
        model.setTemp(main.getDouble("temp"));
        model.setHumidity(main.getDouble("humidity"));
        
        JSONObject wind = object.getJSONObject("wind");
        model.setWindDirectionDouble(wind.getDouble("deg"));
        
        JSONArray getArray = object.getJSONArray("weather");
        for (int i = 0; i < getArray.length(); i++) {
            JSONObject obj = getArray.getJSONObject(i);
            model.setIcon((String) obj.get("icon"));
            model.setDescription((String) obj.get("description"));
        }
        
        WindDirection windDirection = new WindDirection();
        
        return "Город: " + model.getName() + "\n" +
                "Температура: " + model.getTemp() + "℃" + "\n" +
                "Влажность: " + model.getHumidity() + "%" + "\n" +
                "Облачность: " + model.getDescription() + "\n" +
                "Ветер: " + windDirection.windDirection(model.getWindDirectionDouble()) + "\n" +
                "http://openweathermap.org/img/w/" + model.getIcon() + ".png";
    }
}
