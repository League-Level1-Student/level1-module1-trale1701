

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar rC = new RaceCar("ford", 5);
		// 2. Print the RaceCar's position in the race
		System.out.println(rC.getPositionInRace()+"");
		// 3. Crash the RaceCar
		rC.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if(rC.isDamaged()) {rC.pit();}
		// 5. Help the car move into first place.
		for (int i = 1; i < rC.getPositionInRace();) {
			rC.overtake();
		}
	}
}
