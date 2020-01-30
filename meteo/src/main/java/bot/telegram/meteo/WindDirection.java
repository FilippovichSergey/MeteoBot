package bot.telegram.meteo;

public class WindDirection {
	
	public String windDirection(Double degree) {
		String windDirection = "";
		if(degree >= 22.5 && degree < 67.5) {
			windDirection = "северо-восточный";
		} else if(degree >= 67.5 && degree < 112.5) {
			windDirection = "восточный";
		} else if(degree >= 112.5 && degree < 157.5) {
			windDirection = "юго-восточный";
		} else if(degree >= 157.5 && degree < 202.5) {
			windDirection = "южный";
		} else if(degree >= 202.5 && degree < 247.5) {
			windDirection = "юго-западный";
		} else if(degree >= 247.5 && degree < 292.5) {
			windDirection = "западный";
		} else if(degree >= 292.5 && degree < 337.5) {
			windDirection = "северо-западный";
		} else {
			windDirection = "северный";
		}
		return windDirection;
	}
	
}