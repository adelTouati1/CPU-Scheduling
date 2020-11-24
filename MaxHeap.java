import java.util.ArrayList;
import java.util.Arrays;

import javax.naming.directory.NoSuchAttributeException;

/**
 * @author adeltouati
 *
 * 
 */
public class MaxHeap<T> {
	
	private ArrayList<Process> heap;
	
    
    int maxSize;
    int curSize;

    public MaxHeap() {
    	heap = new ArrayList<Process>(100);
    }
    
    /**
     * @param index
     */
    public void maxHeapify(int index) {
        int largest = index;
        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;

      
		
		if (rightIndex < curSize) {

			if (heap.get(rightIndex).compareTo(heap.get(index)) == 1) {
				largest = rightIndex;
			}
		}
		  if (leftIndex < curSize) {

				if (heap.get(leftIndex).compareTo(heap.get(index)) == 1) {
					largest = leftIndex;
				} else {
					largest = index;
				}
			}

		if (largest != index) {
			swap(index, largest);
			maxHeapify(largest);

		}
    }
    /**
     * @param i
     */
    public void maxHeapP(int i) {
    	if (i == 0) {
			return;
		}
    	int p = (i - 1) / 2;
		if (p < curSize) {

			if (heap.get(p).compareTo(heap.get(i)) == -1) {
				swap(p, i);
				maxHeapP(p);
			}
		}
    }
    public boolean isEmpty() {
		return (curSize== 0);

	}
    public void insert(Process next) {
    	heap.add(next);
		curSize++;
		maxHeapP(curSize - 1);
    	      
    }

    public ArrayList<Process> getMaxHeap() {
		return heap;
	}

    public Process extractMax() {
     	int j=0;
        if (!heap.isEmpty()){
       	 Process temporary = heap.get(j);
       	 swap(j, curSize-1);
       	 heap.remove(curSize-1);
       	 curSize--;
       	 maxHeapify(j);
       	 return temporary;
       	 
        }else{
   			throw new IllegalArgumentException("No Processer on the list!");
   		}
    }

    public int getSize() {
        return curSize;
    }

   
    private void swap(int firstIndex, int secondIndex) {
        Process temp = heap.get(firstIndex);
        heap.set(firstIndex, heap.get(secondIndex));
		heap.set(secondIndex, temp);
    }


	
}
