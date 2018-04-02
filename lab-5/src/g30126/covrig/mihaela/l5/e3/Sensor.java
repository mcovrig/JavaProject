package g30126.covrig.mihaela.l5.e3;

public abstract class Sensor {
	private String location;

	public Sensor() {
		
	}
	public abstract int readValues();
	public String getLocation() {
		return location;
	}

}
