
public class Main {

	public static void main(String[] args) {
		
		//Thread t = new Thread(new LiftOff());
		//t.start();
		
		//LiftOff cuentaAtras = new LiftOff();
		//cuentaAtras.run();
		int i = 0;
		for( i=0; i<10; i++) {
			
			new Thread(new LiftOff()).start();
			
		}
		System.out.println("Waiting for Lift Out");

	}

}
