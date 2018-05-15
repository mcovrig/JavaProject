package g30126.covrig.mihaela.l8.e4;

public class Main {

	public Main() {
	}

	public static void main(String[] args) throws Exception{
		CarFactory carFactory=new CarFactory();
		Car car=carFactory.createCar("Dacia", 10000);
		Car car2=carFactory.createCar("Volvo", 15000);
		carFactory.addCar(car, "car1.dat");
		carFactory.addCar(car2, "car2.dat");
		
		Car car3=carFactory.removeCar("car1.dat");
		System.out.println(car3.toString());
		

	}

}
