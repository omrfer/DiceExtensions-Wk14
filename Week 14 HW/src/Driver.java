
public class Driver {
//Author @ Omar Fernandez
	public static void main(String[] args) {
		TrippleDice dice1 = new TrippleDice();
		TrippleDiceE dice2 = new TrippleDiceE();
		System.out.println(dice1.Roll());
		//return 15
		System.out.println(dice2.Roll());
		//return 18
		System.out.println(dice1);
		//calls dice1 toString method
		System.out.println(dice2);
		//calls dice2 toString method
	}

}
