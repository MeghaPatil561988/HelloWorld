package inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		//Bike b = new Bike();
		v.start();
		v.stop();
		Vehicle v1 = new Bike();
		v.start();
		v.stop();
		
	}

}
