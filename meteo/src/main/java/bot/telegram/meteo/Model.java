package bot.telegram.meteo;

public class Model {
	private String name;
	private Double temp;
	private Double humidity;
	private String icon;
	private String description;
	private Double windDirectionDouble;
	private Double speed;

	public Model() {
		super();
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Double getWindDirectionDouble() {
		return windDirectionDouble;
	}

	public void setWindDirectionDouble(Double windDirectionDouble) {
		this.windDirectionDouble = windDirectionDouble;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
