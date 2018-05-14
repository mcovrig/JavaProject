package g30126.covrig.mihaela.l8.e4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CarFactory {

	private ObjectOutputStream oStream;
	private ObjectInputStream iStream;
	public CarFactory() {
	}
	Car createCar(String model,int price) {
		Car car=new Car(model, price);
		return car;
	}
	void addCar(Car car,String storeRecipientName) throws IOException
	{
		oStream = new ObjectOutputStream(new FileOutputStream(storeRecipientName));
		oStream.writeObject(car);
		System.out.println("Scris in fisier");
	}
	Car removeCar(String storeRecipientName) throws IOException,ClassNotFoundException
	{
		iStream = new ObjectInputStream(new FileInputStream(storeRecipientName));
		Car car=(Car)iStream.readObject();
		System.out.println("Citit din fisier");
		return car;
	}
}
