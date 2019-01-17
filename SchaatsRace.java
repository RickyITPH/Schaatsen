import java.util.Random;

public class SchaatsRace {

	public static void main(String[] args) {
		Match match = new Match();
		match.winnaar();
	}

}

class Schaatser {
	Random random = new Random();
	private int snelheid = random.nextInt(2) +1;
	static int raceAfstand = 5000;
	private int tijd = (raceAfstand / getSnelheid() );
	
	int getTijd() {
		return tijd;
	}
	
	int getSnelheid() {
		return snelheid;
	}
}


class Match{
	Schaatser schaatser1 = new Schaatser();
	Schaatser schaatser2 = new Schaatser();
	
	void winnaar() {		
		if (schaatser1.getSnelheid() > schaatser2.getSnelheid() ) {
			System.out.println("Schaatser 1 heeft gewonnen met de snelheid van " + schaatser1.getSnelheid() + " km/u over snelheid " + schaatser2.getSnelheid() + " van schaatser 2. De tijd is " + schaatser1.getTijd() + " minuten. ");
		} else if (schaatser1.getSnelheid() < schaatser2.getSnelheid() ) {
			System.out.println("Schaatser 1 heeft gewonnen met de snelheid van " + schaatser2.getSnelheid() + " km/u  over snelheid " + schaatser1.getSnelheid() + " van schaatser 2. De tijd is " + schaatser2.getTijd() + " minuten. ");
		} else {
			System.out.println("Het is gelijkspel met de snelheid van " + schaatser1.getSnelheid() + " km/u. De tijd is " + schaatser1.getTijd() + " minuten. ");
//			rematch via methode rematch
			rematch();
//			rematch intern in winnaar methode
//			Match match3 = new Match();
//			match3.winnaar();
		}
	}
			
	void rematch() {
		Match match3 = new Match();
		match3.winnaar();
	}
}
