

/**
 * @author adeltouati
 *
 */
public class Process {
    
	private int timeR;
	private int pTl;
	private int wT;
	private int arrivingT;
	
	
	public Process(int arrivingT, int timeR, int pTl) {
		this.pTl = pTl;
		this.arrivingT = arrivingT;
		this.timeR = timeR;
		wT = 0;
	}



	/**
	 * @return remaining time 
	 */
	public int getTimeRemaining() {
		return timeR;
	}

	/**
	 * @return priority time 
	 */
	public int getPriority() {
		return pTl;
	}

	public void reduceTimeRemaining() {
		if (timeR >= 1){
			timeR--;
	}
	}

	/**
	 * @return time remaining is 0
	 */
	public boolean finish() {
		return timeR == 0;
	}

	/**
	 * @return arriving time 
	 */
	public int getArrivalTime() {
		return arrivingT;
	}

	public void resetTimeNotProcessed() {
		wT = 0;
	}

	public void increaseWaitingTime() {
		wT++;
		
	}

	public int getwaitingTime() {
		return wT;
	}

	public void updatePriotity(int level) {
		pTl = level;
		
	}

	/**
	 * @param process
	 * 
	 */
	public int compareTo(Process process) {
		if (pTl > process.getPriority()) {
			return 1;
	
		}
		if (pTl == process.getPriority()) {
			if (arrivingT < process.getArrivalTime()) {
				return 1;
			}
		}
		return -1;
	}
	

}
