package g30126.covrig.mihaela.l5.e3;

import java.util.Random;

public class LightSensor extends Sensor{

	public int readValues() {
		Random random=new Random();
		return random.nextInt(100);
	}

}
