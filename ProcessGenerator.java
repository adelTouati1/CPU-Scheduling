import java.util.Random;

/**
 * @author adeltouati
 *
 */
public class ProcessGenerator {

	private double pr;
	Random rand = new Random(0);
	public ProcessGenerator(double probability) {
		if (pr < 0.0 || pr > 1.0) {
			throw new IllegalArgumentException("The probability suppose to be between 0.0 to 1.0 rage.");
		}
		pr = probability;
	}
		 
	

	public Process getNewProcess(int currentTime, int maxProcessTime, int maxLevel) {
		 int prTime;
		 int prcTime;
		 prTime = rand.nextInt(maxLevel) + 1;
		 prcTime = rand.nextInt(maxProcessTime) + 1;

		return new Process(currentTime, prcTime, prTime);
		
	}

	public boolean query() {
		
		return (rand.nextDouble() < pr);
	}

}
