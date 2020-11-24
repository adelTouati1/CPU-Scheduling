import java.util.ArrayList;

/**
 * @author adeltouati
 *
 */
public class PQueue{
	
	private MaxHeap<Process> heapM;
	
	public PQueue() {
		heapM = new MaxHeap<Process>();
	}

	public Process dePQueue() {
		
		return heapM.extractMax();
	}

	public void enPQueue(Process next) {
	heapM.insert(next);
	}

	public void update(int timeToIncrementP, int level) {
		ArrayList<Process> heap = heapM.getMaxHeap();

		for (int i = 0; i < heap.size(); i++) {
			Process m = heap.get(i);
			m.increaseWaitingTime();

			if (m.getwaitingTime() >= timeToIncrementP && m.getPriority() < level) {
				m.updatePriotity(m.getPriority() + 1);
				m.resetTimeNotProcessed();
			}
			heapM.maxHeapP(i);
		}
		
	}
	public int size() {
		return heapM.getSize();
	}
	public boolean isEmpty() {
		return heapM.getSize()==0;
	}

	

}
